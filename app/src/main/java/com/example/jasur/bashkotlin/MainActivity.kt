package com.example.jasur.bashkotlin

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        click.setOnClickListener { nextPage() }
}

    fun nextPage(){

        val sled: Intent = Intent(applicationContext, Second::class.java)
        val getName = name.text.toString()
        sled.putExtra("jk", getName)
        startActivity(sled)

    }
}