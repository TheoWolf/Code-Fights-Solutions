/**
Some people are standing in a row in a park. There are
trees between them which cannot be moved. Your task is
to rearrange the people by their heights in a non-descending
order without moving the trees.

Example

For a = [-1, 150, 190, 170, -1, -1, 160, 180], the output
should be
sortByHeight(a) = [-1, 150, 160, 170, -1, -1, 180, 190].

Input/Output

[time limit] 3000ms (java)
[input] array.integer a

If a[i] = -1, then the ith position is occupied by a tree.
Otherwise a[i] is the height of a person standing in the
ith position.

Guaranteed constraints:
5 ≤ a.length ≤ 15,
-1 ≤ a[i] ≤ 200.

[output] array.integer

Sorted array a with all the trees untouched.
**/


int[] sortByHeight(int[] a) {
  int[] b = Arrays.copyOf(a, a.length);
  int[] result = Arrays.copyOf(a, a.length);
  Arrays.sort(b);
  int i = 0;
  int j = 0;
  while(i < a.length){
      while(j < b.length ){
          if(b[j] == -1){
              j++;
          }else{
              break;
          }
      }
      if(a[i] != -1){
          result[i] = b[j];
          j++;
      }
      i++;
  }
  return result;
}
