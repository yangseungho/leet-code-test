package org.example.cote.greed

// https://leetcode.com/problems/merge-intervals/

class MergeIntervals {
    fun merge(intervals: Array<IntArray>): Array<IntArray> {
        val sortedIntervals = intervals.sortedBy { it[0] }
        val result = mutableListOf<IntArray>()

        for (i in 0 until intervals.size) {
            if (i == 0) {
                result.add(sortedIntervals[0])
                continue
            }
            val nowInterval = sortedIntervals[i]
            val preInterval = result.last()
            if (preInterval[1] >= nowInterval[0]) {
                val endInterval = if (preInterval[1] > nowInterval[1]) preInterval[1] else nowInterval[1]
                val newInterval = intArrayOf(preInterval[0], endInterval)
                result.removeLast()
                result.add(newInterval)
            } else {
                result.add(sortedIntervals[i])
            }
        }
        return result.toTypedArray()
    }
}