package org.example.cote.chatGPT

// 문자열 s가 주어질 때, 괄호가 올바르게 닫혀 있으면 true, 아니면 false를 반환하라.

class ValidParentheses {
    fun isValid(s: String): Boolean {
        val stack = ArrayDeque<Char>()

        for (c in s) {
            when (c) {
                ']' -> {
                    if (stack.isEmpty() || stack.removeLast() != '[') return false
                }
                ')' -> {
                    if (stack.isEmpty() || stack.removeLast() != '(') return false
                }
                '}' -> {
                    if (stack.isEmpty() || stack.removeLast() != '{') return false
                }
                else -> stack.addLast(c)
            }
        }
        return stack.isEmpty()
    }
}