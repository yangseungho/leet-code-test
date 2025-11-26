package org.example.cote.greed

// https://leetcode.com/problems/minimum-time-to-make-rope-colorful

class MinimumTimeToMakeRopeColorful {
    fun minCost(colors: String, neededTime: IntArray): Int {
        var totalTime = 0
        var i = 0

        while (i < colors.length) {
            var j = i
            var sum = 0
            var maxTime = 0

            // 같은 색 그룹 구간 찾기
            while (j < colors.length && colors[j] == colors[i]) {
                sum += neededTime[j]
                maxTime = maxOf(maxTime, neededTime[j])
                j++
            }

            // 같은 색 그룹에서 (총합 - 최대값) 만큼 제거
            totalTime += sum - maxTime
            i = j
        }

        return totalTime
    }
}