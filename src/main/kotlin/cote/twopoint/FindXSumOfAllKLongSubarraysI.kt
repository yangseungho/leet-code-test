package org.example.cote.twopoint

//https://leetcode.com/problems/find-x-sum-of-all-k-long-subarrays-i

class FindXSumOfAllKLongSubarraysI {
    fun findXSum(nums: IntArray, k: Int, x: Int): IntArray {
        val n = nums.size
        val result = mutableListOf<Int>()
        val freq = mutableMapOf<Int, Int>()

        // 초기 윈도우 설정
        for (i in 0 until k) {
            freq[nums[i]] = freq.getOrDefault(nums[i], 0) + 1
        }

        fun calcXSum(): Int {
            // 빈도 내림차순, 값 내림차순 정렬
            val sorted = freq.entries.sortedWith(compareByDescending<Map.Entry<Int, Int>> { it.value }
                .thenByDescending { it.key })

            val topX = sorted.take(x).sumOf { (num, count) -> num * count }
            return topX
        }

        result.add(calcXSum())

        // 슬라이딩 윈도우 이동
        for (i in k until n) {
            val removeNum = nums[i - k]
            val addNum = nums[i]

            // 제거
            freq[removeNum] = freq[removeNum]!! - 1
            if (freq[removeNum] == 0) freq.remove(removeNum)

            // 추가
            freq[addNum] = freq.getOrDefault(addNum, 0) + 1

            result.add(calcXSum())
        }

        return result.toIntArray()
    }
}