package scp.singleton.com;

public class Studentthreadsafe {
	private int studid;
	private String studnm;
	private static Studentthreadsafe obj=null;
	public Studentthreadsafe(int studid, String studnm) {
		super();
		this.studid = studid;
		this.studnm = studnm;
	}
	public static synchronized Studentthreadsafe getInstance()
	{
		if(obj==null)
		{
			obj=new Studentthreadsafe(20,"Kiran");
		}
			return obj;
		}
	}
	
	
	

