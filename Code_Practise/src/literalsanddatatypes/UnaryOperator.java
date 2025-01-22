package literalsanddatatypes;
import java.util.Scanner;
public class UnaryOperator {
	static Scanner sc=new Scanner(System.in);
	public static void main (String[] args) {
		System.out.println("Enter the values : ");
		int a = sc.nextInt();
		//Post Increment
		int b=a++;
		System.out.println("Post Incremental b -> "+b);
		System.out.println("Post Incremental a -> "+a);
		//Pre Increment
		int c=++a;
		System.out.println("pre Incremental c-> "+c);
		System.out.println("pre Incremental a-> "+a);
		//post Decrement 
		int d=a--;
		System.out.println("Post Decremental d-> "+d);
		System.out.println("Post Decremental a-> "+a);
		//Pre-Decrement 
		int e =--a;
		System.out.println("pre Decremental e-> "+e);
		System.out.println("pre Decremental a-> "+a);
	}

}
