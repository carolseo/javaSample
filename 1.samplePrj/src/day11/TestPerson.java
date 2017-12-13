package day11;

public class TestPerson {
	public static void main(String[] args) {
		//혼자 한 것 
		/*Student s = new Student();
		Teacher t = new Teacher();	
		Employee e = new Employee();
	
		s = new Student("홍길동",20,200201);
		s.display();
		t = new Teacher("이순신",30,"JAVA");
		t.display();
		e = new Employee("유관순",40,"교무과");
		e.display(); */

		Object s = new Student("홍길동",20,200201);
		((Student)s).display();   //or print();
		s = "Hello";
		if(s instanceof Student)((Student)s).display();   //in stanceof : casting시 type 체크
		
		String name ="OOO";
		Student s1 = new Student("길동", 20,1);
		Teacher t1 = new Teacher("홍샘", 40,"Java");
		Employee e1 = new Employee("홍길동",44,"교무실");
		
		Object[] obj = {name, s1, t1, e1};  //배열로 다양한 data type 귀속 관리 가능     
		for(int i =0;i<obj.length;i++){    //for문 사용: object배열에서 person 배열만 출력 
			if(obj[i] instanceof Person)((Person)obj[i]).display();
		}
		
		Person[] p = {s1, t1, e1, new Student("",22,2)}; //new객체생성하면서 직접 대입 가능.   
	
		System.out.println("==================================");
		for(int i=0; i<p.length;i++){
			if(p[i] instanceof Student)((Student)p[i]).display();
			if(p[i] instanceof Teacher)((Teacher)p[i]).display();
			if(p[i] instanceof Employee)((Employee)p[i]).display();
		} //장점: 다양한 data type 관리 가능 but, casting 과정 불편함.
		System.out.println("==================================");
		for(int i = 0; i<p.length; i++){
			p[i].display();    //overriding 사용 (Person class에 동일한 method 추가)
		}
		System.out.println("========================");
		Person pp =  null ;   //'다형성'
		pp.display(); //method는 하나이지만 binding되는 class에 따라 결과값 다른 동작 수행.
		

	
	} 
}
