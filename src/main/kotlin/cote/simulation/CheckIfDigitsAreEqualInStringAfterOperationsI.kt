package org.example.cote.simulation

//https://leetcode.com/problems/check-if-digits-are-equal-in-string-after-operations-i/description/

class CheckIfDigitsAreEqualInStringAfterOperationsI {
    fun hasSameDigits(s: String): Boolean {
        var digits = s.map { it - '0' }.toMutableList()

        while (digits.size > 2) {
            val next = mutableListOf<Int>()
            for (i in 0 until digits.size - 1) {
                next.add((digits[i] + digits[i + 1]) % 10)
            }
            digits = next
        }

        return digits[0] == digits[1]
    }
}