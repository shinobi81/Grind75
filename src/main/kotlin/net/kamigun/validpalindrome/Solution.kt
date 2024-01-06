package net.kamigun.validpalindrome

class Solution {
    fun isPalindrome(s: String): Boolean {
        return s.filter { it.isLetterOrDigit() }.let { it.equals(it.reversed(), true) }
    }

//    fun isPalindrome(s: String): Boolean {
//        val lowercase = s.filter {
//            it.isLetterOrDigit()
//        }.lowercase()
//
//        if (lowercase.length <= 1) return true
//
//        for (i in 0 until lowercase.length / 2) {
//            if (lowercase[i] != lowercase[lowercase.length - 1 - i]) {
//                return false
//            }
//        }
//
//        return true
//    }
}