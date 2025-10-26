package org.example.cote.dp

import kotlin.collections.iterator

// 이건 너무 어려워서 포기 중급 숙달 하고 다시 보는게 나을듯
// https://leetcode.com/problems/find-sum-of-array-product-of-magical-sequences/description

class FindSumOfArrayProductOfMagicalSequences {
    fun magicalSum(m: Int, k: Int, nums: IntArray): Int {
        val MOD = 1_000_000_007L
        val dp = HashMap<Long, Long>()
        dp[0L] = 1L // 초기 상태

        repeat(m) {
            val next = HashMap<Long, Long>()
            for ((mask, prodSum) in dp) {
                for (j in nums.indices) {
                    val newMask = mask + (1L shl j)
                    val newVal = (prodSum * nums[j]) % MOD
                    next[newMask] = (next.getOrDefault(newMask, 0L) + newVal) % MOD
                }
            }
            dp.clear()
            dp.putAll(next)
        }

        var ans = 0L
        for ((mask, totalProd) in dp) {
            if (mask.countOneBits() == k) {
                ans = (ans + totalProd) % MOD
            }
        }

        return ans.toInt()
    }
}