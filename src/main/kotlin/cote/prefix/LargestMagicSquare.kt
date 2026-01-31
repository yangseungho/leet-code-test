package org.example.cote.prefix

class LargestMagicSquare {
    fun largestMagicSquare(grid: Array<IntArray>): Int {
        val m = grid.size
        val n = grid[0].size

        val rowSum = Array(m) { IntArray(n + 1) }
        val colSum = Array(m + 1) { IntArray(n) }
        val diag1 = Array(m + 1) { IntArray(n + 1) }
        val diag2 = Array(m + 1) { IntArray(n + 1) }

        // Prefix Sum 계산
        for (i in 0 until m) {
            for (j in 0 until n) {
                rowSum[i][j + 1] = rowSum[i][j] + grid[i][j]
                colSum[i + 1][j] = colSum[i][j] + grid[i][j]
                diag1[i + 1][j + 1] = diag1[i][j] + grid[i][j]
                diag2[i + 1][j] = diag2[i][j + 1] + grid[i][j]
            }
        }

        fun isMagic(r: Int, c: Int, k: Int): Boolean {
            val target = rowSum[r][c + k] - rowSum[r][c]

            // 행 검사
            for (i in r until r + k) {
                if (rowSum[i][c + k] - rowSum[i][c] != target) return false
            }

            // 열 검사
            for (j in c until c + k) {
                if (colSum[r + k][j] - colSum[r][j] != target) return false
            }

            // 대각선 검사
            if (diag1[r + k][c + k] - diag1[r][c] != target) return false
            if (diag2[r + k][c] - diag2[r][c + k] != target) return false

            return true
        }

        for (k in minOf(m, n) downTo 2) {
            for (r in 0..m - k) {
                for (c in 0..n - k) {
                    if (isMagic(r, c, k)) return k
                }
            }
        }

        return 1
    }
}