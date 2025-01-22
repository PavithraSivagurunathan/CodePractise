package exceptionHandling;

public class UncheckedExceptionHandling {
	
	public static void main(String[] args) {
		 int a=1;
		 int b=0;
		 try {
			int c=a/b; 
		 }catch (ArithmeticException e) {
			 System.out.println("Exception has been resulted in this function");
			 
		 }
	}

}
