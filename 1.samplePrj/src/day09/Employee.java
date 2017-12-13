package day09;

public class Employee {      // PKG가 다르면 접근 불허용.
	private String name;	 // 이름,    'private' - hidden화, 접근 영역 제한 
	private int salary;  		// 급여
	private String ssn;  		//주민번호

public Employee(){}   //default 생성자 만들기(기본)
public Employee(String  name, int salary, String ssn){
	this.name = name;
	this.salary = salary;
	this.ssn = ssn;
}
	public void setName(String name){    //setter method(property)
		this.name = name;
	}
	public String getName(){  //getter method
		return this.name;
	}
	public void setSalary(int Salary){
		this.salary = salary;
	}
	public int getSalary(){
		return this.salary;		
	}
	public void setSsn(String Ssn){
		this.ssn = ssn;
	}
	public String getSsn(){
		return this.ssn;
	}
	
	public void display(){
		System.out.printf("Employee[%s, %d, %s]%n", name, salary, ssn);
	}
}

