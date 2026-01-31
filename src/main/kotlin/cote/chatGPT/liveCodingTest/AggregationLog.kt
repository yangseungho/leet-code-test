package org.example.cote.chatGPT.ab180

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

data class Log(
    val timestamp: LocalDateTime,
    val userId: String,
    val endpoint: String
)

class AggregationLog {
    fun aggregateLogs(lines: List<String>): Map<String, Map<String, Int>> {
        val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss")

        // minute -> endpoint -> userId set
        val bucket = mutableMapOf<String, MutableMap<String, MutableSet<String>>>()

        for (line in lines) {
            val parts = line.split(",")
            if (parts.size != 3) continue

            val time = LocalDateTime.parse(parts[0], formatter)
            val userId = parts[1]
            val endpoint = parts[2]

            val minuteKey = time.format(DateTimeFormatter.ofPattern("HH:mm"))

            val endpointMap = bucket.getOrPut(minuteKey) { mutableMapOf() }
            val userSet = endpointMap.getOrPut(endpoint) { mutableSetOf() }

            userSet.add(userId)
        }

        // 결과 변환
        val result = mutableMapOf<String, Map<String, Int>>()
        for ((minute, endpointMap) in bucket) {
            result[minute] = endpointMap.mapValues { it.value.size }
        }

        return result
    }
}