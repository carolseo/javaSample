package day04;

public class P167 {
	public static void main(String[] args) {
	
		int count=0; // 초기값 설정
		while(count<5    ){  //조건식

	System.out.println("Hello Java");
	count++;   //증감식 (없을 경우, 무한 루프)
	
	boolean flag = true;    //무한 루프
	while(flag);
	System.out.println("~~~~~");  
//	if(count == 5) flag = !flag;  
	if(count == 5) break;
	
	System.out.println("Main End");
	}
}
}
