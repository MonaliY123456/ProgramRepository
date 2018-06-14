package scp.design.factory;

public class TicketFactory {

	public static TicketClass getTicketInstance( TicketType type) {
		
		if(type.equals(TicketType.reserved))
		{
			return new Reservation();
		}
		else if(type.equals(TicketType.general))
		{
			return new GeneralClass();
		}
		return null;
	}
	
	enum TicketType
	{
		reserved,
		general;
	}
}

