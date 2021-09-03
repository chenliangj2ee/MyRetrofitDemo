package com.chenliang.retrofit

import com.chenliang.retrofit.bean.BeanUser
import com.chenliang.retrofit.net.GET
import com.chenliang.retrofit.net.POST
import com.chenliang.retrofit.net.Query
import com.chenliang.retrofit.net.Response

/**
 *
 * @Project: MyRetrofit
 * @Package: com.chenliang.retrofit
 * @author: chenliang
 * @date: 2021/09/03
 */
interface ApiService {
    @POST("app/login")
    fun login(
        @Query("QueryName") name: String,
        @Query("QueryPass") pass: String
    ): Response<BeanUser>
    @GET("app/register")
    fun register(
        @Query("QueryPhone") name: String,
        @Query("QueryPassword") pass: String
    ): Response<BeanUser>
}