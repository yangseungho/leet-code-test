package org.example.cote.hash

// https://leetcode.com/problems/valid-sudoku/description/

class ValidSudoku {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        val rows = Array(9) { mutableSetOf<Char>() }
        val cols = Array(9) { mutableSetOf<Char>() }
        val boxes = Array(9) { mutableSetOf<Char>() }

        for (r in 0 until 9) {
            for (c in 0 until 9) {
                val ch = board[r][c]
                if (ch == '.') continue

                val boxIndex = (r / 3) * 3 + (c / 3)

                if (ch in rows[r] || ch in cols[c] || ch in boxes[boxIndex]) {
                    return false
                }

                rows[r].add(ch)
                cols[c].add(ch)
                boxes[boxIndex].add(ch)
            }
        }

        return true
    }
}