import org.junit.Test
import kotlin.test.assertEquals

class PalindromeCheckerTest {

    @Test
    fun testPalindrome() {
        val palindrome = PalindromeChecker("racecar")
        assertEquals(true, palindrome.check())
    }

    @Test
    fun testNonPalindrome() {
        val nonPalindrome = PalindromeChecker("helloworld")
        assertEquals(false, nonPalindrome.check())
    }

    @Test
    fun testEmptyString() {
        val emptyString = PalindromeChecker("")
        assertEquals(true, emptyString.check())
    }

    @Test
    fun testWhitespace() {
        val whitespace = PalindromeChecker("123 321")
        assertEquals(true, whitespace.check())
    }

    @Test
    fun testMixedCasePalindrome() {
        val mixedCasePalindrome = PalindromeChecker("Socorram Me Subi No Onibus Em Marrocos")
        assertEquals(true, mixedCasePalindrome.check())
    }

    @Test
    fun testMixedCaseNonPalindrome() {
        val mixedCaseNonPalindrome = PalindromeChecker("Not a Palindrome")
        assertEquals(false, mixedCaseNonPalindrome.check())
    }
}