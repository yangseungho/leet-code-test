package org.example.cote.array

// https://leetcode.com/problems/minimum-absolute-difference

class MinimumAbsoluteDifference {
    fun minimumAbsDifference(arr: IntArray): List<List<Int>> {
        val sortedArr = arr.sorted()
        val result = mutableListOf<List<Int>>()
        var minimum = Int.MAX_VALUE
        for (i in 0 until sortedArr.size - 1) {
            val diff = sortedArr[i + 1] - sortedArr[i]

            when {
                diff < minimum -> {
                    minimum = diff
                    result.clear()
                    result.add(listOf(sortedArr[i], sortedArr[i + 1]))
                }
                diff == minimum -> {
                    result.add(listOf(sortedArr[i], sortedArr[i + 1]))
                }
            }
        }
        return result
    }
}