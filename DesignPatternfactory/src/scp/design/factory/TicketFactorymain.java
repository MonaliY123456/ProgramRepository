package scp.design.factory;

import scp.design.factory.TicketFactory.TicketType;

public class TicketFactorymain {

	public static void main(String args[])
	{
		 TicketClass obj=TicketFactory.getTicketInstance(TicketType.reserved);
		 TicketClass obj1=TicketFactory.getTicketInstance(TicketType.general);
		 
		 System.out.println(obj==obj1);
		 System.out.println(obj instanceof Reservation);
		 System.out.println(obj1 instanceof GeneralClass);
	}
	
}
