package com.domain.common

interface DatabaseReader {
    fun getSingle(id: Long): Any?

    fun getAll(): List<Any>
}
