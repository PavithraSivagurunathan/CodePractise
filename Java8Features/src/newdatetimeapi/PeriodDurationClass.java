package newdatetimeapi;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.*;

public class PeriodDurationClass {
	
	public static void main(String[] args) {
		Period();
		Duration();		
	}
	public static void Period() {
		LocalDate currentdate = LocalDate.now();
	    LocalDate Olddate = LocalDate.of(2024,Month.OCTOBER, 3);	
	    Period gap= Period.between(Olddate,currentdate);
	    System.out.println("Gap between the days ->"+gap);
	}
	public static void Duration() {
		LocalTime currenttime = LocalTime.now();
		Duration pluss= Duration.ofHours(5);
		LocalTime timetobe=currenttime.plus(pluss);
		System.out.println("Time duration -"+timetobe);
		Duration diff= Duration.between(timetobe,currenttime);
		System.out.println("Time difference - >"+diff);
		
		
	}

}
