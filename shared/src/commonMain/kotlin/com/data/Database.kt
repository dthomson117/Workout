package com.data

import com.workout.db.Day
import kotlinx.datetime.LocalDate

class Database(
    databaseDriverFactory: DriverFactory,
) {
    private val database = createDatabase(databaseDriverFactory)
    private val dbDayQuery = database.dayQueries
    private val dbSplitQuery = database.splitQueries

    fun getAllDays(): List<Day> = dbDayQuery.selectAll(::mapDays).executeAsList()

    suspend fun addPplSplit() {
        dbSplitQuery.addDefaultPPL()
    }

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
