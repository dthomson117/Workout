package com.domain.day

import com.domain.common.DatabaseReader
import com.workout.AppDatabase
import com.workout.db.Day

class DayReader(
    database: AppDatabase,
) : DatabaseReader {
    private val query = database.dayQueries

    override fun getAll(): List<Day> = query.selectAll().executeAsList()

    override fun getSingle(id: Long): Day? = query.select(id).executeAsOneOrNull()
}
