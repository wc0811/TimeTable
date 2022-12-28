package com.yueping.timetable.module.course.add

import androidx.activity.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.dlasit.qamb.app.common.base.BaseActivity
import com.scwang.smart.refresh.header.ClassicsHeader
import com.yueping.timetable.common.ext.launchAndCollectIn
import com.yueping.timetable.common.ext.noDoubleClickListener
import com.yueping.timetable.databinding.ActivityCourseAddBinding
import com.yueping.timetable.databinding.ActivityCourseBinding
import com.yueping.timetable.module.course.CourseViewModel
import com.yueping.timetable.module.course.data.CourseEntity
import com.yueping.timetable.module.course.list.CourseAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch


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