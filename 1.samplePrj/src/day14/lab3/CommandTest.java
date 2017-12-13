package day14.lab3;

public class CommandTest {
	public static void main(String[] args) {
		Command cmd = null;
	
		if(args[0].equals("delete")){	   // 기능 확장이 용이하지 않음 (유지보수 불편)
			cmd = new DeleteCommand();
		}else if(args[0].equals("update")){
			cmd = new UpdateCommand();
		}else{
			cmd = new InsertCommand();
		}
		cmd.exec();
		cmd.newMethod();
	}
}
