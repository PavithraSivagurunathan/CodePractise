package exceptionHandling;

public class ObjectPropagation {
	
	public static void main (String[] args) {
		m1();
	}
	public static void m1() {
		try {
			  p1();
		}catch(Exception e){
			System.out.println("Arithmetic Exception");
		} 
	    
	}
	public static void p1() {
		throw new ArithmeticException();
	}
}
