/**Given the string, check if it is a palindrome.

Example

For inputString = "aabaa", the output should be
checkPalindrome(inputString) = true;
For inputString = "abac", the output should be
checkPalindrome(inputString) = false;
For inputString = "a", the output should be
checkPalindrome(inputString) = true.
Input/Output

[time limit] 3000ms (java)
[input] string inputString

A non-empty string consisting of lowercase characters.

Guaranteed constraints:
1 ≤ inputString.length ≤ 105.

[output] boolean

true if inputString is a palindrome, false otherwise.
**/

boolean checkPalindrome(String inputString) {
    int start = 0;
    int end = inputString.length()-1;
    while(start<end){
        if(inputString.charAt(start) != inputString.charAt(end)){
            return false;
        }
        start++;
        end--;
    }
    return true;
}
