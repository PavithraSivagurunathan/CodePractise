package practise;

public class staticandInstanceblocks {
	static int val=22;
	static char lt = 'r';
	int inst = 44;
	double f= 0.5d;
	static {
		System.out.println("Intializing the Static variables : ");
		val = 55;
		lt='e';
	}
	{
		 System.out.println("Intializing the Instance variables :");
		inst = 55;
	}
 public static void main(String[] args) {
	 System.out.println("Main method executes after the static block execution");
	 System.out.println("Static value after reinitalization "+ val+" "+lt);
	 staticandInstanceblocks b= new staticandInstanceblocks();
	 System.out.println("Instance variables after reinitialization"+b.inst +" "+b.f);
 }
}
