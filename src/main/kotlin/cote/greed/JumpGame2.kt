package org.example.cote.greed

// https://leetcode.com/problems/jump-game-ii/description

class JumpGame2 {
    fun jump(nums: IntArray): Int {
        var jumps = 0
        var currentEnd = 0
        var farthest = 0

        for (i in 0 until nums.size - 1) {
            // 가장 멀리 갈 수 있는 거리 갱신
            farthest = maxOf(farthest, i + nums[i])

            // 현재 점프 구간의 끝에 도달하면 점프 횟수 증가
            if (i == currentEnd) {
                jumps++
                currentEnd = farthest
            }
        }

        return jumps
    }
}