package org.example.cote.greed

import kotlin.text.iterator

// https://leetcode.com/problems/construct-k-palindrome-strings/description/

class ConstructKPalindromeStrings {
    fun canConstruct(s: String, k: Int): Boolean {
        if (k > s.length) return false

        val freq = IntArray(26)
        for (ch in s) {
            freq[ch - 'a']++
        }

        val oddCount = freq.count { it % 2 == 1 }
        return oddCount <= k
    }
}