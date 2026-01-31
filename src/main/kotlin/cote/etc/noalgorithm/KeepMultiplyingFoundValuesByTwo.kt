package org.example.cote.etc.noalgorithm

class KeepMultiplyingFoundValuesByTwo {
    fun findFinalValue(nums: IntArray, original: Int): Int {
        var result = original
        while(result in nums) {
            result *= 2
        }
        return result
    }
}