package optionalclassAPI;

import java.util.Optional;

public class OptionalClass {
	
	public static void main (String [] args) {
		String[] words = new String [10];
		System.out.println("5th word in the array is :"+words[5]);
		//String word = words[5].toLowerCase();
		//System.out.println("Word at the index 5 :"+word);
		Optional <String> checknull = Optional.ofNullable(words[5]);
		
		if(checknull.isPresent()) {
			System.out.println("Word at index 5 is "+words[5]);
		}else {
			System.out.println("value is null");
		}
		
	}

}
