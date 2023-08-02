import java.util.Scanner

class PalindromeChecker(private val input: String){
    fun check(): Boolean{

        //A reverse version of string stored in the "input" variable is created
        val reversedInput = input.reversed()

        //Checks if the reverse string is identical to the original
        return input == reversedInput
    }
}

fun main(){

    val scanner = Scanner(System.`in`)

    println("Enter a string: ")
    val input = scanner.nextLine()
    val string = input.uppercase().replace(" ", "")

    val checker = PalindromeChecker(string)
    val isPalindrome = checker.check()

    if (isPalindrome) {
        println("The string '$input' is a palindrome.")
    }else{
        println("The string '$input' is not a palindrome.")
    }
}