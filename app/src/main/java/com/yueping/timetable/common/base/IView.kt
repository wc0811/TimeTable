package com.yueping.timetable.common.base

import androidx.lifecycle.ViewModel

interface IView {
    val viewModel: ViewModel

    fun init() {
        initPreparation()
        initView()
        observeFlow()
        initData()
        initAction()
    }

    fun initPreparation()
    fun initView()
    fun observeFlow()
    fun initData()
    fun initAction()
}