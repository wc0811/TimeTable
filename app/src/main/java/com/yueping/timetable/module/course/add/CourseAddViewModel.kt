package com.yueping.timetable.module.course.add

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.yueping.timetable.module.course.data.CourseEntity
import com.yueping.timetable.module.course.data.usecase.CourseUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class CourseAddViewModel @Inject constructor(private val courseUseCase: CourseUseCase) :
    ViewModel() {
    private val _listCourse = MutableSharedFlow<MutableList<CourseEntity>>()
    val listCourse: SharedFlow<MutableList<CourseEntity>> = _listCourse

    suspend fun reqCourseInfo() {

        viewModelScope.launch {
            val courseEntity = CourseEntity(
                "王超",
                "研三",
                "男",
                "东北林业大学",
                "60分",
                "学大教育",
                "8-10",
                "20h",
                "7次",
                "8888",
                "一共上了7次课",
                "备注：学生很认学"
            )
            val list = mutableListOf<CourseEntity>()
            list.add(courseEntity)
            withContext(Dispatchers.Main) {
                _listCourse.emit(list)
            }
        }
    }
}