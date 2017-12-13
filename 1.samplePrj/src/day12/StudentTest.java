package day12;

public class StudentTest {
	public static void main(String[] args) {
		String name = new String("Java Test~~~");
		String name2 = new String("Java Test~~~");
		// System.out.println(name);   //내부적으로 name.toString으로 auto converting이 됨.
		System.out.println(name == name2);   // 변수의 주소값 비교
		System.out.println(name.equals(name2)); //객체 비교   
	
		// System.out.println(name.toString());
		
		java.util.Date date = new java.util.Date();
		java.util.Date date2 = new java.util.Date();
		System.out.println(date == date2);   
		System.out.println(date.equals(date2)); 
		// System.out.println(date.toString()); 
		
		Student s = new Student("홍길동",22,1);
		Student s2 = new Student("홍길동",22,1);
		System.out.println(s == s2);  //ToString method를 overriding하지 않아서 주소를 불러옴.
		System.out.println(s.equals(s2)); 
		// System.out.println(s.toString());    //**overriding 필수 
	
	}
}
