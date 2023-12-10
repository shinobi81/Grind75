package net.kamigun.mergetwosortedlists

class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        if (list1 == null) return list2
        if (list2 == null) return list1

        var l1 = list1
        var l2 = list2
        var tail: ListNode
        if (l1.`val` <= l2.`val`) {
            tail = ListNode(l1.`val`)
            l1 = l1.next
        } else {
            tail = ListNode(l2.`val`)
            l2 = l2.next
        }
        val head = tail

        do {
            if (l1 == null) {
                tail.next = l2
                return head
            }
            if (l2 == null) {
                tail.next = l1
                return head
            }

            if (l1.`val` <= l2.`val`) {
                tail.next = ListNode(l1.`val`)
                l1 = l1.next
            } else {
                tail.next = ListNode(l2.`val`)
                l2 = l2.next
            }
            tail = tail.next!!
        } while (true)
    }

//    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
//        if (list1 == null) return list2
//        if (list2 == null) return list1
//
//        return if (list1.`val` <= list2.`val`) {
//            val result = ListNode(list1.`val`)
//            result.next = mergeTwoLists(list1.next, list2)
//            result
//        } else {
//            val result = ListNode(list2.`val`)
//            result.next = mergeTwoLists(list1, list2.next)
//            result
//        }
//    }
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
    fun toList(list: MutableList<Int> = mutableListOf()): MutableList<Int> {
        list.add(`val`)
        return next?.toList(list) ?: list
    }
}
