package net.kamigun.mergetwosortedlists

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class SolutionTest {
    private val underTest = Solution()

    @ParameterizedTest
    @MethodSource("data")
    fun `mergeTwoLists should return correct result`(list1: ListNode?, list2: ListNode?, expected: ListNode?) {
        val actual = underTest.mergeTwoLists(list1, list2)

        assertEquals(expected?.toList(), actual?.toList())
    }

    companion object {
        @JvmStatic
        fun data() = listOf(
            Arguments.of(ListNode(1).also { first -> first.next = ListNode(2).also { it.next = ListNode(4) } },
                ListNode(1).also { first -> first.next = ListNode(3).also { it.next = ListNode(4) } },
                ListNode(1).also { first ->
                    first.next = ListNode(1).also { second ->
                        second.next = ListNode(2).also { third ->
                            third.next = ListNode(3).also { forth ->
                                forth.next = ListNode(4).also { fifth ->
                                    fifth.next = ListNode(4)
                                }
                            }
                        }
                    }
                }),
            Arguments.of(null, null, null),
            Arguments.of(null, ListNode(0), ListNode(0)),
        )
    }
}
