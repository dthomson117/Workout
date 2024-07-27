package com.domain.workout

import com.domain.common.DatabaseReader
import com.workout.AppDatabase
import com.workout.db.Workout

class WorkoutReader(
    database: AppDatabase,
) : DatabaseReader {
    override fun getSingle(id: Long): Workout? {
        TODO("Not yet implemented")
    }

    override fun getAll(): List<Workout> {
        TODO("Not yet implemented")
    }
}
