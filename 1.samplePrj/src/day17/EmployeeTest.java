package day17; //Generics 

public class EmployeeTest {
	public static void main(String[] args) {
		Employee<String,String> e2 = new Employee();
		e2.number = "2017";
		//	Employee<int>  기본형은 binding 불가능. object만 가능.
		Employee<Integer,Integer> e1 = new Employee();
		e1.number = 2015;
		
		Employee e3 = new Employee();
		e3.number = 2222;
		e3.number = "444";
		
	}
}

class Employee<T,P>{   //타입 지정에 대한 구분이 불명확할때, runtime때 임의의 참조형 type 지정.  <> 생략시 무조건 Object로.
	String name;
	T number;
	P age;
	@Override
	public String toString() {
		return "Employee [name=" + name + ", number=" + number + ", age=" + age + "]";
	}

	
}
