package day20;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class P659 {
	public static void main(String[] args) {
		Properties p = new Properties();
		System.out.println(p);
		
		p.setProperty("java01", "1234");  //순서대로 나열X
		p.setProperty("java02", "5234");
		p.setProperty("java05", "6234");
		System.out.println(p);
		
		System.out.println(p.getProperty("java05"));

		Set key = p.keySet();   //key값만 추출 
		Iterator it = key.iterator();   //순회문
		while (it.hasNext()) {
			String data = (String) it.next();
			System.out.println(data+": "+p.getProperty(data));
		}
	
	}
}
