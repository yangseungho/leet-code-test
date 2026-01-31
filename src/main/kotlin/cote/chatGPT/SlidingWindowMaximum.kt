package org.example.cote.chatGPT

/*
정수 배열 nums와 정수 k가 주어진다.
크기 k인 슬라이딩 윈도우에서 각 구간의 최대값을 배열로 반환하라.

입력: nums = [1,3,-1,-3,5,3,6,7], k = 3

출력: [3,3,5,5,6,7]
 */
class SlidingWindowMaximum {
    fun maxSlidingWindow(nums: IntArray, k: Int): IntArray {
        val result = IntArray(nums.size - k + 1)
        val deque = ArrayDeque<Int>() // index 저장
        var idx = 0

        for (i in nums.indices) {

            // 윈도우 범위 벗어난 index 제거
            if (deque.isNotEmpty() && deque.first() <= i - k) {
                deque.removeFirst()
            }

            // 현재 값보다 작은 값들은 제거
            while (deque.isNotEmpty() && nums[deque.last()] < nums[i]) {
                deque.removeLast()
            }

            deque.addLast(i)

            // 윈도우 완성 시점부터 결과 추가
            if (i >= k - 1) {
                result[idx++] = nums[deque.first()]
            }
        }
        return result
    }
}