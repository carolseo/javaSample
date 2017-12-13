package day04;

import java.util.Scanner;

public class P155 {
	public static void main(String[] args) {
		char gender;
		String regNo; // 주민등록번호
		Scanner scanner = new Scanner(System.in);
		System.out.println("주민등록번호를 입력하세요.    입력 예:[990909-2933314]"); // 7번째 숫자 추출(성별정보)
																		
		regNo = scanner.nextLine();
		// 유효성 검증 조건 필수.
		if (regNo.length() != 14) { // length가 14가 아닐 경우.
			System.out.println("주민등록번호 에러.");
			return;
		}
		gender = regNo.charAt(7); // charAt 추출 method
		System.out.println(regNo + "    => " + gender);

		switch (gender) {
		case '1':
		case '3':
			System.out.println("남성");
			break;
		case '2':
		case '4':
			System.out.println("여성");
			break;
		default:
			System.out.println("주민번호 오류.");
		}
	}
}
