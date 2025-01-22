package exceptionHandling;

public class MultipleCatchBlocks {
	
	public static void main (String[] args) {
		int a = 2;
		int b=0;
		try {
			int c=a/b;
		}catch(NullPointerException n) {
			System.out.println("Null values are here ");
		}catch(NumberFormatException C) {
			System.out.println("Number Format Ecception");	
		}catch (Exception E) {
			System.out.println("Exception in processing the data");
		}
	}

}
