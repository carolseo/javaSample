package day07;  // class 생성 > 새로운 data type 생성

public class Employee {    //pkg name만 다르면 class 동일명 사용 가능.
	String num;
	String name;
	String dept;
	
	public void display(){  //method 함수 선언부
		System.out.printf("Employee[%5s, %5s, %5s]%n", num, name, dept);       // 함수 구현부
	}
}