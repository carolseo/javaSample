package day08;

public class CalcTest {
	public static void main(String[] args) {
	
		System.out.println(Calc.add(55, 77, 99));    //함수 호출 
		System.out.println(Calc.add(55, 77)==132);   		
		System.out.println(Calc.add(1, 7));   	//같은 method name임에도 매개변수 개수,type에 따라 자동 분류 가능(no error)
		System.out.println(Calc.add());            
		System.out.println(Calc.add(3.5,3.7));   //매개변수 type에 따라 적절한 method 자동 설정.
		System.out.println(Calc.add(3,3.7));  
		
		
	
	}

}
