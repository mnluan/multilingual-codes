class PalindromeChecker{
    constructor(input) {
        this.input = input;
      }

      check() {
        // A reverse version of the string stored in the "input" variable is created
        const reversedInput = this.input.split('').reverse().join('');

        // Checks if the reverse string is identical to the original
        return this.input === reversedInput;
      }
}

function main() {
    
    // Use window.prompt to get the input from the user
    const input = window.prompt('Enter a string:');
    
    //Capitalizes text and removes whitespace to avoid errors
    const string = input.toUpperCase().replace(/\s/g, '');

    const checker = new PalindromeChecker(string);
    const isPalindrome = checker.check();

    if (isPalindrome) {
      window.alert(`The string '${input}' is a palindrome.`);
    } else {
      window.alert(`The string '${input}' is not a palindrome.`);
    }
}

// Call the main function when the page loads
main();
