package day15.inner03;

public class Test01 {
	public static void main(String[] args) {
		if(args.length ==0){  //args 값이 없을 경우 조건 처리
			System.out.println("select | delete | update | insert | select ");
			System.out.println("중 하나를 파라미터로 입력해주세요.");
			return;
		}
		Command delete = new DeleteCommand(); // 기존 class객체(Command interface
												// 구현함) 생성
		// delete.exec();

		Command insert = new Command() { // 'Command를 implements한 익명 class' 객체
											// 생성 (interface내에 abstract
											// method있으므로 overriding 필요)
			public void exec() {
				System.out.println("등록 작업 수행 합니다.");
			}
		};
		// insert.exec();

		Command update = new Command() {
			public void exec() {
				System.out.println("수정 작업 수행합니다.");
			}
		};
		// update.exec();

		Command select = new Command() {
			public void exec() {
				System.out.println("목록 뿌리기 수행합니다.");
			}
		};
		// select.exec();
		
		Command search = new Command() {   //new 초기화후 ctrl+space 로 불러오기 가능.
			@Override
			public void exec() {
				System.out.println("검색 수행합니다.");
			}
		};
		// search.exec();
		
		if(args[0].equals("insert")){insert.exec();
	}else if(args[0].equals("update")){update.exec();
	}else if(args[0].equals("select")){select.exec();
	}else if(args[0].equals("search")){search.exec();
	}else if(args[0].equals("delete")){delete.exec();
	}else{System.out.println("입력값이 오류가 발생했습니다.");			
				System.out.println("select | delete | update | insert | select 중 하나를 파라미터로 입력해주세요.");}

	}	
}

interface Command { // Command는 interface이므로 메모리에 올라가지X, '구현 객체' 필요
	void exec();
}

class DeleteCommand implements Command {     //Class 직접 모델링 방법 
	@Override
	public void exec() {
		System.out.println("삭제 작업 수행합니다.");
	}
}