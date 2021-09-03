package com.chenliang.retrofit.net

import java.lang.reflect.Proxy

/**
 *
 * @Project: MyRetrofit
 * @Package: com.chenliang.retrofit.net
 * @author: chenliang
 * @date: 2021/09/03
 */
class Retrofit {

    fun <T> newInstance(cls:Class<T>):T {
        return Proxy.newProxyInstance(cls::class.java.classLoader, arrayOf(cls::class.java), RetrofitHandle<T>(cls.newInstance())) as T
    }

}