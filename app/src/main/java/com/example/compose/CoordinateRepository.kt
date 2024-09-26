package com.example.compose

interface CoordinateRepository {
    fun giveHello(): String
}

class CoordinateRepositoryImpl() : CoordinateRepository {
    override fun giveHello() = "Hello Koin"
}