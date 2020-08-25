/*Create a collection to maintain data in sorted order of Movie Rating and if 2 movies have
same rating then according to Theatrename (use Anonymous class for sorting) 
Theatre (Theatreid,Theatrename,location,Movie)
Movie (Movieid,Moviename,Rating)*/

package tuesday18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Movie
{
	int movieId;
	String movieName;
	int rating;
	public Movie(int movieId, String movieName, int rating) {
		
		this.movieId = movieId;
		this.movieName = movieName;
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", rating=" + rating + "]";
	}
	
	
	
}

class Theatre
{
	int tId;
	String tName;
	String location;
	Movie m;
	public Theatre(int tId, String tName, String location, Movie m) {
		
		this.tId = tId;
		this.tName = tName;
		this.location = location;
		this.m = m;
	}
	@Override
	public String toString() {
		return "Theatre [tId=" + tId + ", tName=" + tName + ", location=" + location + ", m=" + m + "]\n";
	}
}


public class Que7 {
	
	public static void main(String[] args) {
		Movie m=new Movie(1,"XYZ",3);
		Movie m1=new Movie(2,"PQR",2);
		Movie m2=new Movie(3,"STU",5);
		Movie m3=new Movie(4,"JKL",1);
		Movie m4=new Movie(5,"ABC",2);
		
		Theatre t=new Theatre(1,"INOX","Pune",m);
		Theatre t1=new Theatre(1,"PVR","Pune",m1);
		Theatre t2=new Theatre(1,"CITY PRIDE","Pune",m2);
		Theatre t3=new Theatre(1,"CARNIVAL","Pune",m3);
		Theatre t4=new Theatre(1,"E-SQUARE","Pune",m4);
		
		List<Theatre> ll=new ArrayList<>();
		ll.add(t);
		ll.add(t1);
		ll.add(t2);
		ll.add(t3);
		ll.add(t4);
		
		System.out.println(ll);
		
		
		Collections.sort(ll,new Comparator<Theatre>()
				{

					@Override
					public int compare(Theatre o1, Theatre o2) {
						if(o1.m.rating>o2.m.rating)
							return -1;
						if(o1.m.rating<o2.m.rating)
							return 1;
						else
						return  o1.m.movieName.compareTo(o2.m.movieName);
					}
					
				});
		
		System.out.println(ll);
		
		
		
	}

}
