package com.yueping.timetable.module.course

import androidx.activity.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.dlasit.qamb.app.common.base.BaseActivity
import com.scwang.smart.refresh.header.ClassicsHeader
import com.yueping.timetable.common.ext.launchAndCollectIn
import com.yueping.timetable.databinding.ActivityCourseBinding
import com.yueping.timetable.module.course.data.CourseEntity
import com.yueping.timetable.module.course.list.CourseAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch


@AndroidEntryPoint
class CourseActivity : BaseActivity<ActivityCourseBinding>() {

    override val viewModel: CourseViewModel by viewModels()
    override fun getViewBinding() = ActivityCourseBinding.inflate(layoutInflater)

    private lateinit var adapter: CourseAdapter

    override fun initView() {
        super.initView()
        setRecyclerView()
    }

    override fun initData() {
        super.initData()
        binding.smartRefreshLayout.setRefreshHeader(ClassicsHeader(this))
        binding.smartRefreshLayout.setOnRefreshListener {
            lifecycleScope.launch {
                viewModel.reqCourseInfo()
            }
        }
    }

    override fun initAction() {
        super.initAction()

    }

    override fun observeFlow() {
        super.observeFlow()
        viewModel.listCourse.launchAndCollectIn(this) {
            adapter.updateData(it)
        }

    }

    override fun onResume() {
        super.onResume()

    }

    private fun setRecyclerView() {
        binding.rclClass.layoutManager = LinearLayoutManager(this)
        adapter = CourseAdapter()
        binding.rclClass.adapter = adapter
        var list: MutableList<CourseEntity> = mutableListOf()
        adapter.updateData(list)
    }

}