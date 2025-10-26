package org.example.cote.greed

//https://leetcode.com/problems/maximum-number-of-distinct-elements-after-operations

class MaximumNumberOfDistinctElementsAfterOperations {
    fun maxDistinctElements(nums: IntArray, k: Int): Int {
        nums.sort()
        var cur = Int.MIN_VALUE / 2
        val distinctElements = mutableSetOf<Int>()
        var distinct = 0

        for (num in nums) {
            val start = num - k
            val end = num + k
            val next = maxOf(cur + 1, start)
            if (next <= end) {
                cur = next
                distinct++
            }
            distinctElements.add(cur)
        }
        distinctElements.forEach { println("${it}") }
        return distinct
    }
}