package com.example.tabapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
//import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var pageAdapter : SectionPagerAdapter
    private lateinit var pager : ViewPager
    private lateinit var tabLayout : TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pageAdapter = SectionPagerAdapter(supportFragmentManager)
        pager = findViewById(R.id.pager)
        tabLayout = findViewById(R.id.tabs)
        tabLayout.setupWithViewPager(pager)
    }
}