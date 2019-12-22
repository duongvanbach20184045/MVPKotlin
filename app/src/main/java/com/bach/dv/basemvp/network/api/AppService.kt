package com.bach.dv.basemvp.network.api

import com.bach.dv.basemvp.network.BaseResponse
import com.bach.dv.basemvp.network.GetUserResponse
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface AppService {
    @GET("api/user/")
    fun getUser(@Query("token") token: String, @Query("id_detail") idDetail: String): Observable<BaseResponse<GetUserResponse>>
}