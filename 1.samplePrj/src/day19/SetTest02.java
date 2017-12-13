package day19;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetTest02 {

	public static void main(String[] args) {
		Employee emp1 = new Employee("김", "001");
		Employee emp2 = emp1;

		Set<Employee> set = new TreeSet<>();
		set.add(emp1);
		set.add(emp2);
		System.out.println(set); // 중복체크해서 add 하나만 수행. (ArrayList는 중복체크 조차 하지 않음)
		set.add(new Employee("고", "002"));
		set.add(new Employee("강", "009"));
		set.add(new Employee("홍", "005"));
		set.add(new Employee("박", "011"));
		set.add(new Employee("고", "022"));
		System.out.println(set); // 중복체크를 주소값으로 함.(equals() 존재하지 않으므로) >>equals()의 중요성
		for (Employee data : set) {
			System.out.println(data); // 들어간 순서대로 나열이 되지 않음.
			System.out.println("________________");
		}
		Iterator<Employee> it = set.iterator();
		while (it.hasNext()) {
			Employee employee = (Employee) it.next();
			System.out.println(employee);
		}
	}
}

class Employee implements Comparable<Employee> { // Interface내에 추상메소드가 있어서 구현해야 error 미발생.
	String name;
	String num;

	public Employee() {
	}

	public Employee(String name, String num) {
		this.name = name;
		this.num = num;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((num == null) ? 0 : num.hashCode());
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
		Employee other = (Employee) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (num == null) {
			if (other.num != null)
				return false;
		} else if (!num.equals(other.num))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", num=" + num + "]";
	}

	@Override
	public int compareTo(Employee o) {
		return num.compareTo(o.num);
	}
}
