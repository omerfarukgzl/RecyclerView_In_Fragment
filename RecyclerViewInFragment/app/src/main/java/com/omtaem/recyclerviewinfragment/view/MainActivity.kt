package com.omtaem.recyclerviewinfragment.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.omtaem.recyclerviewinfragment.R
import com.omtaem.recyclerviewinfragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction()
            .add(R.id.frameLayout, PostListFragment()).commit()
    }
}