package org.example.cote.dp

class MaximumTotalDamageWithSpellCasting {
    fun maximumTotalDamage(power: IntArray): Long {
        if (power.isEmpty()) return 0

        // 1️⃣ 같은 공격력끼리 합산
        val damageMap = mutableMapOf<Int, Int>()
        for (p in power) {
            damageMap[p] = damageMap.getOrDefault(p, 0) + p
        }

        // 2️⃣ 공격력 정렬
        val sorted = damageMap.keys.sorted()

        // 3️⃣ DP 배열 초기화
        val dp = IntArray(sorted.size)

        for (i in sorted.indices) {
            val currValue = damageMap[sorted[i]]!!
            if (i == 0) {
                dp[i] = currValue
            } else {
                val prevIdx = if (sorted[i] - sorted[i - 1] <= 2) i - 2 else i - 1
                val take = currValue + if (prevIdx >= 0) dp[prevIdx] else 0
                val skip = dp[i - 1]
                dp[i] = maxOf(take, skip)
            }
        }

        return dp.last().toLong()
    }
}