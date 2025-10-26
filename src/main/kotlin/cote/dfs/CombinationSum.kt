package org.example.cote.dfs

//https://leetcode.com/problems/combination-sum

class CombinationSum {
    fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {
        val result = mutableListOf<List<Int>>()
        candidates.sort()  // 가지치기 위해 정렬

        fun backTracking(start: Int, path: MutableList<Int>, sum: Int) {
            if (sum == target) {
                result.add(ArrayList(path))
                return
            }
            if (sum > target) return

            for (i in start until candidates.size) {
                val num = candidates[i]
                path.add(num)
                backTracking(i, path, sum + num) // i 그대로: 같은 수 여러번 사용 가능
                path.removeAt(path.size - 1)
            }
        }

        backTracking(0, mutableListOf(), 0)
        return result
    }
}