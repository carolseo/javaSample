package day15.exception;

public class Test02 {
	public static void main(String[] args) {
		try{
			Thread.sleep(5000);   //try-catch가 의무인 checked exception (5초동안 멈춤후, Start )
		}catch (InterruptedException e){
			e.printStackTrace();  //에러 위치를 출력.
		}
		System.out.println("START");
		String name = null;  //null point(unchecked exception) 는 try-catch가 아니라 if문 처리.
		if(name != null)
		System.out.println(name.toString());   // unchecked exception(run-type exception 의 종류)
		
		System.out.println("END");
	}
}
