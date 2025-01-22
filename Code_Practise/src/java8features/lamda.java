package java8features;

@FunctionalInterface
interface lambdadisplay {
      void display();
}
// In previous version in order to implement the interface a class will be created 
public class lamda{
	
	public static void main (String[] args) {
		lambdadisplay ds =() -> {
			System.out.println("Hi Lambda Expression");
		};
		ds.display();
	}
	
}
/* Anonymous Inner class 
{
			System.out.println("Hi Lambda Expression");
		}; -- Body of lambda Expression 
  () - argument list of the method ,here jvm knows that correctly identify the method bcoz it has only one abstract method 
  -> lambda expression (Arrow Token)
  ds - instance of the functional interface
  Cannot create instance for the interface but can be achieved with the help by creating for the class with implements it .
*/