package day07;

public class StudentTest {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "홍길동";
		s1.score= new int[]{88,99,50};
		s1.process(); //프로세스method 호출해서 '총점' 및 '평균' 계산값 도출.
		s1.display();  //함수는 호출을 해야만 수행됨. 
		
		
	}
}
