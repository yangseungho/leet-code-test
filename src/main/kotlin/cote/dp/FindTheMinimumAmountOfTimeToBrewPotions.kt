package org.example.cote.dp

import kotlin.math.max

//https://leetcode.com/problems/find-the-minimum-amount-of-time-to-brew-potions/description

class FindTheMinimumAmountOfTimeToBrewPotions {
    fun minTime(skill: IntArray, mana: IntArray): Long {
        val n = skill.size
        val m = mana.size

        // 1. 마법사들의 누적 스킬 합(pSkill)을 미리 계산합니다.
        // pSkill[i] = skill[0] + ... + skill[i]
        val pSkill = LongArray(n)
        pSkill[0] = skill[0].toLong()
        for (i in 1 until n) {
            pSkill[i] = pSkill[i - 1] + skill[i]
        }

        // 2. 각 물약의 시작 시간(S_j)을 계산합니다.
        var potionStartTime = 0L // 첫 번째 물약(j=0)은 시간 0에 시작 (S_0 = 0)

        for (j in 1 until m) {
            // S_j를 결정하기 위한 제약 조건의 최댓값을 찾습니다.
            var maxDiff = Long.MIN_VALUE
            for (i in 1 until n) {
                // T(i-1, j) >= T(i, j-1) 제약 조건을 S_j에 대해 정리한 식
                val preWizard = pSkill[i] * mana[j - 1]
                val nowWizard = pSkill[i - 1] * mana[j]
                val diff = preWizard - nowWizard
                if (diff > maxDiff) {
                    maxDiff = diff
                }
            }

            // S_j = S_{j-1} + max(0, max_diff)
            // 시작 시간은 이전보다 빨라질 수 없으므로 최솟값은 0입니다.
            potionStartTime += max(0, maxDiff)
        }

        // 3. 최종 시간은 마지막 물약이 마지막 마법사의 작업을 마치는 시간입니다.
        // T(n-1, m-1) = S_{m-1} + P_skill[n-1] * mana[m-1]
        val totalTime = potionStartTime + pSkill[n - 1] * mana[m - 1]

        return totalTime
    }
}