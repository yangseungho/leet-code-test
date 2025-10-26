package org.example.cote.etc.noalgorithm

//https://leetcode.com/problems/calculate-money-in-leetcode-bank

class CalculateMoneyInLeetcodeBank {
    fun totalMoney(n: Int): Int {
        var total = 0
        var weekAdd = 0
        for (i in 1..n) {
            if (i % 7 == 1 && i != 1) weekAdd++  // 매주 월요일마다 +1
            total += weekAdd + (i - 1) % 7 + 1
        }
        return total
    }
}