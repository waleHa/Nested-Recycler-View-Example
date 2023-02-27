package com.wa7a.kotlinchallenge1feb.ui

import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.wa7a.kotlinchallenge1feb.R
import com.wa7a.kotlinchallenge1feb.databinding.ActivityMainBinding
import com.wa7a.kotlinchallenge1feb.ui.adapters.ParentAdapter

class MainActivity : BaseActivity<ActivityMainBinding>() {
    override val layoutId: Int = R.layout.activity_main
    lateinit var mainAdapter: ParentAdapter
    lateinit var recyclerView: RecyclerView

    override fun setup() {
        binding.lifecycleOwner = this
        setupRecyclerView()
        setupDataBinding( )
    }

    private fun setupRecyclerView() {
        recyclerView = binding.recyclerViewParent
        mainAdapter = ParentAdapter()
        recyclerView.adapter = mainAdapter
    }

    private fun setupDataBinding() {
        binding.viewModel = viewModel
        viewModel.achievements.observe(this) {
            if (it != null) {
                binding.achievements = it?.body()
            } else {
                Toast.makeText(this, "Error in getting data", Toast.LENGTH_LONG).show()
            }
        }
    }
}