/**
Given an array of strings, return another array containing
 all of its longest strings.

Example

For inputArray = ["aba", "aa", "ad", "vcd", "aba"], the
output should be
allLongestStrings(inputArray) = ["aba", "vcd", "aba"].

Input/Output

[time limit] 3000ms (java)
[input] array.string inputArray

A non-empty array.

Guaranteed constraints:
1 ≤ inputArray.length ≤ 10,
1 ≤ inputArray[i].length ≤ 10.

[output] array.string

Array of the longest strings, stored in the same order
as in the inputArray.
**/


String[] allLongestStrings(String[] inputArray) {
  List<String> inputList = new ArrayList(Arrays.asList(inputArray));
  int max = 0;
  for (int i = 0; i < inputList.size(); i++) {
      if(i == 0){
        max = inputList.get(i).length();
        continue;
      }
      if(inputList.get(i).length() < max){
        inputList.remove(i);
        i--;
        continue;
      }
      if(inputList.get(i).length() > max){
        max = inputList.get(i).length();
        for (int j = i-1; j >= 0; j--) {
        inputList.remove(j);
        i--;
      }
    }
  }
  return inputList.toArray(new String[inputList.size()]);
}
