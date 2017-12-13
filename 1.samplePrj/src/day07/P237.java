package day07;

public class P237 {
	public static void main(String[] args) {
		int[] score;
		String name;
		Employee emp1 = new Employee() ; //주소를 갖기 위해서는 new(객체 생성).
		emp1.display();     //null일 경우, emp 실제 주소 없음. 
		emp1.num = "001";
		emp1.name = "홍길동";
		emp1.dept= "기획부";
				
		Employee emp2 = new Employee();
		emp2.display();  
		emp2.num = "002";
		emp2.name = "고길동";
		emp2.dept= "개발부";
		
		emp1.display();
		emp2.display();
		
	}
}
