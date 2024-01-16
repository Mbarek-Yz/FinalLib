package com.example.finallib

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform