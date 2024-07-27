package com.viewmodels

import androidx.lifecycle.viewModelScope
import com.domain.day.DayReader
import com.domain.day.DayWriter
import com.workout.db.Day
import com.workout.db.Exercise
import com.workout.db.Sets
import com.workout.db.Split
import com.workout.db.Workout
import kotlinx.coroutines.launch
import kotlinx.datetime.LocalDate

class MainViewModel(
    private val dayReader: DayReader,
    private val dayWriter: DayWriter,
) : BaseViewModel<MainViewModelState>(MainViewModelState()) {
    init {
        setState {
            copy(
                days = getDays(),
            )
        }
    }

    private fun getDays(): List<Day> = dayReader.getAll()

    fun removeDay(index: Int) {
        val newDays = uiState.value.days.drop(index)

        setState {
            copy(
                days = newDays,
            )
        }
    }

    fun validateProgress(value: String): Boolean {
        val progress = value.toDouble()
        return !(progress < 0 || progress > 100)
    }

    suspend fun addDay(value: String) {
        viewModelScope.launch {
            dayWriter.insert(
                LocalDate.fromEpochDays(1),
                value.toDouble(),
            )
        }

        setState {
            copy(
                days = dayReader.getAll(),
            )
        }
    }
}

data class MainViewModelState(
    val days: List<Day> = listOf(),
    val sets: List<Sets> = listOf(),
    val splits: List<Split> = listOf(),
    val exercises: List<Exercise> = listOf(),
    val workouts: List<Workout> = listOf(),
)
