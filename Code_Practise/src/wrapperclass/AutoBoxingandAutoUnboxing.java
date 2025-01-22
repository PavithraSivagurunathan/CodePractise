package wrapperclass;

import java.lang.*;

public class AutoBoxingandAutoUnboxing {
	public static void main(String[] args) {
		Integer li = new Integer(10);
		String str="10";
		int i=li;//autounboxing
		int i1=li.intValue();
		int val = Integer.parseInt(str);
		Integer r = i1; //auto Boxing
		Integer r11=Integer.valueOf(i1);
		System.out.println(i);
		System.out.println(i1);
		System.out.println(val);
		System.out.println(r);
		
	}

}
