package com.domain.split

import com.domain.common.DatabaseReader
import com.workout.AppDatabase
import com.workout.db.Split

class SplitReader(
    database: AppDatabase,
) : DatabaseReader {
    override fun getSingle(id: Long): Split? {
        TODO("Not yet implemented")
    }

    override fun getAll(): List<Split> {
        TODO("Not yet implemented")
    }
}
