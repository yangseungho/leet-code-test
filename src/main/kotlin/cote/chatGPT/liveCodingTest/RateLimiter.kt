package org.example.cote.chatGPT.ab180

class RateLimiter (
    private val limit: Int = 5,
    private val windowSeconds: Long = 60
) {
    private val requests = mutableMapOf<String, ArrayDeque<Long>>()
    fun allowRequest(userId: String, timestamp: Long): Boolean {
        val queue = requests.getOrPut(userId) { ArrayDeque() }

        //오래된 요청 제거
        while (queue.isNotEmpty() && queue.first() <= timestamp - windowSeconds) {
            queue.removeFirst()
        }

        if (queue.size >= limit) return false

        queue.addLast(timestamp)
        return true
    }
}