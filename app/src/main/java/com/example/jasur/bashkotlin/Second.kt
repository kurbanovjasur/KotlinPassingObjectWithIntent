package com.example.jasur.bashkotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class Second : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val income: Intent = intent
        val setName = income.getStringExtra("jk")
        resultfirst.text = "hey $setName"

    }
}
