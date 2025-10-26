package org.example.cote.string

//https://leetcode.com/problems/count-and-say/description/

class CountAndSay {
    fun countAndSay(n: Int): String {
        if (n == 1) return "1"
        var result = "1"

        repeat(n - 1) {
            val sb = StringBuilder()
            var count = 1
            for (i in 1 until result.length + 1) {
                if (i < result.length && result[i] == result[i - 1]) {
                    count++
                } else {
                    sb.append(count).append(result[i - 1])
                    count = 1
                }
            }
            result = sb.toString()
        }

        return result
    }
}