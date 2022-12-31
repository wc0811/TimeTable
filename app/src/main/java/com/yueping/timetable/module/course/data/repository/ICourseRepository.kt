package com.yueping.timetable.module.course.data.repository

import com.yueping.timetable.module.course.data.room.CourseEntity

interface ICourseRepository {
    suspend fun getCourseInfo(): CourseEntity
}