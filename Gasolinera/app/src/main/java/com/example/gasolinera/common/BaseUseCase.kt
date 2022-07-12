package com.example.gasolinera.common

abstract class BaseUseCase<params, T> {

    abstract suspend fun execute(params: params):Result<T>
}