package literalsanddatatypes;

public class Variables {
	//static variable
	static int val=3;//Declared and Intialized
	//Instance Variable
	int value1= 5;
	int a ;
	final static String str ="Hi Programmer" ;
	 public static void main (String[] args) {
		 //Local  Variable
		 int value2 ;
		 value2 =44;
		 final int t;	
		 t=33;
		 System.out.println("Static Variable value  : "+val);
		 System.out.println("Static final string Variable value  : "+str);
		 System.out.println("Local variable value : "+value2);
		 System.out.println("Local final variable value : "+t);
		 //In order to execute the Non-Static Variable -- create the instance of the class
		 Variables Refvar = new Variables();
		 System.out.println("Default Value of non-static character "+Refvar.a);
		 System.out.println("Instance Variable Value - "+Refvar.value1);
		 //Reinitialization of local variable and static and non static variables 
		 value2=55;
		 Variables.val=7;
		 Refvar.a = 44;
		 System.out.println("Local variable value after reinitialization: "+value2);
		 System.out.println("Static Variable value after reinitialization:  : "+val);
		 System.out.println("Non-Static Variable value after reinitialization:  : "+Refvar.a);
		 
	 }

}
