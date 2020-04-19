package com.polish.personalfinance.model

data class AccountBalance (
    var accountNumber:String,
    var bankName:String,
    var timeCheck:String,
    var balanceAmount:String,
    var balanceAmountHeading:String
)