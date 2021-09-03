package com.chenliang.retrofit.net

import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy

/**
 *
 * @Project: MyRetrofit
 * @Package: com.chenliang.retrofit.net
 * @author: chenliang
 * @date: 2021/09/03
 */
@Target(AnnotationTarget.FUNCTION)
@Retention(RetentionPolicy.RUNTIME)
annotation class GET(val value: String = "")
