package org.example.cote.twopoint

// https://leetcode.com/problems/4sum/description/

class FourSum {
    fun fourSum(nums: IntArray, target: Int): List<List<Int>> {
        val result = mutableListOf<List<Int>>()
        val n = nums.size
        if (n < 4) return result

        nums.sort()

        for (i in 0 until n - 3) {
            // i 중복 제거
            if (i > 0 && nums[i] == nums[i - 1]) continue

            for (j in i + 1 until n - 2) {
                // j 중복 제거
                if (j > i + 1 && nums[j] == nums[j - 1]) continue

                var left = j + 1
                var right = n - 1

                while (left < right) {
                    val sum = nums[i] + nums[j] + nums[left] + nums[right]

                    when {
                        sum < target -> left++
                        sum > target -> right--
                        else -> {
                            result.add(listOf(nums[i], nums[j], nums[left], nums[right]))

                            // left, right 중복 제거
                            while (left < right && nums[left] == nums[left + 1]) left++
                            while (left < right && nums[right] == nums[right - 1]) right--

                            left++
                            right--
                        }
                    }
                }
            }
        }

        return result
    }
}