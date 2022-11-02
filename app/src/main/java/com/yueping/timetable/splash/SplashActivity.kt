package com.yueping.timetable.splash

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.lifecycleScope
import com.dlasit.qamb.app.common.base.BaseActivity
import com.yueping.timetable.common.ext.navigateTo
import com.yueping.timetable.databinding.ActivitySplashBinding
import dagger.hilt.android.AndroidEntryPoint

@SuppressLint("CustomSplashScreen")
@AndroidEntryPoint
class SplashActivity : BaseActivity<ActivitySplashBinding>() {

    override val viewModel: SplashViewModel by viewModels()
    override fun getViewBinding() = ActivitySplashBinding.inflate(layoutInflater)

    override fun initData() {
        super.initData()
        viewModel.displaySplashView()
    }

    override fun observeFlow() {
        super.observeFlow()
        lifecycleScope.launchWhenResumed {
            viewModel.navigateToNext.collect {
                if (it) {
                    navigateTo<SplashActivity>(isFinish = true)
                }
            }
        }
    }

    override fun beforeSetView(savedInstanceState: Bundle?) {
        savedInstanceState?.let {
            finish()
        }
    }
}