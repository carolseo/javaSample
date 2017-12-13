package day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ArrayTest01 {
	public static void main(String[] args) {
		Student[] s = new Student[100];
		s[0] = new Student();
	
		ArrayList<Student> list = new ArrayList<Student>();
		//등록
		list.add(new Student("길동이",100,99));
		list.add(new Student("김씨",90,99));
		list.add(new Student("고씨",95,93));
		list.add(new Student("박씨",90,90));

		System.out.println(list);
 /*		list.remove(0);    //index 위치 파악이 어렵기 때문에 실질적으로 사용하기 어려움.
		System.out.println(list);
		list.remove(list.get(2));
		System.out.println(list);  */
		
		int delindex = -1;
		for(int i=0; i<list.size(); i++){
			Student data = list.get(i);
		//	data.avg();
			/* list.remove(i);  //삭제작업시 size 자동 변환되서 error. (size가 동적이기 때문)
			System.out.println(list.size()); */
			if(data.name.equals("홍길동")){
					delindex = i;
			}
		}
//		list.remove(delindex);
		System.out.println(list);
		System.out.println("====================================");
	
		for(Student data :list){          //새로운 형태의 for문(위치 index가 없을때, set구조에서 많이 사용) / 출력용으로만 사용
			System.out.println(data);
			data.avg();
		//	list.remove(data);    삭제작업시 error. 
			}
		System.out.println(list);
		
		Iterator<Student> it =list.iterator();   //삭제작업시 **Iterator ** 사용. (+while문)
		while(it.hasNext()){
			Student data = it.next();
			data.avg();
			if(data.name.equals("길동이")){  
				it.remove();
			}
		}
		// System.out.println(list);
		System.out.println(list.contains(new Student("고씨",95,93)));  //contains() >data 포함여부 확인
		
		// Arrays.sort(list.toArray()); // Arrays.sort()는 배열의 형태만 적용 가능.
		Student[] temp = (Student[]) list.toArray();  //Object로 가능하나 downcasting 등 복잡함.  
	
		Student[] temp2 = new Student[list.size()]; // Generics 지원.
		list.toArray(temp2);  //결과값이 output으로 직접 들어감.  
		
		Arrays.sort(temp);
		
	//	Collections.sort(list);
		
		for(Student data: list){  //sorting 을 위한 for문 
			System.out.println(data);
			System.out.println("-------------------------------------------------------------");
		}
	}
}
	

class Student implements Comparable<Student>{
	String name;
	int ko;
	int math;
	double avg;
	
	public Student() {}
	public Student(String name, int ko, int math) {
		super();
		this.name = name;
		this.ko = ko;
		this.math = math;
	}
	public void avg(){
		avg = (ko+math)/2.;
		
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", avg=" + avg + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ko;
		result = prime * result + math;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override  //equals()에 대한 기대값과 일치하는지 항상 확인. /avg() 비교는 필요없으므로 제외해서 맞춤. 
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (ko != other.ko)
			return false;
		if (math != other.math)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public int compareTo(Student o) {  //Generic쓸때/안쓸때 구현해서 차이점 확인.(Test)
		return name.compareTo(o.name);
	}

	

	
}