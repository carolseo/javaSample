package day04;

import java.util.Scanner;

public class P156 {
	public static void main(String[] args) {
	
		String command;		
		Scanner scanner = new Scanner(System.in);
		
		while(true){   // while문 반복 결과(True)  - 삽입구 위치 설정 중요 
		System.out.println("*********** 명령 선택 ************ ");
		System.out.println("                                      ");
		System.out.println("1. insert (등록)  \n");
		System.out.println("2. delete(삭제)  \n");
		System.out.println("3. update(수정) \n");
		System.out.println("4. quit   (종료)     \n");
		System.out.println("**********************************\n \n");
		System.out.println("수행할 명령을 선택하세요!");       
		System.out.println(" 1 2 3 4 중 하나를 선택하세요 ");	
		
		command = scanner.nextLine();     // 현재 버전에서는 command swift 가능. 구버전에서는 char type 추출했어야.
		
		switch(command){
			case "1":
				System.out.println("등록 작업을 수행합니다.");
				break;
			case "2":
				System.out.println("삭제 작업 수행합니다.");
				break;
			case "3":
				System.out.println("수정 작업 수행합니다.");
				break;
			case "4":
				System.out.println("프로그램 종료합니다.");
				System.exit(0);    // 프로그램 종료 명령어 
				
				default:        // 예외 상황 제어
					System.out.print(" 1 2 3 4 중 하나를 선택하세요.  _");   // ln 삭제후, "_ "추가하면 커서 깜빡임 가능. 
						
		}
						
					}
		}
		
	

}
