package com.yueping.timetable.module.course.data.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.yueping.timetable.common.base.BaseResponse

@Entity
data class CourseEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    @ColumnInfo(name = "name")
    val name: String? = "",
    @ColumnInfo(name = "grade")
    val grade: String? = "",
    @ColumnInfo(name = "sex")
    val sex: String? = "",
    @ColumnInfo(name = "school")
    val school: String? = "",
    @ColumnInfo(name = "score")
    val score: String? = "",
    @ColumnInfo(name = "cultivate")
    val cultivate: String? = "",
    @ColumnInfo(name = "courseTime")
    val courseTime: String? = "",
    @ColumnInfo(name = "classHour")
    val classHour: String? = "",
    @ColumnInfo(name = "summaryClassHour")
    val summaryClassHour: String? = "",
    @ColumnInfo(name = "summaryNumber")
    val summaryNumber: String? = "",
    @ColumnInfo(name = "summary")
    val summary: String? = "",
    @ColumnInfo(name = "remarks")
    val remarks: String? = "",
) : BaseResponse()
