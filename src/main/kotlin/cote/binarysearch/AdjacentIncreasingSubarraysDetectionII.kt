package org.example.cote.binarysearch

class AdjacentIncreasingSubarraysDetectionII {
    fun maxIncreasingSubarrays(nums: List<Int>): Int {
        val n = nums.size
        // 길이가 2 미만이면 두 개의 부분 배열을 만들 수 없으므로 0을 반환합니다.
        if (n < 2) {
            return 0
        }

        // 1. 정방향 탐색: incEnd[i]는 i에서 끝나는 연속 증가 부분 배열의 길이를 저장합니다.
        val incEnd = IntArray(n) { 1 }
        for (i in 1 until n) {
            if (nums[i] > nums[i - 1]) {
                incEnd[i] = incEnd[i - 1] + 1
            }
        }

        // 2. 역방향 탐색: incStart[i]는 i에서 시작하는 연속 증가 부분 배열의 길이를 저장합니다.
        val incStart = IntArray(n) { 1 }
        for (i in n - 2 downTo 0) {
            if (nums[i] < nums[i + 1]) {
                incStart[i] = incStart[i + 1] + 1
            }
        }

        var maxK = 0
        // 3. 최대 k 찾기: 모든 경계 지점(i와 i+1 사이)을 확인합니다.
        for (i in 0 until n - 1) {
            // 첫 번째 부분 배열(i에서 끝남)과 두 번째 부분 배열(i+1에서 시작)의 길이를 가져옵니다.
            val len1 = incEnd[i]
            val len2 = incStart[i + 1]

            // 두 부분 배열의 길이는 k로 같아야 하므로, 두 길이 중 작은 값이 해당 경계에서의 최대 k가 됩니다.
            val currentK = minOf(len1, len2)

            // 전체 최대 k 값을 업데이트합니다.
            maxK = maxOf(maxK, currentK)
        }

        return maxK
    }
}