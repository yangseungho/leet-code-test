package org.example.cote.etc

fun top5Words(strings: List<String>): List<Pair<String, Int>> {
    // 구분자로 단어 분리
    val words = strings
        .flatMap { it.split("\n", " ", ",") }
        .map { it.trim() }
        .filter { it.isNotEmpty() }

    // 단어별 등장 횟수 집계
//    val wordCount = words.groupingBy { it }.eachCount()
    val wordCount = mutableMapOf<String, Int>()
    words.forEach { word ->
        wordCount[word] = (wordCount[word] ?: 0) + 1
    }

    // 상위 5개 단어 추출 (등장 횟수 기준 내림차순)
    return wordCount
        .entries
        .sortedByDescending { it.value }
        .take(5)
        .map { it.key to it.value }
}

fun main() {
    val input = listOf(
        "apple, banana apple",
        "banana\norange apple",
        "kiwi apple banana",
        "mango apple kiwi",
        "water melon, pineapple"
    )

    val top5 = top5Words(input)
    top5.forEach { (word, count) ->
        println("$word: $count")
    }
}