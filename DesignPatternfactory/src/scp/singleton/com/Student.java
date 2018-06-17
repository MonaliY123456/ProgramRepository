package scp.singleton.com;

public class Student {
	// eager initialisation
	private int studid;
	private String studnm;
	private static final Student obj = new Student(100, "MONALI"); //

	private Student(int studid, String studnm) {
		super();
		this.studid = studid;
		this.studnm = studnm;
	}

	public static Student getInstance() {
		return obj;
	}

}
