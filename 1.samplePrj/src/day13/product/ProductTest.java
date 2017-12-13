package day13.product;

public class ProductTest {
	public static void main(String[] args) {
			Buyer buyer = new Buyer();
			buyer.buy(new Computer());
			buyer.buy(new TV());
			buyer.buy(new HP());
			buyer.buy(new Audio());
		//	buyer.buy(new VCR());    VCR Type method 미보유.
	}
}
class Product{
	int price;
	int point;
}
class TV extends Product{}      //extends(상속) 필수 - 다형성 
class Computer extends Product{}
class VCR extends Product{}
class HP extends Product{}
class Audio extends Product {}

class Buyer{
	int money;
	int point;
	void buy(Product t){    //매개변수의 다형성 (관리 용이)
	money -= t.price;   
	point += t.point;  
}
	/*
	void buy(TV t){            // 아이템마다 메소드 작성시 유지보수 관리 매우 복잡.
		money -= t.price;   //지불값
		point += t.point;  //보너스포인트 증가값
	}
	void buy(Computer t){
		money -= t.price;   
		point += t.point;  
	}
	*/
}