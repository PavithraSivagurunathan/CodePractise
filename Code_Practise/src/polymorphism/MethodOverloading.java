package polymorphism;

public class MethodOverloading {
	int r;
	char a;
	MethodOverloading(){
		
	}
	MethodOverloading(int r,char a){
		this.r=r;
		this.a=a;
				
	}
	public static void display() {
		System.out.println("Display Method with empty parameter list-");
	}
	public static void display(int a,String str) {
		System.out.println("Display method with parameter list - "+a+"-"+str);
	}
	public void add(int a,int b) {
		System.out.println("Addition of two values = "+(a+b));
	}
	public void add(int a,int b,int c) {
		System.out.println("Addition of two values = "+(a+b+c));
	}
	public static void main(String[] args) {
		MethodOverloading md=new MethodOverloading(1,'a'); //Constructor Overloading polymorphism
		System.out.println(md.a);
		md.add(1, 3);//Method Overloading
	}

}
