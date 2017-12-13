package day04;

public class test2 {

	public static void main(String[] args) {
		System.out.println(day04.test1.PI);   // 직접 생성한 Class
		System.out.println(test1.PI);      // 소속된 PKG이므로 PKG명 생략 가능 
		
		System.out.println(Byte.MAX_VALUE);  // 자바에서 제공한 Class(java.lang) / 상수화 처리된 변수
	
		System.out.println(Math.PI);   //수학 정보 기반 
	
	}

}
