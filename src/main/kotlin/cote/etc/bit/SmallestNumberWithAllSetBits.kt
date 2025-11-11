package org.example.cote.etc.bit

class SmallestNumberWithAllSetBits {
    fun smallestNumber(n: Int): Int {
        var k = 1
        var x = (1 shl k) - 1

        while (x < n) {
            k++
            x = (1 shl k) - 1
        }
        return x
    }
}