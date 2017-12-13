package day09;

public class EmployeeTest {
 public static void main(String[] args){
	 Employee emp1 = new Employee();
	 emp1.setName("홍길동");     //hidden data 때문에 읽고, 쓰기 불가능하게 됨.
	emp1.setSalary(50000);
	 emp1.setSsn("111-111");
	emp1.display();
	System.out.println(emp1.getSalary()*0.01);    // Tax 계산시 유용 
 	}
}
