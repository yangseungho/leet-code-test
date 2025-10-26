package cote.binarysearch

import kotlin.math.ceil

// https://leetcode.com/problems/successful-pairs-of-spells-and-potions/description

class SuccessfulPairsOfSpellsAndPotions {
    fun successfulPairs(spells: IntArray, potions: IntArray, success: Long): IntArray {
        val sortedPotions = potions.sorted()
        val m = sortedPotions.size
        val result = IntArray(spells.size)

        for ((i, spell) in spells.withIndex()) {
            // spell * potion >= success → potion >= success / spell
            val target = ceil(success.toDouble() / spell).toLong()
            val idx = lowerBound(sortedPotions, target)
            result[i] = m - idx // 성공한 조합의 개수
        }

        return result
    }

    private fun lowerBound(arr: List<Int>, target: Long): Int {
        var left = 0
        var right = arr.size
        while (left < right) {
            val mid = (left + right) / 2
            if (arr[mid].toLong() < target) left = mid + 1
            else right = mid
        }
        return left
    }
}