package com.bhanu.recyclerviewappdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class CustomAdapter : AppCompatActivity() {

    //access the views inside the layout you created
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_adapter)
    }
}