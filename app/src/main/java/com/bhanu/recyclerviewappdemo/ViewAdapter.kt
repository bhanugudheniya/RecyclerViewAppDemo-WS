package com.bhanu.recyclerviewappdemo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

//normal class
// 1.) inherit recyclerview.adapter
// 2.) add a viewholder class in adapter <>
// 3.) resolve errors => create class ViewHolder
// 5.) right click on class ViewAdapter error => show context action s=> resolve
class ViewAdapter : RecyclerView.Adapter<ViewAdapter.MyViewHolder>() {
    // 4.) inherit the recyclerview.viewholder along with default constructor

    // 6.) Add Static DATA
    var names = arrayOf("Android", "Kotlin", "Java", "Angualr",
        "Android", "Kotlin", "Java", "Angualr",
        "Android", "Kotlin", "Java", "Angualr",
        "Android", "Kotlin", "Java", "Angualr",
        "Android", "Kotlin", "Java", "Angualr",
        "Android", "Kotlin", "Java", "Angualr")

    //  9.) WE ACCESS THE VIEWS INSODE THE LAYOUT
    class MyViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView){
        var textView : TextView
        init {
            textView = itemView.findViewById(R.id.textView)
        }
    }


    // 8.) INFLATE THE LAYOUT
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        var view_layout = LayoutInflater.from(parent.context).inflate(R.layout.view_layout,parent, false)
        return MyViewHolder(view_layout)
    }

    // 10.) BIND THE VIEWS TO THE DATA
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.textView.text = names[position]
    }

    // 7.) TOTAL ITEM COUNT
    override fun getItemCount(): Int {
        return names.count()
    }
}