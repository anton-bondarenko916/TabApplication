package com.example.tabs

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView

class TableCustomFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?): View {

        val students = resources.getStringArray(R.array.students_array)
        val NUMBER_OF_STUDENTS = students.size
        val NUMBER_OF_LABS = 8

        val table = TableLayout(activity)
        val lp = TableLayout.LayoutParams(
            ViewGroup.LayoutParams.FILL_PARENT,
            ViewGroup.LayoutParams.FILL_PARENT,
            1.0f)

        table.layoutParams = lp
        table.isStretchAllColumns = true

        val rowLp = TableLayout.LayoutParams(
            ViewGroup.LayoutParams.FILL_PARENT,
            ViewGroup.LayoutParams.FILL_PARENT,
            1.0f
        )

        val cellLp = TableRow.LayoutParams(
            ViewGroup.LayoutParams.FILL_PARENT,
            ViewGroup.LayoutParams.FILL_PARENT,
            1.0f
        )

        for (i in 0 until NUMBER_OF_STUDENTS) {
            val row = TableRow(activity)

            for (j in 0 until NUMBER_OF_LABS) {
                val tv = TextView(activity)
                if (j == 0) {
                    tv.text = students[i]
                    row.addView(tv, cellLp)
                }
                else {
                    val btn = Button(activity)
                    btn.text = "-"

                    btn.setOnClickListener {
                        val valueOfBtn = btn.text.toString()

                        if (valueOfBtn == "-") {
                            btn.text = "+"
                        } else {
                            btn.text = "-"
                        }
                    }
                    row.addView(btn, cellLp)
                }


            }
            table.addView(row, rowLp)
        }
        return table
    }
}