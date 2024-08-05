package com.data

import app.cash.sqldelight.db.SqlDriver
import com.workout.AppDatabase
import com.workout.db.Day
import com.workout.db.Split

@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
expect class DatabaseDriverFactory {
    fun createDriver(): SqlDriver
}

fun createDatabase(databaseDriverFactory: DatabaseDriverFactory): AppDatabase {
    val driver = databaseDriverFactory.createDriver()
    val database =
        AppDatabase(
            driver = driver,
            DayAdapter = Day.Adapter(dateAdapter = localDateAdapter),
            SplitAdapter = Split.Adapter(colourAdapter = colorAdapter),
        )

    // Do more work with the database (see below).
    return database
}
