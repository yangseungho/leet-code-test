package org.example.cote.dfs

class LexicographicalNumbers {
    fun lexicalOrder(n: Int): List<Int> {
        val result = mutableListOf<Int>()
        fun dfs(currentNum: Int) {
            if (currentNum > n) return
            result.add(currentNum)
            for (i in 0 until 10) {
                val nextNum = currentNum * 10 + i
                if (nextNum > n) break
                dfs(nextNum)
            }
        }
        for (i in 1 .. 9) dfs(i)
        return result
    }
}