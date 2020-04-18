package com.polish.personalfinance

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    lateinit var bottomNav:BottomNavigationView
    lateinit var frameLayout:FrameLayout

    lateinit var overViewFragment:Overview
    lateinit var budgetFragment:Budget
    lateinit var bankAccountFragment:BankAccounts
    lateinit var transaction:Transactions

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNav = findViewById(R.id.bottom_Nav_bar_Id)
        frameLayout = findViewById(R.id.main_displayId)

        // overView Fragment is set as default


            overViewFragment = Overview()
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.main_displayId, overViewFragment)
                .commit()

        // set an event listener
        bottomNav.setOnNavigationItemSelectedListener { item ->

            when(item.itemId) {

                R.id.overview -> {

                    overViewFragment = Overview()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.main_displayId, overViewFragment)
                        .commit()
                }
                R.id.budget -> {

                    budgetFragment = Budget()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.main_displayId, budgetFragment)
                        .commit()
                }
                R.id.bankAccount -> {

                    bankAccountFragment = BankAccounts()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.main_displayId, bankAccountFragment)
                        .commit()
                }
                R.id.transaction -> {

                    transaction = Transactions()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.main_displayId, transaction)
                        .commit()
                }

            }
            true
        }

    }
}
