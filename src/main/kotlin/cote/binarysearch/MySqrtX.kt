package org.example.cote.binarysearch

// https://leetcode.com/problems/sqrtx/

class MySqrtX {
    fun mySqrt(x: Int): Int {
        if (x < 2) return x
        var right = x.toLong()
        var left = 1L
        var ans = 0L

        while (left <= right) {
            val mid = (left + right) / 2
            val sqrt = (mid * mid)
            if (sqrt < x) {
                left = mid + 1
                ans = mid
            } else if (sqrt > x) {
                right = mid - 1
            } else {
                return mid.toInt()
            }
        }
        return ans.toInt()
    }
}