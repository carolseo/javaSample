package day15.Inner02;  //Inner class (일반 class /static class 차이)

public class Test01 {    //day15.Inner01.Test01 동일한 형태 
	public static void main(String[] args) {
		A.B b = new A().new B();  //b에 a의 주소를 대입하기 위한 초기화     (outer 주소를 포함)
		b.print();
		 
		new A().pp();  
		
		A.S s = new A.S();   //class A 내에 있는 static class void 호출. (class name.class name)
		s.print();
	}
}

class A {
	String name = "A";

	void pp(){
		new B().print();   // class B의 print 호출문
	}

	class B {
		void print() {
			System.out.println(name);
		}
	}
	static class S{    //static 영역이므로 outer의 instance variable 사용 불가능. 
		void print() {
			System.out.println("~~~~~~~~~~~");
		}
	//	System.out.println(name); 
		
	}
}
