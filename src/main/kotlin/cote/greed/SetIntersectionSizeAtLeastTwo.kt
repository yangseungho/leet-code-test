package org.example.cote.greed

//https://leetcode.com/problems/set-intersection-size-at-least-two

class SetIntersectionSizeAtLeastTwo {
    fun intersectionSizeTwo(intervals: Array<IntArray>): Int {
        if (intervals.isEmpty()) return 0

        val sorted = intervals.sortedWith(compareBy({ it[1] }, { -it[0] }))

        var s1 = Int.MIN_VALUE  // 두 번째로 큰 선택값 (작은 쪽)
        var s2 = Int.MIN_VALUE  // 가장 큰 선택값 (큰 쪽)
        var result = 0

        for ((l, r) in sorted) {
            if (s2 < l) {
                // 현재 구간에 선택된 숫자 없음 -> r-1, r 추가
                val x = maxOf(l, r - 1) // 안전 처리 (r-1 < l 인 경우)
                s1 = x
                s2 = r
                result += 2
            } else if (s1 < l && s2 >= l) {
                // 구간에 하나만 있음 -> r 추가
                s1 = s2
                s2 = r
                result += 1
            } else {
                // s1 >= l 인 경우 이미 두 개 이상 존재 -> 아무 것도 추가 안 함
            }
        }

        return result
    }
}