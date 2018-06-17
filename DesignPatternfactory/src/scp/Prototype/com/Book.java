package scp.Prototype.com;

import java.util.ArrayList;
import java.util.List;

public class Book {
	private int bkid;
	private String bk_nm;

	public int getBkid() {
		return bkid;
	}

	public void setBkid(int bkid) {
		this.bkid = bkid;
	}

	public String getBk_nm() {
		return bk_nm;
	}

	public void setBk_nm(String bk_nm) {
		this.bk_nm = bk_nm;
	}

	
	@Override
	public String toString() {
		return " \n Book [bkid=" + bkid + ", bk_nm=" + bk_nm + "]";
	}
	

}


