package com.yueping.timetable.module.course.di

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.yueping.timetable.module.course.data.repository.CourseRepositoryImpl
import com.yueping.timetable.module.course.data.repository.ICourseRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {

    @Singleton
    @Provides
    fun provideGsonBuilder(): Gson {
        return GsonBuilder()
            .excludeFieldsWithoutExposeAnnotation()
            .create()
    }

    @Singleton
    @Provides
    fun providesCourseRepositoryImpl(courseRepositoryImpl: CourseRepositoryImpl): ICourseRepository {
        return courseRepositoryImpl
    }

}