package com.data

import app.cash.sqldelight.ColumnAdapter
import com.benasher44.uuid.Uuid
import com.chrynan.colors.Color
import kotlinx.datetime.LocalDate

val localDateAdapter = object : ColumnAdapter<LocalDate, String> {
    override fun decode(databaseValue: String): LocalDate {
        TODO("Not yet implemented")
    }

    override fun encode(value: LocalDate): String {
        TODO("Not yet implemented")
    }
}

val uuidAdapter = object : ColumnAdapter<Uuid, String> {
    override fun decode(databaseValue: String): Uuid {
        TODO("Not yet implemented")
    }

    override fun encode(value: Uuid): String {
        TODO("Not yet implemented")
    }
}

val colorAdapter = object : ColumnAdapter<Color, String> {
    override fun decode(databaseValue: String): Color {
        TODO("Not yet implemented")
    }

    override fun encode(value: Color): String {
        TODO("Not yet implemented")
    }
}