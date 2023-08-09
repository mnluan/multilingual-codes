import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("Enter a string: ")
    val input = scanner.nextLine()

    val checker = PalindromeChecker(input)
    val isPalindrome = checker.check()

    if (isPalindrome) {
        println("The string '$input' is a palindrome.")
    } else {
        println("The string '$input' is not a palindrome.")
    }
}

class PalindromeChecker(private val input: String) {
    fun check(): Boolean {
        // Remove all spaces from the input string
        val inputWithoutSpaces = input.replace("\\s+".toRegex(), "")

        // A reverse version of the string stored in the "inputWithoutSpaces" variable is created
        val reversedInput = inputWithoutSpaces.reversed()

        // Converts both the input without spaces and reversed strings to uppercase before comparison
        val upperCaseInput = inputWithoutSpaces.toUpperCase()
        val upperCaseReversedInput = reversedInput.toUpperCase()

        // Checks if the reverse string (in uppercase) is identical to the original (in uppercase)
        return upperCaseInput == upperCaseReversedInput
    }
}