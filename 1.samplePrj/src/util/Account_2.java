package util;

public class Account_2 {

	String name;
	String num;
	int money;

	public Account_2() {
	} // default 생성자 함수 기본적으로 생성

	public Account_2(String name, String num, int money) {
		this.name = name; // this 여부에 따라 의미가 다름.(this 현재 나의)
		this.num = num;
		this.money = money;
	}

	// 입금 처리 method
	public void deposit(int money) {
		this.money += money;
		System.out.println("입금:" + money + " 잔고:" + this.money);
	}

	// 출금 처리 method
	public void withdraw(int money) {
		if (money > this.money) {
			System.out.println("잔고부족 에러입니다.");
			return;
		}
		this.money -= money;
		System.out.println("출금:" + money + " 잔고: " + this.money);
	}

	// 잔고 조회 method
	public void display() {
		System.out.println("통장번호 :" + num + "," + name + " 잔고:" + this.money);
	}

	// 계좌 이체 method
	public void transfer(Account_2 from, Account_2 to, int money) { // 출금
																	// 통장에서(from),
																	// 입금
																	// 통장으로(to)
		if (to == null) { // 입금 통장 정보가 없을 경우
			System.out.println("계좌정보 확인하세요");
			return;
		}
		if (from.money < money) {
			System.out.println("잔고부족 에러입니다.");
			System.out.println("계좌 이체를 종료합니다.");
			return;
		}
		System.out.println("출금 계좌 정보"); // 본인 계좌에서 이체일 경우, 'from' 'this' 제외.
		from.display(); // 출금 통장 정보
		System.out.println("입금 계좌 정보");
		to.display(); // 입금 통장 정보
		System.out.println("--------------- 계좌 이체 수행중-----------------");
		from.withdraw(money); // 출금 method 불러오기
		to.deposit(money); // 입금 method 불러오기
		System.out.println("--------------- 계좌 이체 완료-----------------");

	}
}
