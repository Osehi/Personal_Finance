package com.polish.personalfinance

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.polish.personalfinance.adapter.AccountBalanceAdapter
import com.polish.personalfinance.model.AccountBalance

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

        // list of bank account details
        var accountList= arrayListOf<AccountBalance>()

        val israel = AccountBalance("790XXXX678","GTBank", "Checked 17 Apr 2020", "$900", "$900")
        val peace = AccountBalance("573XXXX000","GTBank", "Checked 19 Apr 2020", "$600", "$600")
        val client = AccountBalance("295XXXX445","GTBank", "Checked 29 Mar 2020", "$400", "$400")

        // populate the list
        accountList.add(israel)
        accountList.add(peace)
        accountList.add(client)

        // link the recyclerView to the adapter
        val mRecyclerView = view.findViewById<RecyclerView>(R.id.bankAccountBalanceRecordRecyclerViewId)
        mRecyclerView.layoutManager = LinearLayoutManager(context)
        mRecyclerView.adapter = AccountBalanceAdapter(accountList)


        return view
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.overview_toolbar_menu, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

}
