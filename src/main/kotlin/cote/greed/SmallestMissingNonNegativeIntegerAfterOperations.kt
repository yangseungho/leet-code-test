package org.example.cote.greed

//https://leetcode.com/problems/smallest-missing-non-negative-integer-after-operations/description

class SmallestMissingNonNegativeIntegerAfterOperations {
    fun findSmallestInteger(nums: IntArray, value: Int): Int {
        val count = IntArray(value)
        for (num in nums) {
            val mod = ((num % value) + value) % value
            count[mod]++
        }

        var mex = 0
        while (true) {
            val mod = mex % value
            if (count[mod] > 0) {
                count[mod]--
                mex++
            } else {
                return mex
            }
        }
    }

}