package hackerrank_Programs;

import java.util.Arrays;
import java.util.List;

/*In this challenge, you are required to calculate and print the sum of the elements in an array, keeping in mind that some of those integers may be quite large.

Function Description

Complete the aVeryBigSum function in the editor below. It must return the sum of all array elements.

aVeryBigSum has the following parameter(s):

int ar[n]: an array of integers .
Return

long: the sum of all array elements
Input Format

The first line of the input consists of an integer .
The next line contains  space-separated integers contained in the array.

Output Format

Return the integer sum of the elements in the array.

Sample Input

5
1000000001 1000000002 1000000003 1000000004 1000000005
Output

5000000015
Note:

The range of the 32-bit integer is .

When we add several integer values, the resulting sum might exceed the above range. You might need to use long int C/C++/Java to store such sums.*/



public class SumOfLongNumbers {
	
	public static void main (String [] args) {
		List<Long> LR = Arrays.asList(1000000001l,1000000002l,1000000003l,1000000004l,1000000005l);
		System.out.println("Sum of Elements in the array - "+sumofnumbers(LR));
		
	}
public static long sumofnumbers(List<Long> l) {
	long sc= l.stream().mapToLong(n ->n).sum();
	return sc;
}	
	
	

}
