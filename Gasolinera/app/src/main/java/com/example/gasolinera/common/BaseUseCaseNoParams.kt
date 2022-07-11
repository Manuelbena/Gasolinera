package com.example.gasolinera.common

abstract class BaseUseCaseNoParams<T> {

    abstract suspend fun execute():Result<T>
}