package com.wa7a.kotlinchallenge1feb.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.wa7a.kotlinchallenge1feb.data.model.Data
import com.wa7a.kotlinchallenge1feb.databinding.ParentItemBinding


//class ParentAdapter(items: MutableList<Data?>) : BaseAdapter<Data>(items) {
//    override val layoutId: Int
//        get() = R.layout.parent_item
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
//        val binding = DataBindingUtil.inflate<ParentItemBinding>(
//            LayoutInflater.from(parent.context),
//            layoutId,
//            parent,
//            false
//        )
//        binding.item =
//            return ItemViewHolder(binding)
//    }
//
//
//}


class ParentAdapter() :
    RecyclerView.Adapter<ParentAdapter.MainViewHolder>() {
    private var data = mutableListOf<Data>()

    fun setContentList(data: MutableList<Data>?) {
        this.data = requireNotNull(data)
        notifyDataSetChanged()
    }

    inner class MainViewHolder(val binding: ParentItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Data) {
            binding.item = item
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val view = LayoutInflater.from(parent.context)
        val listItemBinding = ParentItemBinding.inflate(view, parent, false)
        return MainViewHolder(listItemBinding)
    }

    override fun getItemCount(): Int {
        return this.data.size
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val currentData = this.data[position]
        holder.bind(currentData)
    }
}