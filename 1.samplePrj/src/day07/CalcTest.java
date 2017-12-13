package day07;

public class CalcTest {
	public static void main(String[] args) {
		Calc c1 = null;
	
		System.out.println(c1.add(455, 765));     //static한 자원은 class이름 대입.
		System.out.println(Calc.add(455, 765));  // 공유개념data static 처리 가능. (ex.난수 발생)
		System.out.println(Calc.sub(455, 765));
		System.out.println(Calc.div(455, 765));
	}

}
