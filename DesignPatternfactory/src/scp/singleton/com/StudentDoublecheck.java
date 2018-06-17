package scp.singleton.com;

public class StudentDoublecheck {
	private int studid;
	private String studnm;
	private static StudentDoublecheck obj=null;
	public StudentDoublecheck(int studid, String studnm) {
		super();
		this.studid = studid;
		this.studnm = studnm;
	}
   public static StudentDoublecheck getInstance()
   {
	   if(obj==null)
	   {
		   synchronized(StudentDoublecheck.class)
		   {
			   if(obj==null)
			   {
				   obj=new StudentDoublecheck(20,"Shraddah");
			   }
		   }
		
	   }
	return obj;
   }
	
	
}
   

