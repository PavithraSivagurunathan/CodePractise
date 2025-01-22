/*
Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero. Print the decimal value of each fraction on a new line with  places after the decimal.

Note: This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers with absolute error of up to  are acceptable.

Example

There are  elements, two positive, two negative and one zero. Their ratios are ,  and . Results are printed as:

0.400000
0.400000
0.200000
Function Description

Complete the plusMinus function in the editor below.

plusMinus has the following parameter(s):

int arr[n]: an array of integers
Print
Print the ratios of positive, negative and zero values in the array. Each value should be printed on a separate line with  digits after the decimal. The function should not return a value.

Input Format

The first line contains an integer, , the size of the array.
The second line contains  space-separated integers that describe .

Constraints



Output Format

Print the following  lines, each to  decimals:

proportion of positive values
proportion of negative values
proportion of zeros
Sample Input

STDIN           Function
-----           --------
6               arr[] size n = 6
-4 3 -9 0 4 1   arr = [-4, 3, -9, 0, 4, 1]
Sample Output

0.500000
0.333333
0.166667
Explanation

There are  positive numbers,  negative numbers, and  zero in the array.
The proportions of occurrence are positive: , negative:  and zeros: .

*/

package hackerrank_Programs;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;

public class ProportionCheck {
	
	public static void main (String [] args) {
		
		List<Integer> li = Arrays.asList(-4, 3, -9, 0, 4, 1);
		System.out.println(li);
		plusminus(li);
		
	}
	public static void plusminus(List<Integer> arr) {
		int p=0;
		int n=0;
		int z=0;
		for(int ar=0;ar<arr.size();ar++) {
			if(arr.get(ar) >0) {
				p++;
			}else if(arr.get(ar)<0) {
				n++;
			}else {
				z++;
			}
			
		}
		System.out.format("%.6f",Proportion(p,arr.size()));
		System.out.print("\n");
		System.out.format("%.6f",Proportion(n,arr.size()));
		System.out.print("\n");
		System.out.format("%.6f",Proportion(z,arr.size()));
		
	}
	
	public static float Proportion(int a,int b) {
		float proportion =0.0f;
		proportion = (float)a/b;
		return proportion;
		
	}

}
