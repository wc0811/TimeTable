package com.yueping.timetable.module

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.yueping.timetable.common.ext.navigateTo
import com.yueping.timetable.databinding.ActivitySplashBinding
import com.yueping.timetable.module.login.LoginActivity

@SuppressLint("CustomSplashScreen")
class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val splashScreen = installSplashScreen()
        super.onCreate(savedInstanceState)
        savedInstanceState?.let {
            finish()
        }
        val binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)
        splashScreen.setKeepOnScreenCondition { true }
        navigateTo<LoginActivity>(isFinish = true)
    }
}