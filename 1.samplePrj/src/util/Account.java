package util;

public class Account {
	String name; // 예금주 이름
	String accNo; // 계좌번호
	int balance; // 잔고

	Account() {
	}

	Account(String name, String accNo, int balance, int deposit, int withdraw) {
		this.name = name;
		this.accNo = accNo;
		this.balance = balance;

	}

	public void display() { // 계좌 정보 메소드
		System.out.println("이름 : " + name);
		System.out.println("계좌번호 : " + accNo);
		System.out.println("잔액 : " + balance);
	}

	void deposit(int amount) { // 입금 메소드
		this.balance += amount;
		System.out.println(amount + "원을 입금하고, 잔액은 " + balance + "원입니다.");
	}

	void withdraw(int amount) { // 출금 메소드
		balance -= amount;
		System.out.println(amount + "원을 인출하고, 잔액은 " + balance + "원입니다.");
	}

	public void finaldisplay() { // 통장정보출력
		System.out.printf("Account[%s 계좌의 잔고는 %d 입니다.]%n", accNo, balance);
	}
}
