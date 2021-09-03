package com.chenliang.retrofit

import com.chenliang.retrofit.bean.BeanUser
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
        @Query("name") name: String,
        @Query("pass") pass: String
    ): Response<BeanUser>
}