package com.domain.set

import com.domain.common.DatabaseReader
import com.workout.AppDatabase
import com.workout.db.Sets

class SetReader(
    database: AppDatabase,
) : DatabaseReader {
    override fun getSingle(id: Long): Sets? {
        TODO("Not yet implemented")
    }

    override fun getAll(): List<Sets> {
        TODO("Not yet implemented")
    }
}
