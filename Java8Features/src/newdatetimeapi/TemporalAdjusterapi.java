package newdatetimeapi;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjusterapi {
	public static void main(String[] args) {
		checkTemporalAdjust();
	}
	public static void checkTemporalAdjust(){
		
		LocalDate currentdate = LocalDate.now();
		LocalDate dt=currentdate.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println("First Day of this month - >"+dt);
		LocalDate nextday = currentdate.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
		System.out.println("Nextsat--"+nextday);
		
	}

}
