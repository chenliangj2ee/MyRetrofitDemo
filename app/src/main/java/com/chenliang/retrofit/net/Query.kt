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
@Target(AnnotationTarget.TYPEALIAS, AnnotationTarget.VALUE_PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
annotation class Query(val value: String = "")
