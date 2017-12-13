package day07;

public class Prob1_서현정 {
	public static void main(String args[]) {   //main method 객체 생성후, Test 진행 가능 // Class 위치 상관X
		Prob1_서현정 prob1 = new Prob1_서현정();  // 객체 생성.
		   
		// prob1.leftPad("SDS",9,'@');    //@@@@@@SDS(결과값 예측 주석)    + Sysout으로 print.
		System.out.println( prob1.leftPad("SDS", 6, '#') );
		System.out.println( prob1.leftPad("SDS", 6, '#').equals("###SDS"));   // .equals(   )     예측값 true/false 검증 가능 
		System.out.println( prob1.leftPad("SDS", 5, '$') ); 
		System.out.println( prob1.leftPad("SDS", 2, '&') );                            //검증 방법 A
		System.out.println(prob1.leftPad("SDS", 2, '&').equals("SDS"));     //검증 방법 B
		
	
	}
	public String leftPad(String str, int size, char padChar) {   // instance method(주소 필요) 내 순서는 중요. 
		String result="";
		if (str.length()> size){
			return str;      //return문 생략시 error.
		}
		int tmp=size-str.length();   //추가) 고정값 도출을 위해 
		for(int i=0; i < tmp;i++){
			result += padChar; 

	  }return result += str;
	}
}
/*
2.	입력 문자열(str)의 길이가 입력받은 수(size)가 될 때까지 
문자열의 좌측을 지정된 문자(padChar)로 채운 후 리턴한다.

3.	단, 입력 문자열(str)의 길이가 입력받은 수(size) 보다 
     큰 경우에는 원본 문자열(str)을 그대로 리턴한다.*/