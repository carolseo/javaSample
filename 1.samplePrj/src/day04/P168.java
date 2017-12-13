package day04;

public class P168 {
	public static void main(String[] args) {
/*
		// 1부터 100까지의 합 구하기 (for문)
		int sum = 0;
		// sum += 1;
		
		for(int i=1; i <=100 ;i++) {          
		sum=sum + i;
		}
		System.out.println(sum);
		
//1부터 100까지의 합 구하기 (while문)
		sum=0;
		int i=1;    //초기화
		while(i<=100){
			sum =sum +i;
			i++;			
		}
		System.out.println(sum);
		
		while(sum==5050){
			System.out.println("~~~~~");
				break;    //무한루프 끊기
		}
	
// (do~ while문)
		boolean flag = false;
		do{
			System.out.println("do while " +flag);
			break;
		}while(flag);   */

// 1~100중 4의 배수 합 구하기
		int sum = 0;
		
		for(int i=0; i<=100; i++){
			 if( i  %  4 == 00)//4의 배수값 조건 정의
				 sum = sum + i;
			 }
			System.out.println(sum);
		
		
	
	
		}
	}
