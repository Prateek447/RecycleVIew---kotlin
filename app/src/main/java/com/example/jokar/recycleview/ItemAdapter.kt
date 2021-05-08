package com.example.jokar.recycleview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_item.view.*

class ItemAdapter(val context: Context, val item : ArrayList<String>) : RecyclerView.Adapter<ItemAdapter.ViewHolder>(){



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(context).inflate(R.layout.list_item,parent,false)
        )
    }

    override fun getItemCount(): Int {
        return item.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val item =  item.get(position)

        holder.tvItem.text =  item

        if (position%2 == 0){
            holder.cardItem.setBackgroundColor(ContextCompat.getColor(context,R.color.lightGrey))
        }
        else{
            holder.cardItem.setBackgroundColor(ContextCompat.getColor(context,R.color.colorWhite))
        }
    }





    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val  tvItem =  view.tv_item_name
        val cardItem =  view.card_view
    }
}




