package org.example.cote.math

// https://leetcode.com/problems/count-operations-to-obtain-zero
// 유클리드 호제법

class CountOperationsToObtainZero {
    fun countOperations(num1: Int, num2: Int): Int {
        var count = 0
        var first = num1
        var second = num2
        while (first != 0 && second != 0) {
            if (first >= second) {
                count += first / second
                first %= second
            } else {
                count += first / second
                second %= first
            }
        }
        return count
    }
}