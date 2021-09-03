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

    fun <T> newInstance(clazz: Class<T>): T {
        return Proxy.newProxyInstance(
            clazz.classLoader,
            arrayOf<Class<*>>(clazz),
            RetrofitHandle()
        ) as T
    }

}