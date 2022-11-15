package com.yueping.timetable.login

import androidx.lifecycle.ViewModel
import com.yueping.timetable.login.status.LoginParameterError
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor() : ViewModel() {

    private val _loginSuccess = MutableSharedFlow<Boolean>()
    val loginSuccess: SharedFlow<Boolean> = _loginSuccess

    private val _loginParameterError = MutableSharedFlow<LoginParameterError>()
    val loginParameterError: SharedFlow<LoginParameterError> = _loginParameterError

    suspend fun login(userName: String?, password: String?, deviceId: String) {
        if (userName.isNullOrBlank()) {
            _loginParameterError.emit(LoginParameterError.USERNAME_EMPTY)
            return
        }
        if (password.isNullOrBlank()) {
            _loginParameterError.emit(LoginParameterError.PASSWORD_EMPTY)
            return
        }
        if (password.length !in PASSWORD_LENGTH_MIN..PASSWORD_LENGTH_MAX) {
            _loginParameterError.emit(LoginParameterError.PASSWORD_LENGTH_ERROR)
            return
        }
        if (userName == "yueping" && password == "123456" && deviceId == "01234567890123456789") {
            _loginSuccess.emit(true)
        }
    }

    companion object {
        const val PASSWORD_LENGTH_MIN = 6
        const val PASSWORD_LENGTH_MAX = 20
    }
}