package controlStatements;

public class DecisonMakingStatements {
	//Static Variable 
	static int a=10 ;
	char b='a';
	boolean c=true;
public static void main (String[] args) {
	//if - else statement
	if (a==10) {
		a=25;	
		System.out.println("a"+a);
	}else {
		a=40;
	}
	DecisonMakingStatements s=new DecisonMakingStatements();
	s.b = 'd';
	System.out.println("a"+a);
	System.out.println("b"+s.b);
	//if statement
	if(a==25) {
		a=55;
		System.out.println("a-"+a);
	}
	//if-elseif-else statement 
	String t="a,b,c";
	if(t.endsWith("b")) {
		System.out.println("String - "+t);
	}else if(t.startsWith("a")) {
		System.out.println("First Letter is a");
	}else {
		System.out.println("String is "+t);		
	}
	//Nested if else statement - Having the if else in another if statement 
	int g=12;
	char k='u';
	boolean m=false;
	if(g==12) {
		if(k=='h') {
			System.out.println("The letter is H");
		}
		else if(k=='u') 
		{
			System.out.println("Letter is u");	
		}
	}else if(g==66) {
		System.out.println("else if statement");
	}else {
		m=true;
		System.out.println("M"+m);
	}
	
	
}
}
