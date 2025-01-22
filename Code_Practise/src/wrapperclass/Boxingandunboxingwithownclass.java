package wrapperclass;

public class Boxingandunboxingwithownclass {
	static int a=11;
	public static void main(String[] args) {
	Integer1 ref = Integer1.valueOf(a);
	System.out.println(ref); //Implicitly toString is added by compiler that has been overridden in Integer class
	int r = ref.intValue();
	System.out.println(r);
	}

}
