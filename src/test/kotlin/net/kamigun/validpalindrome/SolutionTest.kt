package net.kamigun.validpalindrome

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class SolutionTest {
    private val underTest = Solution()

    @ParameterizedTest
    @MethodSource("data")
    fun isPalindrome(s: String, expected: Boolean) {

        val actual = underTest.isPalindrome(s)

        assertEquals(expected, actual)
    }

    companion object {
        @JvmStatic
        fun data() = listOf(
            Arguments.of("A man, a plan, a canal: Panama", true),
            Arguments.of("race a car", false),
            Arguments.of(" ", true),
            Arguments.of("0P", false),
        )
    }
}