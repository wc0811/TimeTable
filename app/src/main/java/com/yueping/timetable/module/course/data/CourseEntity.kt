package com.yueping.timetable.module.course.data

import com.yueping.timetable.common.base.BaseResponse
import java.io.Serializable

data class CourseEntity(
    val name: String? = "",
    val grade: String? = "",
    val sex: String? = "",
    val school: String? = "",
    val score: String? = "",
    val cultivate: String? = "",
    val courseTime: String? = "",
    val classHour: String? = "",
    val summaryClassHour: String? = "",
    val summaryNumber: String? = "",
    val summary: String? = "",
    val remarks: String? = "",
) : BaseResponse()
