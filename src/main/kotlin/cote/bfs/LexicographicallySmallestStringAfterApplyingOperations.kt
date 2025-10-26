package org.example.cote.bfs

import java.util.LinkedList
import java.util.Queue
import kotlin.math.abs
import kotlin.math.pow

//https://leetcode.com/problems/lexicographically-smallest-string-after-applying-operations
/*
입력값:

문자열 s: 짝수 길이의 숫자 문자열

정수 a: 홀수 인덱스(1,3,5,...)의 숫자들에 더할 값

정수 b: 오른쪽으로 회전할 크기

가능한 연산:

Add 연산

홀수 인덱스에 있는 숫자들에 a를 더함.

더한 값이 9보다 크면 % 10 해서 0~9 사이로 순환.

예) "3456", a=5
→ 홀수 인덱스(1,3)에 +5
→ "3951"

Rotate 연산

문자열을 오른쪽으로 b칸 회전.

예) "3456", b=1 → "6345"
 */

class LexicographicallySmallestStringAfterApplyingOperations {
    fun findLexSmallestString(s: String, a: Int, b: Int): String {
        val queue = LinkedList<String>()
        val visitQueue = mutableSetOf<String>()
        var result = s
        val size = s.length
        queue.add(s)

        while (queue.isNotEmpty()) {
            val q = queue.removeFirst()
            if (!visitQueue.add(q)) continue
            if (result > q) result = q

            // ADD 연산
            val addQ = StringBuilder()
            for (i in q.indices) {
                if (i % 2 == 0) { // 짝수
                    addQ.append(q[i])
                } else { // 홀수
                    val cal = (q[i].digitToInt() + a) % 10
                    addQ.append(cal)
                }
            }
            println("addQ : $addQ")
            queue.addLast(addQ.toString())
            // Rotate 연산
            val mod = b % size
            val rotate = q.substring(size - mod) + q.substring(0, size - mod)
            queue.addLast(rotate)
            println("rotate : $rotate")

            // 나머지 처리
            visitQueue.add(q)

        }
        return result
    }
}