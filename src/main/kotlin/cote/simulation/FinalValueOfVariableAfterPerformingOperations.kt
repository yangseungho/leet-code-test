package org.example.cote.simulation

// https://leetcode.com/problems/final-value-of-variable-after-performing-operations

class FinalValueOfVariableAfterPerformingOperations {
    private val operationMap = mapOf<String, Int> (
        "++X" to 1,
        "X++" to 1,
        "--X" to -1,
        "X--" to -1,
    )

    fun finalValueAfterOperations(operations: Array<String>): Int {
        var x = 0
        for (op in operations) {
            x += operationMap[op] ?: error("Invalid operation: $op")
        }
        return x
    }
}