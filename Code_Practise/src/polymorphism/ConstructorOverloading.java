package polymorphism;

public class ConstructorOverloading {
	int a;
	String str;
	ConstructorOverloading(){
		super();
	}
	ConstructorOverloading(int a,String b){
		super();
		this.a=a;
		this.str=b;
	}
	public static void main(String[] args) {
         ConstructorOverloading ne=new ConstructorOverloading();//Constructor Overloading ..
         System.out.println(ne.a);
         System.out.println(ne.str);
         ConstructorOverloading ne1=new ConstructorOverloading(1, "pavi");
         System.out.println(ne1.a);
         System.out.println(ne1.str);
	}

}
