package com.example.singuppractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class MainActivity : BasicActivity() {


    override fun setupEvents() {

    }

    override fun setValues() {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }
}


