package com.yueping.timetable.module.login

import androidx.activity.viewModels
import androidx.lifecycle.lifecycleScope
import com.dlasit.qamb.app.common.base.BaseActivity
import com.yueping.timetable.BuildConfig
import com.yueping.timetable.R
import com.yueping.timetable.common.ext.*
import com.yueping.timetable.databinding.ActivityLoginBinding
import com.yueping.timetable.module.course.CourseActivity
import com.yueping.timetable.module.login.status.LoginParameterError
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class LoginActivity : BaseActivity<ActivityLoginBinding>() {

    override val viewModel: LoginViewModel by viewModels()
    override fun getViewBinding() = ActivityLoginBinding.inflate(layoutInflater)

    override fun initAction() {
        super.initAction()
        if (BuildConfig.DEBUG) {
            binding.edtUserName.setText("yueping")
            binding.edtUserPassword.setText("123456")
        }
        binding.mainView.setOnClickListener {
            it.hideKeyboard(this)
            binding.edtUserPassword.clearFocus()
            binding.edtUserName.clearFocus()
        }

        binding.btnLogin.noDoubleClickListener {
            lifecycleScope.launch {
                viewModel.login(
                    binding.edtUserName.text.toString(),
                    binding.edtUserPassword.text.toString(),
                    getAndroidDeviceId(context = this@LoginActivity)
                )
            }
        }
    }

    override fun observeFlow() {
        super.observeFlow()
        handleLoginStatus()
        handleLoginParameterError()
    }

    private fun handleLoginParameterError() {
        viewModel.loginParameterError.launchAndCollectIn(this) {
            when (it) {
                LoginParameterError.USERNAME_EMPTY -> showToast(getString(R.string.login_user_name_error))
                LoginParameterError.PASSWORD_EMPTY -> showToast(getString(R.string.login_user_password_error))
                LoginParameterError.PASSWORD_LENGTH_ERROR -> {
                    showToast(getString(R.string.login_user_password_length_error))
                    binding.edtUserPassword.setText("")
                }
            }
        }
    }

    private fun handleLoginStatus() {
        viewModel.loginSuccess.launchAndCollectIn(this) {
            navigateTo<CourseActivity>(isFinish = true)
        }
    }

    private fun clearLoginInfo() {
        with(binding) {
            edtUserName.setText("")
            edtUserPassword.setText("")
        }
    }

    override fun onBackPressed() {
        exitWithDoubleClick()
    }
}