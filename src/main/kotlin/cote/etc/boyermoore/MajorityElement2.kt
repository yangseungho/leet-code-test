package org.example.cote.etc.boyermoore

// https://leetcode.com/problems/majority-element-ii/description/

class MajorityElement2 {
    fun majorityElement(nums: IntArray): List<Int> {
        var candidate1: Int? = null
        var candidate2: Int? = null
        var count1 = 0
        var count2 = 0

        // 후보 선정 단계
        for (num in nums) {
            when {
                candidate1 == num -> count1++
                candidate2 == num -> count2++
                count1 == 0 -> { candidate1 = num; count1 = 1 }
                count2 == 0 -> { candidate2 = num; count2 = 1 }
                else -> { count1--; count2-- }
            }
        }

        // 실제 등장 횟수 검증 단계
        count1 = 0; count2 = 0
        for (num in nums) {
            if (num == candidate1) count1++
            else if (num == candidate2) count2++
        }

        val result = mutableListOf<Int>()
        if (count1 > nums.size / 3) result.add(candidate1!!)
        if (count2 > nums.size / 3) result.add(candidate2!!)
        return result
    }
}