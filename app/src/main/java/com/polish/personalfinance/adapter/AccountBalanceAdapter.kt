package com.polish.personalfinance.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.polish.personalfinance.R
import com.polish.personalfinance.model.AccountBalance

class AccountBalanceAdapter(var accountList:ArrayList<AccountBalance>):RecyclerView.Adapter<AccountBalanceAdapter.AccountBalancViewHolder>(){

    class AccountBalancViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {
            var accountNumber:TextView
            var bankName:TextView
            var timeCheck:TextView
            var balanceAmount:TextView
            var balanceAmountHeading:TextView

        init {
            accountNumber = itemView.findViewById(R.id.accountNumberID)
            bankName = itemView.findViewById(R.id.bank_nameId)
            timeCheck = itemView.findViewById(R.id.timingId)
            balanceAmount = itemView.findViewById(R.id.amountInAccountId)
            balanceAmountHeading = itemView.findViewById(R.id.amountId)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AccountBalancViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.bank_balance_item, parent,false)

        return AccountBalancViewHolder(view)
    }

    override fun getItemCount(): Int {
        return accountList.size
    }

    override fun onBindViewHolder(holder: AccountBalancViewHolder, position: Int) {
        val accountItem = accountList.get(position)
        holder.accountNumber.text = accountItem.accountNumber
        holder.bankName.text = accountItem.bankName
        holder.timeCheck.text = accountItem.timeCheck
        holder.balanceAmount.text = accountItem.balanceAmount
        holder.balanceAmountHeading.text = accountItem.balanceAmountHeading
    }

}