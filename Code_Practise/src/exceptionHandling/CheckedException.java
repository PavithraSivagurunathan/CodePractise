package exceptionHandling;

import java.sql.SQLException;

public class CheckedException {
	
	public static void main (String[] args)  {
		
		throw new SQLException();  //Compile time error because this exception is Checked Exception or Compile aware Exception
	}

}
