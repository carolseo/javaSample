package day17;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class StudentTest {
	public static void main(String[] args) {
		Student[] students = new Student[100];
		int count = 0;

		try (Scanner scanner = new Scanner(new File("studentdata.txt"))) { // closable가능한 객체만
			while(scanner.hasNextLine()){
				String readLine = scanner.nextLine();
				String [] data = readLine.split("/");
				students[count] = new Student(data[0], Integer.parseInt(data[1]));  //Student 객체 생성
				count++;
			}

		} catch (Exception e) {
			if (e instanceof FileNotFoundException) {
				System.out.println("studentdata.txt 문서 준비하세요");
			} else {
				e.printStackTrace();
			}
		}finally{     }
		// System.out.println(Arrays.toString(students));
		
		try{
		Arrays.sort(students,0,count);  //sort 기능은 기준이 필요함.(comparable interface로 순서 지정)
		}catch (ClassCastException e){
			System.out.println("정렬 기준키 설정 필요");
		}
		
		for(int i=0;i<count;i++){   // students.length로 길이 설정시 null 값 표시됨.
			System.out.println(students[i]);
			System.out.println("----------------------------------");
		}
		/*배열의 sorting
		String[] i = {"j","a","f"};
		Arrays.sort(i);
		System.out.println(Arrays.toString(i));
		
		System.out.println("********** Main end **********"); */
	}
}

class Student implements Comparable<Student>{   //Student type 비교 시작
	String name;
	int age;

	public Student() {
		super();
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	@Override //[] 정렬시 2차 기준 설정도 상황에 따라 필요.
		public int compareTo(Student o) {
	//	return age - o.age;   int age 비교, 내림차순일 경우> o.age - age  */
	//	return name.compareTo(o.name); //String name 비교
	/*		if(name.equals(o.name)){       //동일한 이름일 경우,
				return age - o.age;             // 나이로 비교
				
			}
			return name.compareTo(o.name); */ //다른 이름일 경우, 그대로 name으로 sorting.
		int result = name.compareTo(o.name);
		return (result !=0)? result:age - o.age;
	}

}