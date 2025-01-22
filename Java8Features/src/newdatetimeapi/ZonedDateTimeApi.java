package newdatetimeapi;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.ZoneId;

public class ZonedDateTimeApi {
	
	public static void Zoneddatetime() {
		LocalDateTime current = LocalDateTime.now();
		System.out.println("The Current Date ->"+current);
		ZonedDateTime Zoned= ZonedDateTime.now();
		System.out.println("The Current Date with Zone ->"+Zoned);
		System.out.println("Zone - >"+Zoned.getZone() );
		ZoneId zdX=ZoneId.of("Asia/Tokyo");
		System.out.println("Zone id of TamilNadu ->"+zdX);
		ZonedDateTime ty= Zoned.withZoneSameInstant(zdX);
		System.out.println(ty);
		DateTimeFormatter fr=DateTimeFormatter.ofPattern("DD-MM-YYYY HH:MM:SS");
		String formatteddate = ty.format(fr);
		System.out.println("Formatted Zoned Time - >"+formatteddate);
		
	}
   public static void main(String[] args) {
	   Zoneddatetime();	   
   }
}
