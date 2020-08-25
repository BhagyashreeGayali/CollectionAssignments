/*There is arraylist which contains objects of class BookSale { Book b , int copiesSold }
Book { int bookid , String author , float price } 
There is also a hashmap which contains information about business done by each book.
Map<int bookid , float amount> Map already has information about all books and business
done till now. You can take hardcoded values in map. Write a program to update map using
new information in given array. If book is present in map calculate its business amount (price
* copiessold) and add to existing amount in map. If book is not present add its entry in map.*/


package tuesday18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Book
{
	int bookid;
	String auther;
	float price;
	public Book(int bookid, String auther, float price) {
		this.bookid = bookid;
		this.auther = auther;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", auther=" + auther + ", price=" + price + "]";
	}
	
	
} 
class BookSale
{
	Book b;
	int CopiesSold;
	public BookSale(Book b, int copiesSold) {
		this.b = b;
		CopiesSold = copiesSold;
	}
	@Override
	public String toString() {
		return "BookSale [b=" + b + ", CopiesSold=" + CopiesSold + "]";
	}
	
	
}
public class Que1
{
	public static void main(String[]args)
	{
		Book b=new Book(1,"XYZ",10.00f);
		Book b1=new Book(2,"PQR",12.32f);
		Book b3=new Book(3,"STU",65.23f);
		Book b4=new Book(4,"JKL",61.23f);
		
		BookSale bs=new BookSale(b,2);
		BookSale bs1=new BookSale(b1,3);
		BookSale bs2=new BookSale(b3,1);
		BookSale bs3=new BookSale(b4,4);
		
		ArrayList<BookSale> al=new ArrayList<>();
		al.add(bs);
		al.add(bs1);
		al.add(bs1);
		al.add(bs3);
			//id     amount
		Map<Integer,Float> mp=new HashMap<>();	
		mp.put(1,78.75f);
		mp.put(2, 34.12f);
		mp.put(3,781.75f);
		mp.put(4, 341.12f);
		
		for(Map.Entry<Integer, Float> en:mp.entrySet())
		{
			for(BookSale ab:al)
			{
				if(en.getKey()==ab.b.bookid)
				{
					
					Float price1=en.getValue()+(ab.b.price*ab.CopiesSold);
					mp.put(en.getKey(),price1);
				}
				else
				{
					mp.put(ab.b.bookid,(ab.b.price*ab.CopiesSold));
				}
					
			}
			System.out.println(en.getKey()+" \t\t"+en.getValue());
		}
		
	}
}
