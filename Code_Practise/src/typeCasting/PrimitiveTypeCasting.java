package typeCasting;

public class PrimitiveTypeCasting {
	static int a = 12;
	 static float f =1.2f;
	static double d=222.4d;
	public static void main (String [] args) {
		
		long r = (long) a; //Upcasting - 
		System.out.println(r);
		float fr = (float)d;//DownCasting 
		System.out.println(fr);
		
		
		
	}

}
