package scp.design.factory;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public abstract class TicketClass {
     abstract double fare();
     abstract String Source();
     abstract String Destination();
     abstract Date journeydate() throws ParseException;
    
}

 
 class GeneralClass extends TicketClass
 {

	@Override
	double fare() {
		// TODO Auto-generated method stub
		return 250;
	}

	@Override
	String Source() {
		// TODO Auto-generated method stub
		return "Wardha";
	}

	@Override
	String Destination() {
		// TODO Auto-generated method stub
		return "Pune";
	}

	@Override
	Date journeydate() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss"); 

		Date date = (Date) sdf.parse("2016-03-10 9:02:12");

		return date;
	}
	 
 }
 
 
 class Reservation extends TicketClass
 {

	@Override
	double fare() {
		// TODO Auto-generated method stub
		return 650;
	}

	@Override
	String Source() {
		// TODO Auto-generated method stub
		return "Pune";
	}

	@Override
	String Destination() {
		// TODO Auto-generated method stub
		return "Mumbai";
	}

	@Override
	Date journeydate() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss"); 

		Date date = (Date) sdf.parse("2016-03-10 9:02:12");

		return date;
		
	}
	 
 }