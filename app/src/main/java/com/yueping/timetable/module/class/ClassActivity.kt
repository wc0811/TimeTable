package com.yueping.timetable.module.`class`

import androidx.activity.viewModels
import com.dlasit.qamb.app.common.base.BaseActivity
import com.yueping.timetable.databinding.ActivityClassBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ClassActivity : BaseActivity<ActivityClassBinding>() {

    override val viewModel: ClassViewModel by viewModels()
    override fun getViewBinding() = ActivityClassBinding.inflate(layoutInflater)

    override fun initAction() {
        super.initAction()

    }

    override fun observeFlow() {
        super.observeFlow()

    }


}