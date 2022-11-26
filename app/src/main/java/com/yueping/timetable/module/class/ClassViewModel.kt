package com.yueping.timetable.module.`class`

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow
import javax.inject.Inject

@HiltViewModel
class ClassViewModel @Inject constructor() : ViewModel() {

    private val _listClass = MutableSharedFlow<List<String>>()
    val listClass: SharedFlow<List<String>> = _listClass

}