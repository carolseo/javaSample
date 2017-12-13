package day19; //Set - HashSet

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
	public static void main(String[] args) {
		Set<String> set= new HashSet<>();   //HashSet과 TreeSet은 호환됨.
		// Set<String> set= new TreeSet<>();    //TreeSet: 내부적으로 comparable이 작동되어 sorting됨
		set.add("java 09");
		set.add("java 07");
		set.add("java 01");
		set.add("java 04");
		System.out.println(set);  //set은 중복 불가능. /들어간 순서대로 나열 순서가 없음.
		set.remove("java 07");  // set.remove() 객체 구분시 삭제 가능.
		System.out.println(set);
		
		Iterator<String> it = set.iterator();  //String type
		while (it.hasNext()){
			String data = it.next();
			System.out.println(data.substring(data.length()-2)); //숫자만 추출
		}
		
		Iterator itt = set.iterator();  //Object type (String type이 overriding되어서 객체 전체 표시됨)
		while(itt.hasNext()){
			Object data = itt.next();
			System.out.println(data); //substring 적용시, casting 꼭 필요.
		}
		set.add("java 99");
		set.add("java 59");
		set.add("java 49");
		set.add("java 19");
		System.out.println(set);
	}
}
