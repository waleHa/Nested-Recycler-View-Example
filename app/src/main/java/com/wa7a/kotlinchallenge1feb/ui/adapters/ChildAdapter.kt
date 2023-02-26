package com.wa7a.kotlinchallenge1feb.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.wa7a.kotlinchallenge1feb.R
import com.wa7a.kotlinchallenge1feb.data.model.Record
import com.wa7a.kotlinchallenge1feb.databinding.ChildItemBinding

//class ChildAdapter(items:MutableList<Record?>): BaseAdapter<Record?>(items) {
//    override val layoutId: Int
//        get() = R.layout.child_item
//}

class ChildAdapter() :
    RecyclerView.Adapter<ChildAdapter.MedalViewHolder>() {

    private var records = mutableListOf <Record>()

    fun setContentList(record:MutableList<Record>){
        this.records = record
        notifyDataSetChanged()
    }

    inner class MedalViewHolder(val binding: ChildItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Record) {
            binding.item = item
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MedalViewHolder {
        val view = LayoutInflater.from(parent.context)
        val listItemBinding = ChildItemBinding.inflate(view, parent, false)
        return MedalViewHolder(listItemBinding)
    }


    override fun getItemCount(): Int {
        return records.map { record -> record.active }.size
    }

    override fun onBindViewHolder(holder: MedalViewHolder, position: Int) {
//                val currentRecord = records[position]
        holder.bind(records[position])
    }
}