package tuesday18;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Que12 {

	public static void main(String[] args) {
		Map<String, String> mp=new HashMap<>();
		mp.put("5789234081","BJP");
		mp.put("9397862546","Congress");
		mp.put("9883467843","Shivsena");
		mp.put("8976356287", "AAP");
		mp.put("9875342681","BJP");
		mp.put("5982390578", "Rashtrvadi");
		mp.put("9237930950","AAP");
		
		Map<String,Integer> mp2=new HashMap<>();
		Set st=mp.entrySet();
		Iterator itr=st.iterator();
		while(itr.hasNext())
		{
			Entry temp=(Entry)itr.next();
			if(mp.containsKey((String)temp.getValue()))
			{
				mp.put((String)temp.getValue(),mp.get((String)temp.getValue())+1);
			}
			else
			{
				mp2.put((String)temp.getValue(),1);
			}
		}
		System.out.println(mp2);
	}

}
