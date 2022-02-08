package com.example.tabs

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

internal class MyPagerAdapter(
    var context: Context,
    fragmentManager: FragmentManager,
    var totalTabs : Int) : FragmentPagerAdapter(fragmentManager) {

    override fun getCount(): Int {
        return totalTabs
    }

    override fun getItem(position: Int): Fragment {
        return when(position) {
            0 -> AboutFragment()
            1 -> StudentListFragment()
            else -> TableCustomFragment()
        }
    }
}