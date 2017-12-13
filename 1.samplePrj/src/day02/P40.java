package day02;

import java.util.Scanner;

public class P40 {
	public static void main(String[] args) {
		Scanner input = null; //커서 놓고 import 혹은 Typing
		input = new Scanner(System.in); //only 객체 생성시 에러(스캐너 특성) 자원미반납 경고표시. 소스정보in

		System.out.print("학생이름을 입력하세요:_");
		String name = input.nextLine(); //name변수 생성후 키보드입력에 의한 데이터(문자열) in. Return type method
		
		System.out.print("점수를 입력하세요 ex)90_");
		// int score = Integer.parseInt(input.nextLine()); //String값을 int값으로 변환함. input.nextLine(한줄 전체 처리).
		//API확인 중요, 예외 가능성 포함.
		int score = input.nextInt();
		input.nextLine(); //input ENTER 처리 명령
		
		
		
		System.out.printf("이름: %s , 점수: %d %n",name,score); //printf 는(삽입구) 입력 가능.
		
		input.close(); //키보드 입력 연결 철회(자원 미반납 경고에 따른 closing)
		input = null;  //G.C. 이동 방지.
	}

}
