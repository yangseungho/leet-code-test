package org.example.cote.etc.noalgorithm

//https://leetcode.com/problems/simple-bank-system

class SimpleBankSystem(private val balance: LongArray) {

    fun transfer(account1: Int, account2: Int, money: Long): Boolean {
        if (account1 > balance.size || account2 > balance.size) return false
        if (balance[account1 -1] < money) return false
        balance[account1 -1] -= money
        balance[account2 -1] += money
        return true
    }

    fun deposit(account: Int, money: Long): Boolean {
        if (account > balance.size) return false
        balance[account -1] += money
        return true
    }

    fun withdraw(account: Int, money: Long): Boolean {
        if (account > balance.size) return false
        if (balance[account -1] < money) return false
        balance[account -1] -= money
        return true
    }
}