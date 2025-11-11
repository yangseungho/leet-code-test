package org.example.cote

class CountUnguardedCellsInTheGrid {
    fun countUnguarded(m: Int, n: Int, guards: Array<IntArray>, walls: Array<IntArray>): Int {
        var guardCount = guards.size + walls.size
        val totalCell = m * n
        var isGuard = Array(m){BooleanArray(n, { false })}
//        for (guards)
        return totalCell - guardCount
    }
}