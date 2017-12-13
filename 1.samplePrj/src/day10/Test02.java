package day10;

public class Test02 {
	public static void main(String[] args) {
		Fish f = new Fish();
		f.breath();
		
		Animal ff = new Fish();    //메소드가 overriding시, 자식 method가 호출됨.
		ff.breath();
		
		Animal a;   //부모 객체 type 하나에 다양한 자식 객체가 포함 가능함. 
		
	}
}
