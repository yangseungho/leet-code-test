package org.example.cote.simulation

class TheTwoSneakyNumbersOfDigitville {
    fun getSneakyNumbers(nums: IntArray): IntArray {
        // 원래 있어야 될 최대 사이즈 = nums.size - sneaky numbers
        val len = nums.size - 1 + 2
        val result = mutableSetOf<Int>()

        for (i in 0 until len) {
            if (nums.count {it == i} == 2) {
                result.add(i)
            }
        }
        return result.toIntArray()
    }
}