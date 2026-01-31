package org.example.cote.chatGPT

/*
정수 배열 nums와 정수 target이 주어진다.
배열에서 두 수의 합이 target이 되는 인덱스 두 개를 반환하라.
같은 원소를 두 번 사용할 수 없다.
 */

class TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int, Int>() // value -> index

        for (i in nums.indices) {
            val remain = target - nums[i]
            if (map.containsKey(remain)) {
                return intArrayOf(map[remain]!!, i)
            }
            map[nums[i]] = i
        }
        return intArrayOf()
    }
}