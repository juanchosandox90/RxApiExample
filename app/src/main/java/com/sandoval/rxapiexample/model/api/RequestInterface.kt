package com.sandoval.rxapiexample.model.api


import com.sandoval.rxapiexample.model.data.Android
import io.reactivex.Single
import retrofit2.http.GET

interface RequestInterface {

    @GET("api/android")
    fun getData(): Single<List<Android>>
}