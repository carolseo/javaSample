package day20;

import java.util.List;
import java.util.Map;

public class Test01 {
	public static void main(String[] args) {
		Student<String,Double> s1 = new Student("",6);		
		Student<String,Integer> s2 = new Student("",3);
		
		List<String> l;
		List<Integer> l2;
		Map<String, Student> m;
		
	}
}
class Student<T,V extends Number>{  //Generic 개념 이해 (Number은 수를 관리하는 class, 따라서 integer 혹은 double형만 허용)
	T name;
	V avg;
	
	public Student() {	}

	public Student(T name, V avg) {
		super();
		this.name = name;
		this.avg = avg;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", avg=" + avg + "]";
	}
	
}