package com.domain.day

import com.workout.AppDatabase
import kotlinx.datetime.LocalDate

class DayWriter(
    database: AppDatabase,
) {
    private val query = database.dayQueries

    suspend fun insert(
        date: LocalDate,
        progress: Double,
    ) {
        query.insert(null, date, progress)
    }
}
