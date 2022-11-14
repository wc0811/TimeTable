package com.yueping.timetable.splash

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SplashViewModel @Inject constructor() : ViewModel() {
    private val _navigateToNext = MutableStateFlow(false)
    val navigateToNext: StateFlow<Boolean> = _navigateToNext

    fun displaySplashView() {
        viewModelScope.launch(Dispatchers.Default) {
            delay(DISPLAY_LENGTH)
            _navigateToNext.value = true
        }
    }

    companion object {
        const val DISPLAY_LENGTH = 2_000L
    }
}