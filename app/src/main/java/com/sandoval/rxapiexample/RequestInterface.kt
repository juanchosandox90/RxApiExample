package com.sandoval.rxapiexample


import io.reactivex.Single
import retrofit2.http.GET

interface RequestInterface {

    @GET("api/android")
    fun getData(): Single<List<Android>>
}