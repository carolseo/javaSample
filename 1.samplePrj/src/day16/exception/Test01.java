package day16.exception;  //unchecked & checked 예외 비교 

public class Test01 {

	public static void main(String[] args) {
		System.out.println("main START");
		
		//unchecked 경우
		String name = null;
		if(name != null && name.length() > 0)  // try~catch가 아닌 적절한 조건식으로 예외처리 가능. 
		System.out.println(name.charAt(0));  

		//checked 경우(try~catch)
		try {
			Class.forName("day16.exception.Sample"); //예외 발생할수도, 아닐수도 있음 (예외 발생시,catch찍고 수행) /full name class 위치 필요
		} catch (ClassNotFoundException e) {
			// e.printStackTrace();
			System.out.println("클래스 이름 확인 필요");
		}
		
		System.out.println("main END");
	}
}
class Sample{
	
}
