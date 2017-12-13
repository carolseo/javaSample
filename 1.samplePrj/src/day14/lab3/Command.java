package day14.lab3;

public interface Command {
	public abstract void exec();
	//default method (jdk 1.8부터 추가)
	default void newMethod(){System.out.println("~~~~~~~~~~~~~~~~~");}  //interface 기능 직접 추가시 error 발생하므로 'default' 추가.


}

class DeleteCommand implements Command {
	@Override
	public void exec() {
		System.out.println("삭제기능 수행");
	}
	public void newMethod(){
		// Command.super.newMethod();
	System.out.println("++++++++++++++++++++++++++=");}
}

class InsertCommand implements Command {

	@Override
	public void exec() {
		System.out.println("등록기능 수행");
	}
}

class UpdateCommand implements Command {

	@Override
	public void exec() {
		System.out.println("수정기능 수행");
	}
}

class SelectCommand implements Command {

	@Override
	public void exec() {
		System.out.println("목록보기 기능 수행");
	}
}