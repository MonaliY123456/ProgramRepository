package scp.Prototype.com;

import java.util.ArrayList;
import java.util.List;

public class TestPrototype {

	public static void main(String[] args) throws CloneNotSupportedException {
		BookShop obj=new BookShop();
		obj.setShopnm("VijayBookDepo");
		obj.show();
		System.out.println(obj);
		
		BookShop obj2=(BookShop) obj.clone();
		obj2.setShopnm("BookShelf");
		System.out.println(obj2);
		
		
		
		
		
	}

}
