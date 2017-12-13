package day03;

public class P113 {
	public static void main(String[] args) {
		int i=10, j=10;
		System.out.println(i==j);
		
		String name1 = new String("hello");
		String name2 = new String("hello");
		String name3 = name1;
		
		System.out.println("name1==name2 => "+(name1==name2));
		System.out.println("name1==name3 => "+(name1==name3));
		
		System.out.println("name1.equals(name2) => "+name2.equals(name1));
		System.out.println("name1.equals(name2) => "+name1.equals(name2));	 // 객체 비교는 항상 equals method 사용해야.
		System.out.println("name1.equals(name3) => "+name1.equals(name3));
		// 자바 모든 객체는 equals 보유.
		// static 주소 X, Class name 대체 사용.
		System.out.println("=====================");
		String s1 = "java";  	// String 경우 기본형처럼 new없이 사용 일반적. (미세한 메모리 차이, 메모리 관리 차원)
		String s2 = "java";  // code표에서 직접 불러오기.(new 객체 생성X)
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.length()); // index 수 확인.  전체수-1 (0부터 시작)
		/* System.out.println(s1.charAt(4));  //문자의 index 범주 벗어남.  */
		
			
		
	}

}
