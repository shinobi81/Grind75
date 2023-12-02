package net.kamigun.validparentheses

/**
 * Why ArrayDeque is better than LinkedList
 * https://stackoverflow.com/questions/6163166/why-is-arraydeque-better-than-linkedlist
 */
class Solution {
    fun isValid(s: String): Boolean {
//        if (s.length % 2 != 0) return false
        val stack = ArrayDeque<Char>()
        s.forEach {
            when (it) {
                '(', '{', '[' -> stack.add(it)
                ')' -> if (stack.isEmpty() || stack.removeLast() != '(') return false
                '}' -> if (stack.isEmpty() || stack.removeLast() != '{') return false
                ']' -> if (stack.isEmpty() || stack.removeLast() != '[') return false
            }
        }
        return stack.isEmpty()
    }

//    private val toFind = hashMapOf(Pair('(', ')'), Pair('{', '}'), Pair('[', ']'))
//    private val openParenthesis = setOf('(', '{', '[')
//
//    fun isValid(s: String): Boolean {
//        val stack = ArrayDeque<Char>()
//        s.forEach {
//            when {
//                openParenthesis.contains(it) -> stack.add(it)
//                stack.isNotEmpty() && it == toFind[stack.last()] -> stack.removeLast()
//                else -> stack.add(it)
//            }
//        }
//        return stack.isEmpty()
//    }
}