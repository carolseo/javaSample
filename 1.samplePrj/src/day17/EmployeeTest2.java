package day17; //Generics 

public class EmployeeTest2 {
	public static void main(String[] args) {
		Employee_2<Integer> e1 = new Employee_2<Integer>();  //개체 생성시 양쪽 type 지정해야함. 
		e1.number = 2017;  //type에 대한 언급이 없으면 무조건 object. (따라서 downcasting 필요)
		// System.out.println(e1.number.charAt(e1.number.length()-1));  //String에 쓰는 API이므로 Integer사용시 사용 불가능.
	Employee e2 = new Employee();  //type 지정이 안되면 object로 생략되어 관리됨.
	
	}
}

class Employee_2<T> implements Comparable<Employee_2<T>>{
	String name;
	T number;  //class 정의시 임의 type 지정.
	
	public Employee_2() {
		super();
	}
	public Employee_2(String name, T number) {  //Generics 적용
		super();
		this.name = name;
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public T getNumber() {
		return number;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setNumber(T number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Employee_2 [name=" + name + ", number=" + number + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee_2 other = (Employee_2) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		return true;
	}
	@Override
	public int compareTo(Employee_2<T> o) {
		return 0;
	}

	
}
