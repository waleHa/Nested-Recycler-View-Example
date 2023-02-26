package com.wa7a.kotlinchallenge1feb.ui.adapters

import android.util.Log
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.lifecycle.LiveData
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.wa7a.kotlinchallenge1feb.data.model.Data
import com.wa7a.kotlinchallenge1feb.data.model.Record

@BindingAdapter("imageSetter")
fun ImageView.imageSetter(url: String) {
    Log.i("WA77a BindingAdapter", url)
    Glide.with(this).load(url).into(this)
}


//@BindingAdapter("setContentList")
//fun <T> RecyclerView.setContentList(list: List<T>) {
//    when (T::class) {
//        Data::class -> {
//            val parentAdapter = ParentAdapter(list.toMutableList() as MutableList<Data>)
//            adapter = parentAdapter
//        }
//        Record::class -> {
//            val childAdapter = ChildAdapter(list.toMutableList() as MutableList<Record>)
//            adapter = childAdapter
//        }
//    }
//}


@BindingAdapter("setRecord")
fun RecyclerView.setRecords(records: List<Record>?) {
    if (records != null) {
        val recordAdapter = ChildAdapter()
        recordAdapter.setContentList(records.toMutableList())
        adapter = recordAdapter
    }
}

@BindingAdapter("setData")
fun RecyclerView.setData(data: List<Data>?) {
    if (data != null) {
        val dataAdapter = ParentAdapter()
        dataAdapter.setContentList(data.toMutableList())
        adapter = dataAdapter
    }
}