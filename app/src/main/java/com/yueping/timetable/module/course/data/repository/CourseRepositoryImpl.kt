package com.yueping.timetable.module.course.data.repository

import com.yueping.timetable.module.course.data.room.CourseEntity
import javax.inject.Inject

class CourseRepositoryImpl @Inject constructor() : ICourseRepository {
    override suspend fun getCourseInfo(): CourseEntity {
        return CourseEntity()
    }
}