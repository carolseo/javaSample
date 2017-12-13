package day08;

public class Student {
	String name;
	String year;
	String major;
	
	public Student(){
		this("XXX","X학년", "XX계열");		
	}
	
	public Student(String name, String year, String major){
		this.name = name;
		this.year = year;
		this.major = major;		
	}
	
	public void display(){
		System.out.printf("Student[%s, %s학년, %s계열]%n", name,year,major);
	}	
}
