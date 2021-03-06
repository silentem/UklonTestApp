package com.whaletail.uklon.test.util


enum class DataState { SUCCESS, ERROR }

data class RawData<out T, out F> constructor(
        val dataState: F,
        val data: T? = null,
        val message: String? = null)

data class Data<out T> constructor(val dataState: DataState = DataState.SUCCESS,
                                   val data: T? = null,
                                   val message: String? = null)