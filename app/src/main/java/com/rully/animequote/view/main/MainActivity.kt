package com.rully.animequote.view.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rully.animequote.databinding.ActivityMainBinding
import com.rully.animequote.adapter.ListQuoteAdapter
import com.rully.animequote.data.Constant

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var rvQuotes: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        rvQuotes = binding.rvQuotes
        rvQuotes.setHasFixedSize(true)
        getListQuote()
    }

    private fun getListQuote() {
        rvQuotes.layoutManager = LinearLayoutManager(this)
        val listQuoteAdapter = ListQuoteAdapter(Constant.quoteList)
        rvQuotes.adapter = listQuoteAdapter
    }
}