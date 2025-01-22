package jvmProcess;

public class JvmExecution {
	static char a='a';
	static boolean b=true;
	int r =4;
	String rd="instance blocks values";
	static {
		System.out.println("static blocks executed First");
		System.out.println("Before Reintialization - "+a+"--"+b);
		a='r';
		b=false;
		System.out.println("After Reinitialization - "+a+"--"+b);
	}
	{
		System.out.println("Instance blocks executed when object for this has been created ..");
	  r=8;
	  rd="Instance block value after reintialized";
	}
	public static void main(String [] args) {
		
		System.out.println("Main Method");
		JvmExecution jv= new JvmExecution();
		System.out.println(a + "-"+b);
		System.out.println(jv.r+"-"+jv.rd);
		
		
	}

}
