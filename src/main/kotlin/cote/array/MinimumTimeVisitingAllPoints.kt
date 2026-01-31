package org.example.cote.array

//https://leetcode.com/problems/minimum-time-visiting-all-points
// Chebyshev distance 

class MinimumTimeVisitingAllPoints {
    fun minTimeToVisitAllPoints(points: Array<IntArray>): Int {
        var result = 0

        for (i in 1 until points.size) {
            val dx = kotlin.math.abs(points[i][0] - points[i - 1][0])
            val dy = kotlin.math.abs(points[i][1] - points[i - 1][1])
            result += maxOf(dx, dy)
        }

        return result
    }
}