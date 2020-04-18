package com.polish.personalfinance

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

/**
 * A simple [Fragment] subclass.
 */
class Overview : Fragment() {

    lateinit var  oToolbar:Toolbar

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_overview, container, false)

        setHasOptionsMenu(true)

        oToolbar = view.findViewById(R.id.overviewToolbar)
        (activity as AppCompatActivity).setSupportActionBar(oToolbar)
        (activity as AppCompatActivity).supportActionBar?.title = "Overview"


        return view
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.overview_toolbar_menu, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

}
