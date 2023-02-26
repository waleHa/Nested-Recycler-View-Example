package com.wa7a.kotlinchallenge1feb.ui

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModelProvider
import com.wa7a.kotlinchallenge1feb.viewmodel.MainViewModel

abstract class BaseActivity<VB : ViewDataBinding> : AppCompatActivity() {
    private val LOG_TAG: String = "BaseActivity"
    protected lateinit var binding: VB
    abstract val layoutId: Int
    protected val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, layoutId);

        setup()
    }

    abstract fun setup()

    protected fun log(value: String) {
        Log.v(LOG_TAG, value)
    }
}