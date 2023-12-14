package net.kamigun.maxprofit

class Solution {
    fun maxProfit(prices: IntArray): Int {
        if (prices.size < 2) return 0
        var tail = 0
        var max = 0
        for (head in 1 until prices.size) {
            val currentPrice = prices[head] - prices[tail]
            if (currentPrice < 1) tail = head
            else max = maxOf(currentPrice, max)
        }
        return max
    }

//    fun maxProfit(prices: IntArray): Int {
//        var maxDiff = 0
//        for (i in prices.indices) {
//            for (j in i + 1 until prices.size) {
//                val diff = prices[j] - prices[i]
//                if (maxDiff < diff) maxDiff = diff
//            }
//        }
//
//        return maxDiff
//    }
}
