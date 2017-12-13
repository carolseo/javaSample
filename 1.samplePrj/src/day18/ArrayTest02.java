package day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayTest02 {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();   //list resizing 자동       
		/* 기존 방법
	Employee [] emp = new Employee[100];            
		emp[0] = new Employee();
		emp[2] = new Employee();
		for(int i=0;i<emp.length;i++){
			System.out.println(emp[i].toString());  //기본적으로 사원수 관리 X > NullPointer error 발생   */
		//*****등록 
		list.add(new Employee("007","홍길동","기술부"));
		list.add(new Employee("003","고길동","기술부"));
		list.add(new Employee("006","홍","기술부"));
		list.add(new Employee("001","홍동","기술부"));
		list.add(new Employee("009","홍길","기술부"));
		//정렬후 출력
		Collections.sort(list);  //번호순으로 sorting하기 /CompareTo - num값으로 대입
		
		for(int i=0; i<list.size(); i++){             //Collection에서는 정통적인 for문 안씀.(set에서 쓸수 없으므로)
			System.out.println(list.get(i));
		}
		System.out.println("------------------------------------------------------------------------------------");
		//*****삭제
		Iterator<Employee> it = list.iterator();   //해당 주소 삭제
		while(it.hasNext()){  //boolean, false 없을때 /true 있을때 
			Employee data = it.next(); //옆칸으로 밀어주면서 이동하는 기능.
			if(data.getNum().equals("006")){
				System.out.println(data+" : 사원정보 제거합니다.");
				it.remove();  //equals() 해당 정보만 삭제 요청
			}
		}
		
		System.out.println("=========================사원목록 ======================");
		for(Employee data:list){   //list에서 data 추출
			System.out.println(data);
		}
		System.out.println("------------------------------------------------------------------------------");
		//*****검색 (for문 / iterator 둘다 사용 가능)
 		System.out.println("이름이 홍씨인 사원 목록 검색");
		for(Employee data:list){
 			if(data.getName().charAt(0)=='홍'){   //조건문 charAt(첫번째문자) > 기본형이므로 == 사용.
 				System.out.println(data);
 			}
 		}
		System.out.println("--------------------------------------------------------------------------------");
		Employee[] data = new Employee[list.size()]; //데이터 넣을만큼의 배열 생성
		System.out.println(Arrays.toString(data));
		list.toArray(data);
		System.out.println(Arrays.toString(data));
	}
	}

class Employee extends Object implements Comparable<Employee>{ 
	String num;
	String name; 
	String dept;
	
	public Employee() {}
	public Employee(String num, String name, String dept) {
		this.num = num;
		this.name = name;
		this.dept = dept;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dept == null) ? 0 : dept.hashCode());
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
		if (dept == null) {
			if (other.dept != null)
				return false;
		} else if (!dept.equals(other.dept))
			return false;
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
		return "Employee [num=" + num + ", name=" + name + ", dept=" + dept + "]";
	}
	@Override
	public int compareTo(Employee o) {
		return num.compareTo(o.num);   //오름차순으로 순서 결정('나'를 앞에 두면)
		//return o.name.compareTo(name);; 내림차순으로 순서 결정
	}
	public String getNum() {
		return num;
	}
	public String getName() {
		return name;
	}
	public String getDept() {
		return dept;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
}