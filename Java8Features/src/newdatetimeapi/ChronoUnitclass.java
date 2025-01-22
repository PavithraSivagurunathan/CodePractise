package newdatetimeapi;

import java.time.LocalDate;
import java.time.temporal.*;

public class ChronoUnitclass {
	//private static final String YEARS = null;
	public static void main(String[] args) {
		CheckingChronoUnit();
	}
	public static void CheckingChronoUnit() {
		
		LocalDate  current= LocalDate.now();
		//LocalDate nextyear= current.plus(2,ChronoUnit.YEARS);
		//LocalDate year =  current.plusYears(2);
		LocalDate nextMonth = current.plus(1, (ChronoUnit.MONTHS));
		System.out.println("Year - >"+nextMonth);
		LocalDate nextday = current.plus(1,ChronoUnit.DAYS);
		System.out.println("next day - "+nextday);
		LocalDate nextweek = current.plus(2,ChronoUnit.WEEKS);
		System.out.println("After two weeks ->"+nextweek);
		
	}

}
