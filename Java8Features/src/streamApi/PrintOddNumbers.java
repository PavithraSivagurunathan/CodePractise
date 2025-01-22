package streamApi;

import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.stream.*;


public class PrintOddNumbers {
 public static void main(String [] args) {
	  
	 List<Integer> list = Arrays.asList(1,6,3,7,4,108);
	 //list.add(val);
	 list.forEach(n -> System.out.println(n));
	 Stream <Integer> sr = list.stream().sorted().filter(n -> (n%2 == 1)).map(m -> m*2);
	 //Integer r =  sr.reduce(0, sr);
     sr.forEach(j -> System.out.println(j));
 }

}
