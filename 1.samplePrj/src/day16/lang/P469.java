package day16.lang;

import java.util.Arrays;

public class P469 {
	public static void main(String[] args) {
		String [] ss = {"x","aa","bb","44"};
		System.out.println(Arrays.toString(ss));
		Arrays.sort(ss);
		System.out.println(Arrays.toString(ss));  //숫자 < 영문 사전나열순서로 sorting됨.
		// compareTo()/ return type 정수 
		System.out.println("x".compareTo("aa")); //양수 일 경우, 앞에수 큼.
		System.out.println("aa".compareTo("bb"));  //음수 일 경우, 앞에수 작음.
		System.out.println("aa".compareTo("aa")); //0일 경우, 동일함.
		System.out.println("===============================");
		
		String msg = "Hello java test......";
		char[] ssss = msg.toCharArray();   //Char배열로 변환.
		System.out.println(msg.indexOf('j'));
		System.out.println(msg.indexOf('a',7));
		System.out.println(msg.indexOf("java"));
		System.out.println(msg.indexOf("javap"));  // 해당문자열이 없을 경우 항상 -1로 표시 
		
		System.out.println(msg.substring(msg.indexOf('t')));  //substring(indexOf) 문자열 추출
		System.out.println(msg.substring(msg.lastIndexOf(' ')+1));
		
		String data = "홍길동  / 90/70/77";
		String[] datas = data.split("/");     //문자열별로 쪼개기 . split()
		
		int sum = 0;
		for(int i = 1; i<datas.length; i++){
			sum += Integer.parseInt((datas[i].trim()));    
		}
		System.out.printf("이름: %s 총점: %d  평균: %.2f",datas[0],sum,sum/3.0);

		
	}
}
