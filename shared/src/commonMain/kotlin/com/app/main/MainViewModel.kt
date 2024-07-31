package com.app.main

import androidx.lifecycle.viewModelScope
import com.app.common.BaseViewModel
import com.domain.day.DayReader
import com.domain.day.DayWriter
import com.workout.db.Day
import com.workout.db.Exercise
import com.workout.db.Sets
import com.workout.db.Split
import com.workout.db.Workout
import io.github.aakira.napier.Napier
import kotlinx.coroutines.launch
import kotlinx.datetime.LocalDate

class MainViewModel(
    private val dayReader: DayReader,
    private val dayWriter: DayWriter
) : BaseViewModel<MainViewModelState>(MainViewModelState()) {
    init {
        updateDays()
    }

    fun handleUiEvent(event: MainUiEvents) {
        viewModelScope.launch {
            when (event) {
                is MainUiEvents.SubmitProgress -> addDay(event.progress)
                is MainUiEvents.ValidateProgress -> validateProgress(event.progress)
                is MainUiEvents.RefreshDays -> updateDays()
            }
        }
    }

    private fun updateDays() {
        setState {
            copy(
                days = getDays()
            )
        }
    }

    private fun getDays(): List<Day> = dayReader.getAll()

    fun removeDay(index: Int) {
        val newDays = uiState.value.days.drop(index)

        setState {
            copy(
                days = newDays
            )
        }
    }

    fun validateProgress(value: String) {
        var valid: Boolean
        if (value.isEmpty()) {
            valid = false
        }

        val trimmedValue = value.trim()

        try {
            val progress = trimmedValue.toDouble()
            valid = (progress in 0.0..100.0)
        } catch (e: Exception) {
            Napier.w(tag = this::class.simpleName, message = "Invalid input")
            valid = false
        }

        setState {
            copy(
                validProgress = valid
            )
        }
    }

    private suspend fun addDay(value: String) {
        if (!uiState.value.validProgress) {
            return
        }

        viewModelScope.launch {
            dayWriter.insert(
                LocalDate.fromEpochDays(1),
                value.toDouble()
            )
        }

        setState {
            copy(
                days = dayReader.getAll()
            )
        }
    }

    sealed interface MainUiEvents {
        data class SubmitProgress(
            val progress: String
        ) : MainUiEvents

        data class ValidateProgress(
            val progress: String
        ) : MainUiEvents

        data object RefreshDays : MainUiEvents
    }
}

data class MainViewModelState(
    val days: List<Day> = listOf(),
    val sets: List<Sets> = listOf(),
    val splits: List<Split> = listOf(),
    val exercises: List<Exercise> = listOf(),
    val workouts: List<Workout> = listOf(),
    val validProgress: Boolean = true
)
