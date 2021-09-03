package com.chenliang.retrofit.net

import java.lang.reflect.InvocationHandler
import java.lang.reflect.Method

/**
 *
 * @Project: MyRetrofit
 * @Package: com.chenliang.retrofit.net
 * @author: chenliang
 * @date: 2021/09/03
 */
class RetrofitHandle<T>(val obj: T) : InvocationHandler {
    override fun invoke(proxy: Any?, method: Method?, args: Array<out Any>?): Any? {

        return if (args != null) {
            method?.invoke(obj, *args)
        } else {
            method?.invoke(obj)
        }

    }

}