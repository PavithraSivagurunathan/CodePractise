package hackerrank_Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComparingTriplets {
	
	public static void main (String[] args) {
		
		List<Integer> a =Arrays.asList(1,2,4) ;
		List<Integer> b =Arrays.asList(1,2,1) ;
		compareTriplets(a,b );
		System.out.println(compareTriplets(a,b ));
		
	}

public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
    int al=0;
    int bl=0;
      for(int i=0;i<a.size();i++){
      if(a.get(i) >b.get(i)){
        al++;
      }else if(a.get(i) < b.get(i)){
        bl++;
      }else if(a.get(i) == b.get(i)){
        //No change
      }
      }
     List <Integer> li = new ArrayList<Integer>();
     li.add(al);
     li.add(bl);
   return  li;
}
}