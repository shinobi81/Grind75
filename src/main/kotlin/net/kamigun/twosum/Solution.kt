package net.kamigun.twosum

import java.lang.Exception

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val memory = HashMap<Int, Int>()
        nums.forEachIndexed { index, value ->
            memory[target - value]?.let { return intArrayOf(it, index) }
            memory[value] = index
        }
        throw Exception("No solution found")
    }

//    fun twoSum(nums: IntArray, target: Int): IntArray {
//        val memory = HashMap<Int, Int>()
//        nums.forEachIndexed { index, value ->
//            val toFind = target - value
//            if (memory.contains(toFind)) {
//                return intArrayOf(memory[toFind]!!, index)
//            } else {
//                memory[value] = index
//            }
//        }
//        throw Exception("No solution found")
//    }

//    fun twoSum(nums: IntArray, target: Int): IntArray {
//        for (i in nums.indices) {
//            for (j in i + 1 until nums.size) {
//                if (nums[i] + nums[j] == target) {
//                    return intArrayOf(i, j)
//                }
//            }
//        }
//        throw Exception("No solution found")
//    }
}