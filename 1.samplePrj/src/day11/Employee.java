package day11;

public class Employee extends Person {
	private String dept;
	public Employee() {
		super();
	}
	public Employee(String name,int age,String dept){
	super(name,age);
	this.dept = dept;
	}
	
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public void display(){
	System.out.printf("이 름:%s\t나 이:%d  \t부    서:%s %n",super.getName(),super.getAge(),dept);
	}
}                           

