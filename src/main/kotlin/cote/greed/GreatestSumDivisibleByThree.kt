package org.example.cote.greed

// https://leetcode.com/problems/greatest-sum-divisible-by-three

class GreatestSumDivisibleByThree {
    fun maxSumDivThree(nums: IntArray): Int {
        var sum = 0
        val mod1 = mutableListOf<Int>()
        val mod2 = mutableListOf<Int>()

        for (n in nums) {
            sum += n
            when (n % 3) {
                1 -> mod1.add(n)
                2 -> mod2.add(n)
            }
        }

        mod1.sort()
        mod2.sort()

        return when (sum % 3) {
            0 -> sum
            1 -> {
                var remove = Int.MAX_VALUE
                if (mod1.isNotEmpty()) {
                    remove = minOf(remove, mod1[0])
                }
                if (mod2.size >= 2) {
                    remove = minOf(remove, mod2[0] + mod2[1])
                }
                if (remove == Int.MAX_VALUE) 0 else sum - remove
            }
            2 -> {
                var remove = Int.MAX_VALUE
                if (mod2.isNotEmpty()) {
                    remove = minOf(remove, mod2[0])
                }
                if (mod1.size >= 2) {
                    remove = minOf(remove, mod1[0] + mod1[1])
                }
                if (remove == Int.MAX_VALUE) 0 else sum - remove
            }
            else -> 0
        }
    }
}