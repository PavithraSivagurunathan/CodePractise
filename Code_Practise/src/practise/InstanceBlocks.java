package practise;

public class InstanceBlocks {
	int a;
	String b;
	{
		System.out.println("-----");
		System.out.println("Instance blocks:");
		System.out.println("-----");
		a=1;
		b="Instance";
	}
	public static void main (String [] args) {
		System.out.println("Before intializing value by instance blocks");
		InstanceBlocks blk=new InstanceBlocks();
		System.out.println("After intializing value by instance blocks "+blk.a+" and "+blk.b);
	}

}
