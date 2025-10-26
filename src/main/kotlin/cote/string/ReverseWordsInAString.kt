package org.example.cote.string

// // https://leetcode.com/problems/reverse-words-in-a-string/description/

class ReverseWordsInAString {
    fun reverseWords(s: String): String {
        return s.trim()                   // 앞뒤 공백 제거
            .split(Regex("\\s+"))         // 하나 이상의 공백 기준으로 split
            .reversed()                   // 순서 뒤집기
            .joinToString(" ")            // 단어 사이를 하나의 공백으로 연결
    }
}