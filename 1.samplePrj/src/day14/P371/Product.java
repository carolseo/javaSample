package day14.P371;

public class Product {
	int price;
	int bonusPoint;
	int count = 1;
	
	public Product() {
	}

	public Product(int price) {
		this.price = price;
		this.bonusPoint = (int) (price * 0.05);
	}
	public Product(int price, int count) {
		this.price = price*count;
		this.bonusPoint = (int) (price * 0.05)*count;
		this.count=count;
	}

}

class Tv extends Product { // TV
	Tv() {
		super(1000);
	}
	Tv(int num) {
		super(1000,num);
	}
	public String toString() {
		return "TV";
	}
}

class Computer extends Product { // Computer
	Computer() {
		super(1500);
	}
	Computer(int num) {
		super(1500,num);
	}
	public String toString() {
		return "Computer";
	}
}

class Audio extends Product { // Audio
	Audio() {
		super(700);
	}
	Audio(int num) {
		super(700,num);
	}
	public String toString() {
		return "Audio";
	}
}

class Buyer {
	int money = 20000;
	int bonusPoint = 100;
	Product[] P = new Product[10];
	int count = 0;
	int sum = 0;

	void buy(Product P) {
		if (money >= P.price*P.count) {
			this.P[count] = P;
			count += 1; // count++;
			money = money - P.price;
			sum += P.price;
			bonusPoint = this.bonusPoint + P.bonusPoint;
			System.out.println(P + "를/을 구입하였습니다.");
			System.out.printf("충전된 적립포인트는: %d \n", P.bonusPoint, "원입니다.");
		} else
			System.out.println("잔고가 부족합니다.");
	}

	void summary() {
		System.out.println("=========================================");
		System.out.print("구매완료 목록:  ");
		for (int i = 0; i < count; i++) {
			for(int j=0;j<P[i].count;j++){
			System.out.print(P[i] + "  ");
			}
		}
		System.out.println("\n 구매물품 총합계:  " + sum + "원입니다.");
		System.out.println("보유하신 적립포인트는 " + bonusPoint + "원입니다.");
		System.out.println("=========================================");
	}

}
