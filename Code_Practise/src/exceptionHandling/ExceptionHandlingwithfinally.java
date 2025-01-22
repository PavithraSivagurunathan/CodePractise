package exceptionHandling;

public class ExceptionHandlingwithfinally {

	public static void main (String[] args) {
		int a=1;
		int b=0;
		try {
			int c=a/b;
		}catch(Exception E) {  //Try block statement results in the arithmetic exception
			//here we mention the superclass from where the arithmetic exception Inherited - Upcasted
			System.out.println("Error in Performing the Arithmetic Operation ");	
		}finally {
			System.out.println("Final Block always executed Irrespective of the exception");
		}
	}
}
