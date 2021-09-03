package com.chenliang.retrofit

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.chenliang.retrofit.net.Retrofit

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        login()
    }


    fun login() {
        var api = Retrofit().newInstance(ApiService::class.java)
        api.login("chenliang", "123456")
    }
}