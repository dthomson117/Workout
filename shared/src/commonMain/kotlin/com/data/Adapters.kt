package com.data

import app.cash.sqldelight.ColumnAdapter
import com.chrynan.colors.Color
import kotlinx.datetime.LocalDate

val localDateAdapter =
    object : ColumnAdapter<LocalDate, String> {
        override fun decode(databaseValue: String): LocalDate = LocalDate.parse(databaseValue)

        override fun encode(value: LocalDate): String = value.toString()
    }

val colorAdapter =
    object : ColumnAdapter<Color, String> {
        override fun decode(databaseValue: String): Color = Color(databaseValue)

        override fun encode(value: Color): String = Color.toString()
    }
