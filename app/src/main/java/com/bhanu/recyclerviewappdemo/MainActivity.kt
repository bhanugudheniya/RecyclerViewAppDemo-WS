 package com.bhanu.recyclerviewappdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    //access the recyclerview in kotlin file
    lateinit var rv : RecyclerView

    //layoutmanager
    lateinit var linearLayoutManager: LinearLayoutManager
    //adapter
    lateinit var viewAdapter: ViewAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv = findViewById(R.id.rv)

        //initialize
        viewAdapter = ViewAdapter()
        linearLayoutManager = LinearLayoutManager(this)

        //set
        rv.adapter = viewAdapter
        rv.layoutManager = linearLayoutManager
    }
}