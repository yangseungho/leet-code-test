package cote.chatGPT.liveCodingTest

import org.example.cote.chatGPT.ab180.AggregationLog
import org.junit.jupiter.api.Test

class AggregationLogTest {
    private val agg = AggregationLog()
    @Test
    fun `Example Case`() {
        val logs = listOf(
            "2026-01-01T10:00:01,u1,/login",
            "2026-01-01T10:00:10,u2,/login",
            "2026-01-01T10:01:01,u1,/order",
            "2026-01-01T10:01:30,u1,/order",
            "2026-01-01T10:02:00,u3,/login"
        )
        val result = agg.aggregateLogs(logs)
        print(result)
    }
}