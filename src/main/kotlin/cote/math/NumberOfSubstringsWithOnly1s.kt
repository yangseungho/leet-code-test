package org.example.cote.math

import kotlin.text.iterator

class NumberOfSubstringsWithOnly1s {
    // 시간이 너무 오래 걸림
//    fun numSub(s: String): Int {
//        var start = "1"
//        var count = 0
//        while (s.length > start.length) {
//            var sCount = s.windowed(start.length, 1).count { it == start }
//            if (sCount == 0) break
//            count += sCount
//            start += "1"
//        }
//        if (s == start) count++
//        return count
//    }
    fun numSub(s: String): Int {
        val mod = 1_000_000_007L
        var consecutive = 0L
        var result = 0L

        for (c in s) {
            if (c == '1') {
                consecutive++
                result = (result + consecutive) % mod
            } else {
                consecutive = 0
            }
        }

        return result.toInt()
    }
}