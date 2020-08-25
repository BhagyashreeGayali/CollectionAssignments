package tuesday18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/*Hotel serves delicious Menus to its Customers. It maintains list of Orders given on daily basis. Order list is maintained as ArrayList<Order>. Each Order contains orderid, MenuName, price,
 qtyOrdered. (Price of same Menu may vary according hours).
From ArrayLsit of Orders create a map <String,Float> where Menu Name is key and total sale in a day for theMenu as Value. (sale for the menu is Price*qty ordered).Eg. Order List for a day is :

[(80,”Pav Bhajee”,120.00,5), (90,”Grilled Sandwitch”,72.00,10),   (92,”Hakka Noodles”,220.00,2), (96,”Pav Bhajee”,125.00,8),        (101,”Grilled Sandwitch”,70.00,2)]

Then Map would be like this :
{{“Pav Bhajee”,(120*5)+(125*8) ie.1600},   {“Hakka Noodles”, 440}, {“Grilled Sandwitch”,860}}*/

class Order
{
	int orderid;
	String MenuName;
	int price;
	int qtyOrder;
	public Order(int orderid, String menuName, int price, int qtyOrder) {
		
		this.orderid = orderid;
		this.MenuName = menuName;
		this.price = price;
		this.qtyOrder = qtyOrder;
	}
	@Override
	public String toString() {
		return "\norder [orderid=" + orderid + ", MenuName=" + MenuName + ", price=" + price + ", qtyOrder=" + qtyOrder
				+ "]";
	}
}
public class Que11 {

	public static void main(String[] args) {
		Order o=new Order(1,"Pav-Bhaji",30,5);
		Order o1=new Order(2,"Pani-Puri",20,6);
		Order o2=new Order(3,"Omlet",25,5);
		Order o3=new Order(4,"Vada-Pav",10,5);
		Order o4=new Order(5,"Pav-Bhaji",30,5);
		Order o5=new Order(6,"omlet",30,5);
		Order o6=new Order(7,"Uttapa",30,5);
		
		List<Order> ll=new ArrayList<>();
		ll.add(o6);
		ll.add(o);
		ll.add(o5);
		ll.add(o4);
		ll.add(o3);
		ll.add(o2);
		ll.add(o1);
		
		Map<String, Float> mp=new HashMap<>();
		Iterator<Order> itr=ll.iterator();
		
			while(itr.hasNext())
			{
				Order temp=itr.next();
				if(mp.containsKey(temp.MenuName))
				{
					mp.put(temp.MenuName, mp.get(temp.MenuName)+(temp.price*temp.qtyOrder));
				}
				else
				{
					mp.put(temp.MenuName, (float) (temp.price*temp.qtyOrder));
				}
				
			}
			System.out.println(mp);
			
		

	}

}
