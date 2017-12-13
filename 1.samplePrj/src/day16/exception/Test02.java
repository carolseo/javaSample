package day16.exception;

public class Test02 {
	public static void main(String[] args){  // throws MoneyEx. 해당 영역만 vs  Ex. 모든 예외
	try {	
	Account account = new Account("홍길동",100);
		account.setMoney(-500);
		System.out.println(account);
	} catch (MoneyException e) {
		System.out.println(e.getMessage());
	}
		System.out.println("Main END");	
	}
}

class Account{
	private String name;
	private int money;
	
	public Account(String name, int money) throws MoneyException {  //생성자에 throws 처리 가능
		super();
		this.name = name;
		this.setMoney(money);  //try-catch 대신
	}
	public Account() {
		super();
	}
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) throws MoneyException {  
		if(money <0){
			throw new MoneyException("money는 양수값만");  
		}
		this.money = money;
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", money=" + money + "]";
	}
}
		
class MoneyException extends Exception{ //예외 기반은 반드시 Exception에 상속받아야함. /RuntimeEx. = unchecked
	MoneyException(){
		super("Money error");	 //default error msg.
	}
	MoneyException(String msg){
		super(msg);
	}	
}