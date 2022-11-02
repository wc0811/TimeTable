package com.dlasit.qamb.app.common.base

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding
import com.yueping.timetable.R
import com.yueping.timetable.common.Constants.WAIT_TIME
import com.yueping.timetable.common.base.IView

abstract class BaseActivity<BindingType : ViewBinding> : AppCompatActivity(), IView {
    protected lateinit var binding: BindingType

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        beforeSetView(savedInstanceState)
        binding = getViewBinding()
        setContentView(binding.root)
        init()
    }

    abstract fun getViewBinding(): BindingType

    protected open fun beforeSetView(savedInstanceState: Bundle?) {
    }

    override fun initPreparation() {
    }

    override fun initData() {
    }

    override fun observeFlow() {
    }

    override fun initAction() {

    }

    private var mTouchTime: Long = 0

    protected fun exitWithDoubleClick(): Boolean {
        if (System.currentTimeMillis() - mTouchTime < WAIT_TIME) {
            finish()
        } else {
            mTouchTime = System.currentTimeMillis()
            Toast.makeText(this, getString(R.string.double_exit), Toast.LENGTH_SHORT).show()
        }
        return true
    }
}