package day12;

public class Test02 {
	public static void main(String[] args) {
			Animal a = new Dog();     //Animal은 객체 생성은 불가능하지만 type 생성은 가능함.
			Animal f = new Fish();   
		//	new Animal();  //미완성 코드이기 때문에 error (abstract class)
			
		//	Animal[] animals = new Animal[5];   //Animal 객체 관리(배열)
			Animal[] animals = {a,f};
			for(int i=0;i<animals.length;i++){
				animals[i].breath();   //object일 경우 casting 필수
				
			}
	}
}
