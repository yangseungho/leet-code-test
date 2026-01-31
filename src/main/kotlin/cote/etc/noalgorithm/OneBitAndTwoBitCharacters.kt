package org.example.cote.etc.noalgorithm

class OneBitAndTwoBitCharacters {
    fun isOneBitCharacter(bits: IntArray): Boolean {
        var i = 0
        val n = bits.size
        while (i < n -1) {
            i += if (bits[i] == 1) {
                2
            } else {
                1
            }
        }
        return i == n - 1
    }
}