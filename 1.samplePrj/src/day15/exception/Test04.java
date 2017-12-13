package day15.exception;

public class Test04 {
	public static void main(String[] args) {
		Account a = new Account();
		try {
			a.setMoney(-900);   //setMoney method에 throws{} 적용
		} catch (Exception e) {
		System.out.println(e.getMessage());
		}
		System.out.println("===================");
		try {
			Account b = new Account("000",-500);
			System.out.println(b);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("END");
	}
}
class Account{
	String name;
	int money;
	
	public Account() {
		super();
	}
	public Account(String name, int money) throws Exception{
		this.name = name;
		setMoney (money); //setMoney에 throw 걸기 
	}
	public void setMoney(int money) throws Exception {  //throws 예외발생 설계 
		if(money<0){  //사용자는 문제 발생 원인을 모름.
			throw	new Exception("money error");
			}
			this.money = money;
	}
	@Override
	public String toString() {
		return "Account [name=" + name + ", money=" + money + "]";
	}
	
}