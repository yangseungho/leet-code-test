package org.example.cote.twopoint

//https://leetcode.com/problems/maximum-frequency-of-an-element-after-performing-operations-i/description

class MaximumFrequencyOfAnElementAfterPerformingOperationsI {
    fun maxFrequency(nums: IntArray, k: Int, numOperations: Int): Int {
        nums.sort()
        var left = 0
        var maxFreq = 1

        for (right in nums.indices) {
            while (nums[right] - nums[left] > 2 * k) {
                left++
            }
            val windowSize = right - left + 1
            val possible = minOf(windowSize, numOperations + 1)
            maxFreq = maxOf(maxFreq, possible)
        }

        return maxFreq
    }
}