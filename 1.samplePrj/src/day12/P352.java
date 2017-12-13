package day12;  //SingleTone 기반의 생성자 관리 

public class P352 {
	public static void main(String[] args) {
		//new SingleTone();     //객체 생성 불가능 
		SingleTone.getInstance();
	}
}

 class SingleTone{   
	private static SingleTone s = new SingleTone();
	private SingleTone(){  //생성자함수에 private처리 > method는 같은 class내에서만 사용  
		System.out.println("SingleTone()  생성");
	}
	public static SingleTone getInstance(){
		return s;
		
	}
}