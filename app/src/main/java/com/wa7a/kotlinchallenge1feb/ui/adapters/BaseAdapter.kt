package com.wa7a.kotlinchallenge1feb.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.wa7a.kotlinchallenge1feb.BR
import com.wa7a.kotlinchallenge1feb.data.model.Data

abstract class BaseAdapter<T>(
    private var items: MutableList<T?>,
) : RecyclerView.Adapter<BaseAdapter.BaseViewHolder>() {

    abstract val layoutId: Int

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        return ItemViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                layoutId,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
        val currentItem = items[position]
        when (holder) {
            is ItemViewHolder -> {
                holder.binding.setVariable(BR.item, currentItem)
            }
        }
    }

    class ItemViewHolder(val binding: ViewDataBinding) : BaseViewHolder(binding)

    fun setItems(newItems: MutableList<T?>) {
        items = newItems
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int = items.size

    fun getItems() = items

    abstract class BaseViewHolder(binding: ViewDataBinding) : RecyclerView.ViewHolder(binding.root)
}

interface BaseInteractionListener
