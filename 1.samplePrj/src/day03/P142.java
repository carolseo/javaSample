package day03;

import java.util.Scanner;

public class P142 {
	public static void main(String[] args) { 
	// 키보드를 통해서 점수를 입력 받고 (Scanner)
		int jumsu;
		char grade=' ';
		Scanner scanner= new Scanner(System.in) ;   // Scanner class 객체 생성
		System.out.println("점수를 입력하세요!      입력예시)100      ");
		jumsu = Integer.parseInt(scanner.nextLine());   // 문자열을 정수값으로 변환해야함. Integer.parselnt
		
	if (!(0<=jumsu && jumsu <=100)){       //점수 유효성 체크, !(not) 제어 추가.
		System.out.println("jumsu가 유효하지 않아 종료됩니다.");  //메시지 처리 항상 유의.
		return;  // 함수의 수행을 끝내서 호출 시작으로 복귀하는 명령어. (함수 수행 종료) / return뒤 공백 > void
	}	
		// 등급처리 조건문 (하단)  - 중첩 if 처리
	System.out.println("이제부터 등급처리~~~");
	if(jumsu >= 90){
		grade = 'A';
	} else if(jumsu >= 80){
		grade = 'B';
	} else if (jumsu >=70){
		grade ='C';
	} else if (jumsu >=60){
		grade ='D';
	} else {    	// 나머지 전체 처리
		grade ='F';
	}
	
	System.out.println(jumsu+ " 의 등급은 "+grade);   //초기화 미포함 에러이므로 char grade ' ' 초기화.
	
	}

}
