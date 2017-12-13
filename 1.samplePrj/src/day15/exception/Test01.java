package day15.exception; //예외처리 

public class Test01 {
	public static void main(String[] args) {
		System.out.println("START");
		try {
			System.out.println("try{");
			System.out.println(args[0].length()); // args를 정상적으로 받지않아서 catch로 던져짐.
			int num = Integer.parseInt(args[0]); //반납해야할 자원이 있으면 finally{} 으로 넘어감.
			System.out.println(10/num); 
			System.out.println("}");
		} catch (ArrayIndexOutOfBoundsException e) { // 부모타입에 catch(Exception e)지정하지 않음.
			System.out.println("접근할수 없는 배열 인덱스 사용");
		} catch (NumberFormatException e){
			System.out.println("숫자로 입력해주세요");
			System.out.println(e);  //내부적 기본 에러 메시지  (예외 정보)
			e.printStackTrace();
			System.out.println(e.getMessage()); // 내부적 기본 에러 메시지2 (기능 출력)
		} catch (Exception e) { //최후 예외 발생시 
			System.out.println("~~~~~~~~~~~~~~~~~~~");
		} finally { //예외발생 여부 상관없이 항상 수행함.
			System.out.println("자원 반납은 여기에~~~");
		}
		System.out.println("END"); // 정상 종료
	}
}
