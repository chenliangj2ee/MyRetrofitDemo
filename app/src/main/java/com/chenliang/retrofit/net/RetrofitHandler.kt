package com.chenliang.retrofit.net

import android.annotation.SuppressLint
import android.os.Build
import android.util.Log
import androidx.annotation.RequiresApi
import java.lang.reflect.InvocationHandler
import java.lang.reflect.Method

/**
 *
 * @Project: MyRetrofit
 * @Package: com.chenliang.retrofit.net
 * @author: chenliang
 * @date: 2021/09/03
 */
class RetrofitHandle() : InvocationHandler {
    @SuppressLint("NewApi")
    override fun invoke(proxy: Any?, method: Method?, args: Array<out Any>?): Any? {
        var annos = method?.annotations

        annos?.forEach {
            if (it is POST) {
                postRequest(it, method, args);
            }
            if (it is GET) {
                getRequest(it, method, args);
            }
        }

        return null;

    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun postRequest(annotation: POST, method: Method?, args: Array<out Any>?) {
        var path = annotation.value
        var params = method?.parameterAnnotations
        Log.i("MyLog", "path:$path")

        var size = params?.size?.minus(1)
        for (i in 0..size!!) {
            var p= params?.get(i)
            p?.forEach {
                if (it is Query) {
                    Log.i("MyLog", "params:${it.value}:${args!![i]}")

                }
            }
        }

    }
    @RequiresApi(Build.VERSION_CODES.O)
    fun getRequest(annotation: GET, method: Method?, args: Array<out Any>?) {
        var path = annotation.value
        var params = method?.parameterAnnotations
        Log.i("MyLog", "path:$path")

        var size = params?.size?.minus(1)
        for (i in 0..size!!) {
            var p= params?.get(i)
            p?.forEach {
                if (it is Query) {
                    Log.i("MyLog", "params:${it.value}:${args!![i]}")

                }
            }
        }
    }
}