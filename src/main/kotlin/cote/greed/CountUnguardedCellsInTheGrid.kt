package org.example.cote.greed

class CountUnguardedCellsInTheGrid {
    fun countUnguarded(m: Int, n: Int, guards: Array<IntArray>, walls: Array<IntArray>): Int {
        val grid = Array(m) { IntArray(n) { 0 } }
        val directions = listOf(
            intArrayOf(1, 0),  // down
            intArrayOf(-1, 0), // up
            intArrayOf(0, 1),  // right
            intArrayOf(0, -1)  // left
        )

        // 마킹: 1=guard, 2=wall
        for ((x, y) in guards) grid[x][y] = 1
        for ((x, y) in walls) grid[x][y] = 2

        // 가드의 시야 확장
        for ((gx, gy) in guards) {
            for (dir in directions) {
                var x = gx + dir[0]
                var y = gy + dir[1]
                while (x in 0 until m && y in 0 until n) {
                    if (grid[x][y] == 1 || grid[x][y] == 2) break  // guard or wall
                    if (grid[x][y] == 0) grid[x][y] = 3 // 시야 표시
                    x += dir[0]
                    y += dir[1]
                }
            }
        }

        // unoccupied (guard도 wall도 시야도 아님)
        var count = 0
        for (i in 0 until m) {
            for (j in 0 until n) {
                if (grid[i][j] == 0) count++
            }
        }
        return count
    }
}