package com.example.tabapplication


import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class SectionPagerAdapter(manager : FragmentManager)
    : FragmentPagerAdapter(manager) {

    override fun getCount() = 3

    override fun getItem(position: Int): Fragment =
         when (position) {
            0 -> FirstFragment()
            1 -> SecondFragment()
            2 -> ThirdFragment()
            else -> FirstFragment()
        }

    override fun getPageTitle(position: Int)=
        when (position) {
            0 -> "About"
            1 -> "List"
            2 -> "Table"
            else -> "Lost"
        }
}