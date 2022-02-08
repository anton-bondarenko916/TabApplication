package com.example.tabs

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.fragment.app.ListFragment

class StudentListFragment : ListFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val adapter = ArrayAdapter(
            inflater.context,
            android.R.layout.simple_list_item_1,
            resources.getStringArray(R.array.students_array)
        )
        listAdapter = adapter
        return super.onCreateView(inflater, container, savedInstanceState)
    }

}