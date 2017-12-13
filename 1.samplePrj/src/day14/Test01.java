package day14; //Interface의 다중 상속 허용 

public class Test01 {
	public static void main(String[] args) {
		AA a= new AA();
		BB b = new BB(); // a = b;  미성립
		
		A[] aaa = { new AA(), new BB()};   //다른 class의 method는 사용 X.
		B[] bbb = { new AA(), new BB()};
		C[] ccc = { new AA(), new BB()};
		I[] iii = { new AA(), new BB()};

		for(int i=0;i<aaa.length;i++){
			aaa[i].a();   //a()만
			bbb[i].b();  //b()만
			ccc[i].c();  //c()만
			// iii[i]  a(),b(),c() 모두 불러오기 가능.
		}
	//	I c = new AA();  // 부모 type으로 정리하면 같이 넣을 수 있으나 다수인 경우 정해야해서 관리 어려움.
   //	c = new BB();
	}
}
class AA extends Object implements I {
	@Override
	public void c() {}
	@Override
	public void b() {}
	@Override
	public void a() {	}
}

class BB extends Object implements I {
	@Override
	public void c() {}
	@Override
	public void b() {}
	@Override
	public void a() {}
}

interface I extends A,B,C {          //Interface의 다중상속(통합하기 위해)
}

interface A {
	void a();
}

interface B {
	void b();
}

interface C {
	void c();
}