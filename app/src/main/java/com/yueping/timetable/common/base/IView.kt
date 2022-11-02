package com.yueping.timetable.common.base

import androidx.lifecycle.ViewModel

interface IView {
    val viewModel: ViewModel

    fun init() {
        initPreparation()
        observeFlow()
        initData()
        initAction()
    }

    fun initPreparation()
    fun observeFlow()
    fun initData()
    fun initAction()
}