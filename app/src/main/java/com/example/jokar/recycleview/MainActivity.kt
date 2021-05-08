package com.example.jokar.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.list_item.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // set the layout manager that this recycle view is used
        recycle_view.layoutManager =  LinearLayoutManager(this)

        val itemAdapter =  ItemAdapter(this,getItemList())

        //adapter instance is set to the recycleview to inflate the item.
        recycle_view.adapter =  itemAdapter
    }


    fun getItemList():ArrayList<String>{

        val list =  ArrayList<String>()

        for(i in 1..15)
            list.add("Item $i")

        return list
    }
}
