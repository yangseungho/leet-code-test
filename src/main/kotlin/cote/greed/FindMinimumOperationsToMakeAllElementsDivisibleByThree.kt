package org.example.cote.greed

// https://leetcode.com/problems/find-minimum-operations-to-make-all-elements-divisible-by-three

class FindMinimumOperationsToMakeAllElementsDivisibleByThree {
    fun minimumOperations(nums: IntArray): Int {
        var result = 0
        val size = nums.size
        for (i in 0 until size) {
            if (nums[i] % 3 != 0)  result += 1
        }
        return result
    }
}