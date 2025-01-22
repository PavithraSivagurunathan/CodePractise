package streamApi;

@FunctionalInterface
interface Predicates {
	int odd (int n);
}

public class Predicate{
	 public boolean test (int n){
	return (n%2==1);
	 }
	 public static void main(String[] args) {
		 int nde=999;
		Predicates d = (nd) -> {
			System.out.println(nd);
			nd=nd%2;
			return nd;
		};
		d.odd(nde);
	 }
}