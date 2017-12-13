package day19.prob1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Prob2 {
	public static void main(String[] args) {
		String str = "PROD-001#X-note#Samsung#3#6000000#";
		
		//Set<String> strs = stringSplit(str, "#");
		Prob2.Se ed = new Prob2().new Se();   //inner class 사용. 
		
		Set<String> list = ed.stringSplit(str,"#"); 
		System.out.println(list);
		Iterator <String> it = list.iterator();
		while (it.hasNext()) {
			String data = (String) it.next();
			System.out.println(data);
		}
	}
class Se{
	private Set<String> stringSplit(String str, String string) { //static이 아닐 경우
		Set<String> set = new HashSet<>();
		int p = -1;  // #위치가 없음. 
		
	 //	p=str.indexOf("#",p+1); 
	//	set.add(str.substring(0,p));
		
		do{
			if(p+1>=str.length()) break;  //마지막 # 찾기 예외 처리 
			set.add(str.substring(p+1,p=str.indexOf("#",p+1)));  //p+1이후 그다음 # 찾기.
		}while(p!=-1);
		
		return set;
		}
}
}
