package org.example.cote.dp

//https://leetcode.com/problems/ones-and-zeroes
// 2차원 knapsack

class OnesAndZeroes {
    fun findMaxForm(strs: Array<String>, m: Int, n: Int): Int {
        // dp[i][j] = i개의 0, j개의 1을 사용했을 때 만들 수 있는 subset의 최대 크기
        val dp = Array(m + 1) { IntArray(n + 1) }

        for (str in strs) {
            val zeros = str.count { it == '0' }
            val ones = str.length - zeros

            // 2D knapsack: 뒤에서 앞으로 갱신해야 중복 선택 방지
            for (i in m downTo zeros) {
                for (j in n downTo ones) {
                    dp[i][j] = maxOf(dp[i][j], dp[i - zeros][j - ones] + 1)
                }
            }
        }

        return dp[m][n]
    }
}