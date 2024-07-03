package com.data

import app.cash.sqldelight.db.SqlDriver
import com.database.Day
import com.database.Split

expect class DriverFactory {
    fun createDriver(): SqlDriver
}

fun createDatabase(driverFactory: DriverFactory): AppDatabase {
    val driver = driverFactory.createDriver()
    val database =
        AppDatabase(
            driver = driver,
            DayAdapter = Day.Adapter(dateAdapter = localDateAdapter),
            SplitAdapter = Split.Adapter(colourAdapter = colorAdapter),
        )

    // Do more work with the database (see below).
    return database
}
