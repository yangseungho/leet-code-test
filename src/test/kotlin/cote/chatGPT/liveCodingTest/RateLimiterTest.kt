package cote.chatGPT.liveCodingTest

import org.example.cote.chatGPT.ab180.RateLimiter
import org.junit.jupiter.api.Test

class RateLimiterTest {
    private val rateLimiter = RateLimiter()

    @Test
    fun `Example Case`() {
        val userId = "user1"
        for (i in 0 .. 7) {
            val result = if (i == 0) {
                rateLimiter.allowRequest(userId, 1)
            } else {
                rateLimiter.allowRequest(userId, i * 10L)
            }
            println("$i -> $result")
        }
    }
}