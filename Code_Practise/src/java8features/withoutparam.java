package java8features;

@FunctionalInterface
interface show{
	void print();
	
}
public class withoutparam {
	static void display (show t) {
		t.print();
		System.out.println("hello");
	}
	public static void main(String [] args) {
		display(() -> System.out.println("date"));
	}

}
