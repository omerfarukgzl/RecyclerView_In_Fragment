package com.omtaem.recyclerviewinfragment.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.omtaem.recyclerviewinfragment.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction()
            .add(R.id.frameLayout, PostListFragment()).commit()
    }
}