package org.example.cote.etc.noalgorithm

// https://leetcode.com/problems/check-if-all-1s-are-at-least-length-k-places-away

class CheckIfAllOnesAreAtLeastLengthKPlacesAway {
    fun kLengthApart(nums: IntArray, k: Int): Boolean {
        var oneCount = -1
        for (i in nums.indices) {
            if (nums[i] == 1) {
                if (oneCount != -1 && oneCount < k) return false
                oneCount = 0
            } else if (oneCount == -1){
                continue
            } else {
                oneCount++
            }
        }
        return true
    }
}