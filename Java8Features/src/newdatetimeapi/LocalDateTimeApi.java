package newdatetimeapi;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeApi {
	public static void main(String[] args)
	{
		LocalDate date = LocalDate.now();
		System.out.println("Current Date --> "+date);
		LocalTime time= LocalTime.now();
		System.out.println("Current Time -- >"+time);
		LocalDateTime dttime= LocalDateTime.now();
		System.out.println(dttime);
		DateTimeFormatter fr= DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formatteddate = dttime.format(fr);	
		System.out.println(formatteddate);
		Month mon=dttime.getMonth();
		System.out.println(mon);
		int hr=dttime.getHour();
		System.out.println("hour- "+hr);
		LocalDate Particulardate = LocalDate.of(1998,10,03);
		System.out.println("My Birthday - "+Particulardate);
		LocalDateTime specificdt = dttime.withDayOfMonth(23).withYear(2016);
		System.out.println("Specific Date -"+specificdt);
	}
}
