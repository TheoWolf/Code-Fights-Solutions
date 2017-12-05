/**
Ticket numbers usually consist of an even number
of digits. A ticket number is considered lucky if
the sum of the first half of the digits is equal
to the sum of the second half.

Given a ticket number n, determine if it's lucky or not.

Example

For n = 1230, the output should be
isLucky(n) = true;
For n = 239017, the output should be
isLucky(n) = false.
Input/Output

[time limit] 3000ms (java)
[input] integer n

A ticket number represented as a positive integer with
 an even number of digits.

Guaranteed constraints:
10 ≤ n < 106.

[output] boolean

true if n is a lucky ticket number, false otherwise.
**/

boolean isLucky(int n) {
  int length = (int)(Math.log10(n)+1);
  int sum1 = 0;
  int sum2 = 0;
  int iter = 0;
  int num = n;
  while (num > 0){
      if (iter < length/2){
          sum1 = sum1 + num % 10;
          num =  num / 10;
      }else{
          sum2 = sum2 + num % 10;
          num =  num / 10;
      }
      iter++;
  }
  return sum1 == sum2;
}
