package day06;

import java.util.Arrays;

public class P201 {
	public static void main(String[] args) {
		if(args.length == 0){    
			System.out.println("배열의 사이즈를 실행 파라미터로 입력해주세요~~");
			return;
		}
		int[] num = new int[Integer.parseInt(args[0])];   
  		
		//	int [ ]num = new int[5];  //num 생성(구축)
		for(int i = 0 ; i <= num.length-1; i++){
			num[i] = (int)(Math.random()*45)+1;    //1~45까지 정수인 난수 초기화   // 난수 중복 제어(?)
			 for(int j = 0; j < i; j++){  
				 if(num[i] == num[j]){		
					 i--;
					 break;
				 }
			 }
			// System.out.println(Arrays.toString(num));
		}
		// int[] source = num;  //주소값 포함, 소스 보존이 안되고 같이 변함. 배열공간 생성 및 copy 필요.
		int[] target = new int[num.length];  // 배열공간 생성
		System.arraycopy(num, 0, target, 0, num.length);
		
		System.out.println("원본 num");
		System.out.println(Arrays.toString(num));
		//오름차순 정렬하기
		for(int i = 0; i <num.length-1; i++){
			for(int j = i+1; j <num.length;j++){
				if(num[i] >num[j]){          //조건식 1
					int tmp = num[i];
					num[i] = num[j];
					num[j] = tmp;
				}
		}
		}

	System.out.println("원본:" +Arrays.toString(target));
	System.out.println("정렬후:" +Arrays.toString(num));
	
	}
}

