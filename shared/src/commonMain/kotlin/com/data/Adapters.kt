package com.data

import app.cash.sqldelight.ColumnAdapter
import com.benasher44.uuid.Uuid
import com.benasher44.uuid.uuidFrom
import com.chrynan.colors.Color
import kotlinx.datetime.LocalDate

val localDateAdapter = object : ColumnAdapter<LocalDate, String> {
    override fun decode(databaseValue: String): LocalDate {
        return LocalDate.parse(databaseValue)
    }

    override fun encode(value: LocalDate): String {
        return value.toString()
    }
}

val uuidAdapter = object : ColumnAdapter<Uuid, String> {
    override fun decode(databaseValue: String): Uuid {
        return uuidFrom(databaseValue)
    }

    override fun encode(value: Uuid): String {
        return value.toString()
    }
}

val colorAdapter = object : ColumnAdapter<Color, String> {
    override fun decode(databaseValue: String): Color {
        return Color(databaseValue)
    }

    override fun encode(value: Color): String {
        return Color.toString()
    }
}
