package day03;

public class Prob1_서현정 {
	public static void main(String[] args) {
		
		 // char c ='a', d='A'; // -32   +32
		//System.out.println(c+ " "+(int)(c++)+ ", "+d+"  "+(int)(d++));    //casting하여 ASCII코드로 변환.(int)
		
		char ch = 'a';
		char lowerCase = ('A' <= ch && ch <= 'Z')  ? (char)(ch - 32): ch;    // 'A', 'Z' 는 자동 프로모션되기 때문에 그대로(ASCII코드)
 		System.out.print("ch:"+ch);
		System.out.println(" to lowerCase :"+lowerCase);
		
 
        /*
        다음은 대문자를 소문자로 변경하는 코드입니다.
        변수 ch에 저장된 '문자가 대문자 인 경우'에만 
	소문자로 변경하는 코드를 완성 합니다.
*/
		
	

/*
 아래는 변수 num의 값에따라 ' 양수 음수 0'을 출력하는 코드입니다.     // 판별을 위한 중첩If구문 사용 가능 
삼항 연산자를 이용해서 에 알맞은 코드를 완성하세요. 
*/
	int num = -90;
	String result  = null;    // 변수가 문자열임을 파악, 로컬변수 선언 필요 (기본초기화 null)
	                                           // 주소형 default 초기화_ null or blank "  "
	result = (num>0)? "양수" : ((num<0)? "음수" :"0") ;      // 조건 3개중 2개만 정의. 1개는 나머지로 자동 처리.
	System.out.println(num+" : " + result);
	

	}

}
