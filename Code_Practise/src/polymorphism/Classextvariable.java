package polymorphism;

public class Classextvariable extends VariableShadowing {
	int price;
	Classextvariable(){}
	Classextvariable(int a){
		this.price=a;
	}
	public static void main (String[] args) {
		VariableShadowing vl= new Classextvariable(5); //Constructor OverLoading..
		Classextvariable r=(Classextvariable) vl;
		System.out.println(vl.price);
		System.out.println(r.price);
	}

}
