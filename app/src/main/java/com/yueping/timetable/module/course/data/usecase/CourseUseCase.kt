package com.yueping.timetable.module.course.data.usecase

import com.dlasit.qamb.app.common.base.BaseUseCase
import com.yueping.timetable.common.base.BaseRequest
import com.yueping.timetable.common.base.BaseResponse
import com.yueping.timetable.module.course.data.repository.ICourseRepository
import javax.inject.Inject

class CourseUseCase @Inject constructor(private val courseRepository: ICourseRepository) :
    BaseUseCase<BaseRequest> {
    //    override suspend fun execute(baseRequest: BaseRequest) {
//        try {
//            val result = courseRepository.getCourseInfo()
//            callback.onSuccess(result)
//        } catch (e: Exception) {
//            callback.onError(e)
//        }
//    }
    override suspend fun execute(params: BaseRequest) {
    }
}