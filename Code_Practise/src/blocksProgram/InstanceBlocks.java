package blocksProgram;

public class InstanceBlocks {
	int a;
	String sr;
	{
		a=33;
		sr="Hi..";
	}
	public static void main(String [] args ) {
		
		InstanceBlocks blk = new InstanceBlocks();
		System.out.println(blk.a +"- -"+blk.sr);
	}

}
