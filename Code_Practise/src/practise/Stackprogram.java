package practise;

public class Stackprogram {
	static int add(int a,int b) {
		int c=a+b;
		return c;
	}
	static void display(int sum) {
		System.out.println("The sum of the value is "+sum);
	}
	static {
		System.out.println("Static block executed first before mainmethod:");
	}
	
	public static void main(String [] args) {
		int a1=3;
		int a2=5;
		int s=add(a1,a2);
		display(s);
		
	}

}
