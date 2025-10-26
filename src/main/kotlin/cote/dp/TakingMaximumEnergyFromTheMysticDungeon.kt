package org.example.cote.dp

// https://leetcode.com/problems/taking-maximum-energy-from-the-mystic-dungeon

class TakingMaximumEnergyFromTheMysticDungeon {
    fun maximumEnergy(energy: IntArray, k: Int): Int {
        val n = energy.size
        val dp = IntArray(n)

        for (i in n - 1 downTo 0) {
            dp[i] = energy[i]
            if (i + k < n) dp[i] += dp[i + k]
        }

        return dp.maxOrNull()!!
    }
}