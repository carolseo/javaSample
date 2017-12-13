package day07;

public class Student2 {
	public static void main(String[] args) {
		// Student[] s= new Student(5);   //배열 type 
		Student s1 = new Student();
		s1.name = "홍길동";               
		s1.score= new int[]{88,99,50};
		
		Student[] s= {                   //2) 배열의 선언,생성,초기화 한번에 수행
				s1,                              // 1) 주소를 직접 대입할수도 있음.  (개별적으로 초기화)
				new Student(),        
				new Student(),   
				new Student(),   
				new Student()
		};
		
		s[4].name="최씨";
		s[4].score= new int[]{99,99,99};
		
		for (int i=0; i<s.length;i++){    // s.length 학생수
			s[i].process(); //data 전송 기능
			s[i].display(); 
			
		}
		
	}
}
