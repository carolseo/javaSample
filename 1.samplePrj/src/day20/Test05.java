package day20; //람다식 구조

public class Test05 {
	public static void main(String[] args) {
		// 람다식: 변수에 함수를 등록 (보통 변수에 객체를 등록함)
		Command delete= ()->{    //override abstract method 
			System.out.println("delete 수행~~~~~");
		};
		
		Command update= ()-> System.out.println("update 수행~~~~");  //한 라인에서는 block 생략 가능.
		Command insert= ()-> System.out.println("insert 수행~~~~"); 
		
		Command select= ()->{System.out.println("select 수행~~~~"); 
		};
		
		select.exec();
		select.print();
		
	
}
@FunctionalInterface //함수화가 가능한 interface, 반드시 abstract method가 하나인 경우에만 수행.
interface Command{  //하나의 abstract method.
	void exec();
	default void print(){
		System.out.println("********************");
	}
}
//@FunctionalInterface   //두개의 abstract method  
interface A{
	void go();
	void stop();
}

class DeleteCommand implements Command{  //abstract method override됨.
	@Override
	public void exec() {
		System.out.println("DeleteCommand 수행");
	}
	
}
class UpdateCommand implements Command{
	@Override
	public void exec() {
		System.out.println("UpdateCommand 수행");
		
	}
	
}
class SelectCommand implements Command{
	@Override
	public void exec() {		
		System.out.println("SelectCommand 수행");
	}
	
}
class InsertCommand implements Command{
	@Override
	public void exec() {
		System.out.println("InsertCommand 수행");
	}
}
}
