package com.workout

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
