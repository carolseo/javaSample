package day08;

public class P294 {
	public static void main(String[] args) {
		String s1 = new String();   //default
		System.out.println(s1);

		String s2 = new String("Hello");   //문자열(char의 배열)
	  	System.out.println(s2);
	
	  	char[] c = {'a','b','c','d','e','f'};  //선언과 배열 동시에
	  	String s3 = new String(c,0,4);  //일정부분 쪼개서 생성 
	  	System.out.println(s3);
	}

}
