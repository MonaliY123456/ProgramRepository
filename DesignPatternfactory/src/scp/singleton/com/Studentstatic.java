package scp.singleton.com;

public class Studentstatic {
	private int studid;
	private String studnm;
	private static final Studentstatic obj;

	@Override
	public String toString() {
		return "StudentDemo [studid=" + studid + ", studnm=" + studnm + "]";
	}

	static {
		obj = new Studentstatic(10, "Monali");
	}

	private Studentstatic(int studid, String studnm) {
		super();
		this.studid = studid;
		this.studnm = studnm;
	}

	public static Studentstatic getInstance() {
		return obj;
	}

}
