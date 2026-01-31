package org.example.cote

private const val MOD = 1_000_000_007L
class NumberOfWaysToPaint3Grid {
    fun numOfWays(n: Int): Int {
        var dpA = 6L // ABC
        var dpB = 6L // ABA
        for (i in 2..n) {
            val newA = (dpA * 2 + dpB * 2) % MOD
            val newB = (dpA * 2 + dpB * 3) % MOD
            dpA = newA
            dpB = newB
        }

        return ((dpA + dpB) % MOD).toInt()
    }
}