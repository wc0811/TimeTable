package com.yueping.timetable.module.course.data.repository

import com.yueping.timetable.module.course.data.CourseEntity

interface ICourseRepository {
    suspend fun getCourseInfo(): CourseEntity
}