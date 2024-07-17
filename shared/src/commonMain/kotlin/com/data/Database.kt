package com.data

import com.workout.db.Day
import kotlinx.datetime.LocalDate

class Database(
    databaseDriverFactory: DriverFactory,
) {
    private val database = createDatabase(databaseDriverFactory)
    private val dbQuery = database.dayQueries

    fun getAllDays(): List<Day> = dbQuery.selectAll(::mapDays).executeAsList()

    private fun mapDays(
        id: Long,
        date: LocalDate,
        progress: Double,
    ): Day =
        Day(
            id,
            date,
            progress,
        )
}
