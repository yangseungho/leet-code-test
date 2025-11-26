package org.example.cote.greed

// https://leetcode.com/problems/minimum-operations-to-convert-all-elements-to-zero/description/

class MinimumOperationsToConvertAllElementsToZero {
    fun minOperations(nums: IntArray): Int {
        var ans = 0
        var i = 0
        val n = nums.size

        while (i < n) {
            // 0 이면 그냥 지나감 (segment 시작 x)
            if (nums[i] == 0) {
                i++
                continue
            }

            // --- segment 시작점 ---
            var j = i

            // segment 끝까지 확장 (0 만나기 전까지)
            while (j < n && nums[j] != 0) j++

            // 이제 segment 는 [i .. j-1]

            // value -> block count
            val blockMap = mutableMapOf<Int, Int>()

            var k = i
            while (k < j) {
                val v = nums[k]

                // 연속 블록의 시작점일 때만 증가
                if (k == i || nums[k - 1] != v) {
                    blockMap[v] = blockMap.getOrDefault(v, 0) + 1
                }

                k++
            }

            // 이 segment 내에서 필요한 연산 수 = block 개수 총합
            // BUT 최소값은 block 여러 개여도 "1번"에 싹 사라짐 → 이게 왜 가능한지는 설명했던 부분
            // 즉 blockMap을 value ascending 으로 정렬해서 처리
            val sortedValues = blockMap.keys.sorted()

            // 최솟값은 1번만
            ans += 1

            // 나머지 값들은 block count 그대로 필요
            for (idx in 1 until sortedValues.size) {
                val v = sortedValues[idx]
                ans += blockMap[v]!!
            }

            // 다음 segment 로 이동
            i = j
        }

        return ans
    }
}