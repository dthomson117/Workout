package com.domain.exercise

import com.domain.common.DatabaseReader
import com.workout.AppDatabase
import com.workout.db.Exercise

class ExerciseReader(
    database: AppDatabase,
) : DatabaseReader {
    override fun getSingle(id: Long): Exercise? {
        TODO("Not yet implemented")
    }

    override fun getAll(): List<Exercise> {
        TODO("Not yet implemented")
    }
}
