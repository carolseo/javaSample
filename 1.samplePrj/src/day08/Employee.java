package day08;
/**
 * 
 * @author student
 * @since 2017.11.08
 */

public class Employee {
	String name;    //instance(member) variable
	String dept;      
	String num;	  
	
	
	public Employee(){   // 기존 class 대체로 자동 form.  
		this("000","사원명","OO부");  //중복된 코드 사라짐.(다른 생성자 호출)  //항상 first statement 위치에서만 호출.
	/*	this.num="000";
		this.name="사원명";       //기본값 초기화 
		this.dept="OO부"; 
		System.out.println("Employee() 생성자 함수 ");  */ //default 생성자함수는 기본적으로 항상 존재해야함.
	}
	
	public Employee(String num,String name,String dept){  //생성자 함수 정의, 생성
			this.num = num;    //this. 자원 명시 
			this.name = name;
			this.dept = dept;
	}
	
	/**
	 * Employee 정보 출력용
	 */
	public void display(){       //instance method (method내 명령문 순서는 중요, variable/method 순서는 중요X) 
		System.out.printf("Employee[%s, %s, %s] %n",num,name,dept);    //this는 heap에서 통용(static 사용 불가능)

	}
}
