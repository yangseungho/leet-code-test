package org.example.cote.dp

class UniquePaths {
    fun uniquePaths(m: Int, n: Int): Int {
        if (m == 1 && n == 1) return 1
        val dp = Array(m) { IntArray(n) {0} }
        // edge 처리
        for (mIdx in 1 until m) {
            dp[mIdx][0] = 1
        }
        for (nIdx in 1 until n) {
            dp[0][nIdx] = 1
        }

        for (x in 1 until m) {
            for (y in 1 until n) {
                dp[x][y] = dp[x][y-1] + dp[x-1][y]
            }
        }

        return dp[m-1][n-1]
    }
}