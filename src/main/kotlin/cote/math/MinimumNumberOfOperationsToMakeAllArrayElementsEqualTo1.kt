package org.example.cote.math

// https://leetcode.com/problems/minimum-number-of-operations-to-make-all-array-elements-equal-to-1

class MinimumNumberOfOperationsToMakeAllArrayElementsEqualTo1 {
    fun gcd(a: Int, b: Int): Int {
        return if (b == 0) a else gcd(b, a % b)
    }

    fun minOperations(nums: IntArray): Int {
        val n = nums.size
        if (nums.any { it == 1 }) {
            // 이미 1이 있는 경우
            return n - nums.count { it == 1 }
        }

        // 1이 없는 경우, 최소 gcd=1 구간 찾기
        var minLen = Int.MAX_VALUE
        for (i in nums.indices) {
            var g = nums[i]
            for (j in i until nums.size) {
                g = gcd(g, nums[j])
                if (g == 1) {
                    minLen = minOf(minLen, j - i + 1)
                    break
                }
            }
        }

        return if (minLen == Int.MAX_VALUE) -1 else n + minLen - 2
    }
}