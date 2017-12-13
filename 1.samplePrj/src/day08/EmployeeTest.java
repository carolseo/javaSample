package day08;

public class EmployeeTest {
	public static void main(String[] args) {
		 Employee emp1 = new Employee();  // () 생성자함수 생성.
		 emp1.display();
		 emp1.num="001";
		 emp1.name="홍길동";   // emp1 객체 초기화 
		 emp1.dept="기획부";
		 
		 Employee emp2 = new Employee("002","고길동","개발부");     //생성자함수 초기화
		 emp2.display();
		 
		 Employee emp3 = new Employee("003","김소영","영업부");  // default 생성자() 호출.
		 emp3.display();
	}
}
