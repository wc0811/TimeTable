package com.yueping.timetable.module.course.add

import androidx.activity.viewModels
import com.dlasit.qamb.app.common.base.BaseActivity
import com.yueping.timetable.databinding.ActivityCourseAddBinding
import com.yueping.timetable.module.course.list.CourseAdapter
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class CourseAddActivity : BaseActivity<ActivityCourseAddBinding>() {

    override val viewModel: CourseAddViewModel by viewModels()
    override fun getViewBinding() = ActivityCourseAddBinding.inflate(layoutInflater)

    private lateinit var adapter: CourseAdapter

    override fun initView() {
        super.initView()
    }

    override fun initData() {
        super.initData()

    }

    override fun initAction() {
        super.initAction()

    }

    override fun observeFlow() {
        super.observeFlow()
    }

    override fun onResume() {
        super.onResume()

    }

}