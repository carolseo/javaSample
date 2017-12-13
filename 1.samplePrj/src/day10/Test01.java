package day10;

public class Test01 {
	public static void main(String[] args) {
		Animal a1 = new Animal();
		a1.breath();
		System.out.println(a1.kind);
		System.out.println("-------------------------------------------");
		Dog d = new Dog();
		d.display();
		d.breath();
		d.bike();
		System.out.println(d.name);
		System.out.println(d.kind);  //강아지 종류
		System.out.println(((Animal)d).kind);  //동물 종류 (upcasting to 부모 영역)
		System.out.println("------------------------------------------------");
		// is A 관계 
		Animal e = new Dog();   // 객체생성후 바로 기능 수행하도록 변수 e 설정. (모든 객체 type은 부모 가능. 따라서 Dog, Animal 둘다 가능) 
		e.breath();
		((Dog)e).bike();   //downcasting to 자식 영역 
		System.out.println(e.kind);
	
	}
}
