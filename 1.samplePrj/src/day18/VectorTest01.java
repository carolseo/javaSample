package day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorTest01 {
	public static void main(String[] args) {
		Student[] s = new Student[100];
		s[0] = new Student();
	
		List<Student> list = new Vector<Student>();
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
		
		//Student[] temp = (Student[]) list.toArray();      //object converting error 출력. downcasting이 필요하기때문에 복잡함.
		
		Student[] temp2 = new Student[list.size()];
		list.toArray(temp2);  //결과값이 output으로 직접 들어감.
		
		Arrays.sort(temp2);
		
	//	Collections.sort(list);
		
		for(Student data: temp2){  //sorting 을 위한 for문 
			System.out.println(data);
			System.out.println("-------------------------------------------------------------");
		}
	}	
}