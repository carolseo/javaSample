package day14.lab3;   //Command design pattern 적용 > Command interface 설계

public class CommandTest2 {
	public static void main(String[] args) throws Exception {   //예외처리(안좋은 coding)
		Command cmd = null;
	
		Class cls = Class.forName(args[0]);  // class화 객체 새성
		cmd = (Command) cls.newInstance();  //args[0]객체를 메모리에 띄움.
		
		cmd.exec();
		cmd.newMethod();
	}
}
