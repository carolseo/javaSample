package day05;

import java.util.Arrays;

public class P206 {

	public static void main(String[] args) {
		// int와 String 배열구조의 차이점?   -> String 구조는 객체명 뒤에 .  붙임(ref.이므로)
		int[]      scores = {99,88,78,97,100};
		String[] names = {"홍길동", "고길동", "박길동", "최길동", "이길동"};
		
	for(int i = 0;i < names.length; i++ ){
	System.out.println(names[i].charAt(0)+"**   " + scores[i]);   //names[i] -> String type   // 주민번호 뒷자리 응용가능
	}
		
	System.out.println("=============================================");
	for(int data:scores){     // : 다음 집합체 배치(int 추출)
		System.out.println(data);
	}	
	for(String data:names){
		System.out.println(data);    //(String 추출)
	}
		
			
	}
}
