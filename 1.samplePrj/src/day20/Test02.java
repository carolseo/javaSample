package day20;

public class Test02 {
	public static void main(String[] args) {
		Command delete = new DeleteCommand();  //클래스 직접 설계
		Command update = new UpdateCommand();
		Command select = new SelectCommand();
		Command insert = new InsertCommand();
		
		if(args.length == 0){
			System.out.println("delete/update/select/insert 중 하나를 입력하세요.");
			return;
		}
		
		
		if(args[0].equals("delete")){
			delete.exec();
		}else if(args[0].equals("update")){
			update.exec();
		}else if(args[0].equals("select")){
			select.exec();
		}else if(args[0].equals("insert")){
			insert.exec();
		}else{
			System.out.println(args[0]+"기능 지원이 안됩니다. ");
		}
		System.out.println("===============main END ==============");
	}
}

interface Command{
	void exec();
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