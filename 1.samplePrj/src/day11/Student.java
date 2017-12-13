package day11;

public class Student extends Person {
	private int id;
	public Student() {
		super();
	}
	public Student(String name,int age,int id){
		super(name,age);
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void display(){
		System.out.printf("이 름:%s\t나 이:%d  \t학    번:%d %n",super.getName(),super.getAge(),id);
	}
	
}
