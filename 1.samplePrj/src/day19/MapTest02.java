package day19;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapTest02 {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(20054030,"김진호");
		map.put(20031040,"이유진");
		map.put(20104010,"이경호");
		map.put(20091050,"서현정");
		map.put(20084910,"이경호");
		map.put(20150299,"유진아");
		map.put(20172980,"이민호");
		map.put(20110990,"남진오");

		boolean flag = true;
		while (flag) {
			System.out.println(" 학생정보 처리");
			Scanner scanner = new Scanner(System.in);
			System.out.println("\n 학번 : _");
			int studentNum = scanner.nextInt();
			System.out.println("이름 : _");
			String name = scanner.nextLine();
			
			if (map.containsKey(name)) {
				if (map.get(studentNum).equals(name)) {
					System.out.println("학생정보가 인증되었습니다.");
					flag = false;
					break;
				} else {
					System.out.println("학생정보를 다시 확인해주세요");
					continue;
				}
			} else {
				System.out.println("입력한 이름이 존재하지 않습니다.");
				continue;
			}
			}
				System.out.println("------------------------  서비스 목록 ----------------------------");
	}


	class Student {
		String Name;
		String dept;
		int StudentNum;

		public Student(String name, String dept, int studentNum) {
			Name = name;
			this.dept = dept;
			StudentNum = studentNum;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((Name == null) ? 0 : Name.hashCode());
			result = prime * result + StudentNum;
			result = prime * result + ((dept == null) ? 0 : dept.hashCode());
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
			Student other = (Student) obj;
			if (Name == null) {
				if (other.Name != null)
					return false;
			} else if (!Name.equals(other.Name))
				return false;
			if (StudentNum != other.StudentNum)
				return false;
			if (dept == null) {
				if (other.dept != null)
					return false;
			} else if (!dept.equals(other.dept))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "Student [Name=" + Name + ", dept=" + dept + ", StudentNum=" + StudentNum + "]";
		}
	}
}
