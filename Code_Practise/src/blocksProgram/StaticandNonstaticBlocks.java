package blocksProgram;

public class StaticandNonstaticBlocks {
	static int a;
	static String S;
	float f;
	long l;
	static {
		 a=55;
		 S="Static Blocks Executed First -";	
		 System.out.println(a);
		 System.out.println(S);
	}
	{
	  f=2.2f;
	  l=4444442224L;
	}
	
	public static void main(String[] args) {
		System.out.println("MainMethod executed after the static blocks");
		StaticandNonstaticBlocks ref= new StaticandNonstaticBlocks();
		System.out.println("Instance blocks are executed after the object being Created ..");
		System.out.println(ref.f);
		System.out.println(ref.l);
		
	}

}
