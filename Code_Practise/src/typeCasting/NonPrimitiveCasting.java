package typeCasting;

public class NonPrimitiveCasting extends ClassNonprimtitveA {
	int d = 5;
	public static void main (String [] args) {
		ClassNonprimtitveA ref= new NonPrimitiveCasting();
		NonPrimitiveCasting ref1=(NonPrimitiveCasting) ref;
		System.out.println(ref.r);// parent type accessing the parent member 
		System.out.println(ref.d);//parent type accessing the parent member
		System.out.println(ref1.d);// Parent type unable to access the child Member so it has been downcasted to the childtype - Down casting ..
		System.out.println(ref1 instanceof ClassNonprimtitveA);
		 
	}

}

