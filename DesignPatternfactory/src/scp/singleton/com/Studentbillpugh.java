package scp.singleton.com;

public class Studentbillpugh {
	private int studid;
	private String studnm;
	
	private Studentbillpugh(int studid, String studnm) {
		super();
		this.studid = studid;
		this.studnm = studnm;
	}
	private static final class Studentinnerclass
	{
		private static final Studentbillpugh obj=new Studentbillpugh(10,"pranje");
	}
	public static Studentbillpugh getInstance()
	{
		
		return Studentbillpugh.Studentinnerclass.obj;
		
	}
	
}
