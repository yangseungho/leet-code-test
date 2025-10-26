package org.example.cote.simulation

// https://leetcode.com/problems/plus-one/description/

class PlusOne {
    fun plusOne(digits: IntArray): IntArray {
        for (i in digits.size - 1 downTo 0) {
            // 9보다 작으면 단순히 +1 후 바로 리턴
            if (digits[i] < 9) {
                digits[i]++
                return digits
            }
            // 9라면 자리올림
            digits[i] = 0
        }
        // 여기까지 왔다면 모든 자리가 9였다는 뜻
        // ex) [9,9,9] -> [1,0,0,0]
        val result = IntArray(digits.size + 1)
        result[0] = 1
        return result
    }
}