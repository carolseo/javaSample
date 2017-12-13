package day06;

public class Employee {    // only member(instance) variable + member(instance) method
	String name;		// 중복 가능
	String dept;		// 중복 가능
	String number;    //primary kit(중복불가능 data)
	
	public void display(){      
		System.out.printf("Employee[사번: %s 사원명: %s 근무부서:%s] %n", number, name, dept);
	}
}
