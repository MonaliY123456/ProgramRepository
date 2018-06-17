package scp.Prototype.com;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable{
private String shopnm;
List <Book> listofbook=new ArrayList<>();
public String getShopnm() {
	return shopnm;
}
public void setShopnm(String shopnm) {
	this.shopnm = shopnm;
}
public List<Book> getListofbook() {
	return listofbook;
}
public void setListofbook(List<Book> listofbook) {
	this.listofbook = listofbook;
}
@Override
public String toString() {
	return "\n BookShop [shopnm=" + shopnm + ", listofbook=" + listofbook + "]";
}

void show()
{
	for(int i=1;i<=10;i++)
	{
		Book b=new Book();
		b.setBkid(i);
		b.setBk_nm("Book"+i);
		listofbook.add(b);
	}
}
@Override
protected Object clone() throws CloneNotSupportedException {
	
	return super.clone();
}


}
 
 