package IsEmptyMethods;

import java.util.Optional;

public class IsEmptyMethod {
	
	public static void main (String [] args) {
		String[] str = new String[5];
		Optional op=Optional.ofNullable(str[2]);
		if(op.isEmpty()) {
			System.out.println(op.isEmpty());
		}else {
			System.out.println(op.isEmpty());
		}
	}

}
