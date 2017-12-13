package day03;

public class P120 {
	public static void main(String[] args) {
		char c = '!';	// 0 1 ~ 9 기본 숫자 범주
		boolean f1,f2; 
		boolean result = (f1= '0' <=c) && (f2= c <='9');       //숫자인지 아닌지에 대한 판별식 A
		System.out.println(result);
		
		boolean result1 = 48 <=c & c <=57;      //숫자인지 아닌지에 대한 판별식 B(ASCII코드 사용)

		
		System.out.println('0' +" => "+((int)'0'));  	//숫자 0에 해당하는 ASCII코드 (판별식 B)
		System.out.println('9' +" => "+((int)'9'));   
		
		System.out.println(c + "숫자?" + result); 	// (판별식 A)
		
		System.out.println(Integer.toBinaryString(11));    // 2진수 변환 명령 (논리연산)
		System.out.println("     "+Integer.toBinaryString(3));    // 2진수 변환 명령
		System.out.println("       "+ (11 & 3));	 //비트 연산
	
	}

}
