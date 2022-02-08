package com.example.tabapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView
import android.support.v4.app.Fragment

class ThirdFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val table = TableLayout(activity)
        for (i in 1..10) {
            val row = TableRow(activity)
            for (j in 1..10) {
                val tv = TextView(activity)
                tv.text = (i * j).toString()
                row.addView(tv)
            }
            table.addView(row)
        }
        return table
    }
}