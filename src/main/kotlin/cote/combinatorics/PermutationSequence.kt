package org.example.cote.combinatorics

// https://leetcode.com/problems/permutation-sequence/description/

class PermutationSequence {
    fun getPermutation(n: Int, k: Int): String {
        val numbers = MutableList(n) { it + 1 }
        val factorial = IntArray(n)
        factorial[0] = 1
        for (i in 1 until n) factorial[i] = factorial[i - 1] * i

        var kRemain = k - 1 // 0-index 기반으로 변환
        val sb = StringBuilder()

        for (i in n downTo 1) {
            val idx = kRemain / factorial[i - 1]
            sb.append(numbers[idx])
            numbers.removeAt(idx)
            kRemain %= factorial[i - 1]
            println("kRemain : $kRemain, sb : $sb, idx : $idx")
        }

        return sb.toString()
    }
}