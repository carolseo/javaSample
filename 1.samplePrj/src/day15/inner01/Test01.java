package day15.inner01;   //inner class

public class Test01 {
	public static void main(String[] args) {
		B b1 = new B();
		b1.setA(new A());
		b1.print();  
	}
}
class A{
	String name = "A";
}
class B{
	A a;  //메시지 교환 통로(get,set) 필요
	public A getA() {
		return a;
	}
	public void setA(A a) {
		this.a = a;
	}
	void print(){
		System.out.println(a.name); //class A의 객체를 불러오려면 주소 필요.
	}
}
            