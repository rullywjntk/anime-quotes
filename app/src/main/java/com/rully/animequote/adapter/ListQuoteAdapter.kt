package com.rully.animequote.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.rully.animequote.R
import com.rully.animequote.data.Quote

class ListQuoteAdapter(private val listQuote: ArrayList<Quote>) : RecyclerView.Adapter<ListQuoteAdapter.ViewHolder>() {


    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var ivPhoto: ImageView = itemView.findViewById(R.id.ivItem)
        var tvQuote: TextView = itemView.findViewById(R.id.tvItem)
        var tvName: TextView = itemView.findViewById(R.id.tvName)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_quotes, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val (photo, quote, name) = listQuote[position]
        holder.ivPhoto.setImageResource(photo)
        holder.tvQuote.text = quote
        holder.tvName.text = name
    }

    override fun getItemCount(): Int = listQuote.size
}