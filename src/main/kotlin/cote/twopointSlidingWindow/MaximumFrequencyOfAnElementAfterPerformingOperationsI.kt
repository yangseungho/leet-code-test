package org.example.cote.twopoint

//https://leetcode.com/problems/maximum-frequency-of-an-element-after-performing-operations-i/description

import kotlin.math.abs
import kotlin.math.min
import kotlin.math.max

class MaximumFrequencyOfAnElementAfterPerformingOperationsI {
    // O(N log N) 시간 복잡도 솔루션
    fun maxFrequency(nums: IntArray, k: Int, numOperations: Int): Int {
        val n = nums.size
        val kLong = k.toLong()

        // 1. Long 배열로 변환 후 정렬 (O(N log N))
        // 이진 탐색을 위해 정렬이 필수입니다.
        val sortedNums = LongArray(n) { nums[it].toLong() }
        sortedNums.sort()

        // 2. 타겟 후보 생성 (O(N))
        val candidates = mutableSetOf<Long>()
        for (num in sortedNums) {
            candidates.add(num)
            candidates.add(num - kLong)
            candidates.add(num + kLong)
        }

        var maxFreq = 0

        // 3. 각 후보를 순회 (O(N)번)
        for (target in candidates) {

            // 4. 이진 탐색으로 O(log N)만에 개수 계산

            // A: 이미 target과 같은 원소 수
            // [target] 범위
            val lowerIdx = lowerBound(sortedNums, target)
            val upperIdx = upperBound(sortedNums, target)
            val alreadyEqual = upperIdx - lowerIdx

            // C: target으로 변환 가능한 원소 수
            // [target - k, target + k] 범위
            val C_startIdx = lowerBound(sortedNums, target - kLong)
            val C_endIdx = upperBound(sortedNums, target + kLong)
            val canBeChanged = C_endIdx - C_startIdx

            // B: 변환은 가능하지만, T와 같지는 않은 원소 수
            val canBeChangedButNotEqual = canBeChanged - alreadyEqual

            // 5. 최대 빈도수 계산
            val opsToUseOnB = min(canBeChangedButNotEqual, numOperations)
            val currentFreq = alreadyEqual + opsToUseOnB

            maxFreq = max(maxFreq, currentFreq)
        }

        return maxFreq
    }

    // 이진 탐색 헬퍼 함수 1: lowerBound
    // 정렬된 배열 arr에서 target보다 '크거나 같은' 첫 번째 원소의 인덱스를 반환
    private fun lowerBound(arr: LongArray, target: Long): Int {
        var low = 0
        var high = arr.size
        while (low < high) {
            val mid = low + (high - low) / 2
            if (arr[mid] >= target) {
                high = mid
            } else {
                low = mid + 1
            }
        }
        return low
    }

    // 이진 탐색 헬퍼 함수 2: upperBound
    // 정렬된 배열 arr에서 target보다 '큰' 첫 번째 원소의 인덱스를 반환
    private fun upperBound(arr: LongArray, target: Long): Int {
        var low = 0
        var high = arr.size
        while (low < high) {
            val mid = low + (high - low) / 2
            if (arr[mid] > target) {
                high = mid
            } else {
                low = mid + 1
            }
        }
        return low
    }
}