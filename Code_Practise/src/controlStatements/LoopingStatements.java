package controlStatements;

import java.util.Scanner;

public class LoopingStatements {
  public static void main (String[] args) {
	  Scanner sc= new Scanner(System.in);
	  System.out.println("Enter the value for the Outer Loop -->");
	  int outer=sc.nextInt();
	  System.out.println("Enter the value for the Inner Loop -->");
	  int inner= sc.nextInt();
	  for (int i=1;i<=outer;i++) {
		  for (int j=1;j<=inner;j++) {
			  System.out.println(i+" "+j);
	  }
	  } 
  }
}
