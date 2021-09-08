package com.example.plugins

import io.ktor.application.*
import io.ktor.features.*

fun Application.ConfigureDefaultHeader() {
    install(DefaultHeaders)
}