package day14.P371;

public class ProductTest {
	public static void main(String[] args) {

		Buyer m = new Buyer();
		m.buy (new Computer());  
		m.buy(new Audio());
		m.buy(new Audio(2));
		
		m.summary();
	}

}
