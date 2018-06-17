package scp.singleton.com;

public class StudentLazy {

	private int studid;
	private String studnm;
	private static  StudentLazy obj;  
	private StudentLazy(int studid, String studnm) {
		super();
		this.studid = studid;
		this.studnm = studnm;
	}
	public static StudentLazy getInstance()  
	{
		if(obj==null)
		{
			obj=new StudentLazy(30,"Tanya");
		}	
	return obj;

	}
	
}
