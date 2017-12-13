package day07;

public class Prob1 {
	public static void main(String args[]) {
		Prob1 prob1 = new Prob1();
		
		System.out.println( prob1.leftPad("SDS", 6, '#') );
		System.out.println( prob1.leftPad("SDS", 5, '$') ); 
		System.out.println( prob1.leftPad("SDS", 2, '&') ); 
	}
	public String leftPad(String str, int size, char padChar) {
		String result = "";
		for(int i=0; i < size-str.length();i++){
			result += padChar;		
		}
			result += str;
			return result;     
	}
}
/*
2.	입력 문자열(str)의 길이가 입력받은 수(size)가 될 때까지 
문자열의 좌측을 지정된 문자(padChar)로 채운 후 리턴한다.

3.	단, 입력 문자열(str)의 길이가 입력받은 수(size) 보다 
     큰 경우에는 원본 문자열(str)을 그대로 리턴한다.*/