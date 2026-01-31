package org.example.cote.binarysearch

// https://leetcode.com/problems/adjacent-increasing-subarrays-detection-ii/description/

class AdjacentIncreasingSubarraysDetectionII {
    fun maxIncreasingSubarrays(nums: List<Int>): Int {
        val n = nums.size

        // strictly increasing 길이 배열 precompute
        val inc = IntArray(n)
        inc[n - 1] = 1
        for (i in n - 2 downTo 0) {
            inc[i] = if (nums[i] < nums[i + 1]) inc[i + 1] + 1 else 1
        }

        // 길이 k subarray가 strictly increasing인지 확인
        fun canHaveK(k: Int): Boolean {
            if (2 * k > n) return false

            // 길이 k인 strictly increasing subarray 탐색
            for (i in 0..n - 2 * k) {
                if (inc[i] >= k && inc[i + k] >= k) return true
            }
            return false
        }

        var low = 1
        var high = n / 2
        var result = 0

        while (low <= high) {
            val mid = (low + high) / 2
            if (canHaveK(mid)) {
                result = mid
                low = mid + 1
            } else {
                high = mid - 1
            }
        }

        return result
    }
}