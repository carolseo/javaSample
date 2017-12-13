package day14.lab3;   //Command design pattern 적용 > Command interface 설계

public class CommandTest3 {
	public static void main(String[] args) throws Exception {   //예외처리(안좋은 coding)
		Command cmd = null;
	
		cmd = new day14.lab3.DeleteCommand();  // 기존 객체 생성방법 (compile시 고정 주소 사용 메모리 띄움 )
		
		Class cls = Class.forName(args[0]);  // class화 객체 새성 (run time시 String처리하여 동적 처리 메모리 띄움)
		Class cls2 = Class.forName("day14.lab3.DeleteCommand");  //동적binding mapping (문제발생 가능, 예외처리 필요)
		cmd = (Command) cls.newInstance();  //args[0]객체를 메모리에 띄움.
		
		cmd.exec();
		
	}
}
