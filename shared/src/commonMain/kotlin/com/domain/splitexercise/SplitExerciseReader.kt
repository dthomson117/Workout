package com.domain.splitexercise

import com.domain.common.DatabaseReader
import com.workout.AppDatabase
import com.workout.db.Split_Exercise

class SplitExerciseReader(
    database: AppDatabase,
) : DatabaseReader {
    override fun getSingle(id: Long): Split_Exercise? {
        TODO("Not yet implemented")
    }

    override fun getAll(): List<Split_Exercise> {
        TODO("Not yet implemented")
    }
}
