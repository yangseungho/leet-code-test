package org.example.cote.prefix

//https://leetcode.com/problems/unique-length-3-palindromic-subsequences

class UniqueLengthThreePalindromicSubsequences {
    fun countPalindromicSubsequence(s: String): Int {
        val n = s.length
        val first = IntArray(26) { -1 }
        val last = IntArray(26)

        // first / last 위치 기록
        for (i in 0 until n) {
            val idx = s[i] - 'a'
            if (first[idx] == -1) first[idx] = i
            last[idx] = i
        }

        var result = 0

        // 각 문자 x에 대해
        for (c in 0 until 26) {
            val l = first[c]
            val r = last[c]
            if (l == -1 || l >= r) continue  // 2번 이상 등장하지 않음

            val seen = BooleanArray(26)

            // l과 r 사이의 distinct 문자 개수
            for (i in l + 1 until r) {
                seen[s[i] - 'a'] = true
            }

            result += seen.count { it }
        }

        return result
    }
}