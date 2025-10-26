package org.example.cote.dfs

// https://leetcode.com/problems/pacific-atlantic-water-flow/description/

class PacificAtlanticWaterFlow {
    fun pacificAtlantic(heights: Array<IntArray>): List<List<Int>> {
        val m = heights.size
        val n = heights[0].size
        val pacific = Array(m) { BooleanArray(n) }
        val atlantic = Array(m) { BooleanArray(n) }
        val directions = arrayOf(
            intArrayOf(1, 0), intArrayOf(-1, 0),
            intArrayOf(0, 1), intArrayOf(0, -1)
        )

        fun dfs(r: Int, c: Int, visited: Array<BooleanArray>) {
            visited[r][c] = true
            for ((dr, dc) in directions) {
                val nr = r + dr
                val nc = c + dc
                if (nr in 0 until m && nc in 0 until n &&
                    !visited[nr][nc] &&
                    heights[nr][nc] >= heights[r][c]
                ) {
                    dfs(nr, nc, visited)
                }
            }
        }

        // 태평양 (왼쪽, 위)
        for (i in 0 until m) dfs(i, 0, pacific)
        for (j in 0 until n) dfs(0, j, pacific)

        // 대서양 (오른쪽, 아래)
        for (i in 0 until m) dfs(i, n - 1, atlantic)
        for (j in 0 until n) dfs(m - 1, j, atlantic)

        val result = mutableListOf<List<Int>>()
        for (r in 0 until m) {
            for (c in 0 until n) {
                if (pacific[r][c] && atlantic[r][c]) {
                    result.add(listOf(r, c))
                }
            }
        }

        return result
    }
}