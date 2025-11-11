package org.example.cote.simulation

class MakeArrayElementsEqualToZero {
    fun countValidSelections(nums: IntArray): Int {
        val n = nums.size
        var validCount = 0

        for (start in nums.indices) {
            if (nums[start] != 0) continue

            for (dirStart in listOf(-1, 1)) {
                val temp = nums.clone() // 깊은 복사
                var curr = start
                var dir = dirStart

                while (curr in 0 until n) {
                    if (temp[curr] == 0) {
                        curr += dir
                    } else {
                        temp[curr] -= 1
                        dir = -dir
                        curr += dir
                    }
                }

                if (temp.all { it == 0 }) {
                    validCount++
                }
            }
        }
        return validCount
    }
}