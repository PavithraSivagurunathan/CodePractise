package optionalclassAPI;

import java.util.Optional;

public class OptionalClassStaticmethods {
	public static void main(String[] args) {
		String [] words = new String[5];
		Optional <String> check = Optional.empty();
		System.out.println("Check ->"+check);
		
		Optional <String> cn= Optional.ofNullable(words[2]);
		//System.out.println(cn);
		if(cn.isPresent()) {
			System.out.println("Not a empty string");
		}else {
			System.out.println("Empty String");
		}
		words[2] = "Second String..";
		Optional <String> str= Optional.of(words[2]);
		System.out.println("STR-"+str);
		System.out.println(str.get());
		System.out.println(str.hashCode());
		System.out.println(str.isPresent());
		
	}
	

}
