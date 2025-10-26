package org.example.cote.dfs

class Permutation {
    fun permute(nums: IntArray): List<List<Int>> {
        val result = mutableListOf<List<Int>>()
        val used = BooleanArray(nums.size)

        fun backtrack(path: MutableList<Int>) {
            if (path.size == nums.size) {
                result.add(ArrayList(path)) // 깊은 복사
                return
            }

            for (i in nums.indices) {
                if (used[i]) continue

                // 선택
                used[i] = true
                path.add(nums[i])

                // 다음 단계 탐색
                backtrack(path)

                // 복구 (backtrack)
                used[i] = false
                path.removeAt(path.size - 1)
            }
        }

        backtrack(mutableListOf())
        return result
    }
}