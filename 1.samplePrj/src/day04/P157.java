package day04;

public class P157 {
	
	public static void main(String[] args) {
		                                                                                                  //int count = 0;	// count 변수 추가  count++   > 복사 개수 확인
		// for(int count=0 ; count<5; count++){                    // scope 확인(0 초기화)  // 무한루프 (0일 경우 항상 참 / 증감count 없는 경우)
	   //	System.out.println("Hello Java" +count);      //count 변수 추가 확인

		System.out.println("영어 소문자 코드값 확인  ");
	
		char c = 'a', d='A';  
		int count;  
		for(count=0 ; count<26; count++){      // 내부적으로 count변수 상관 없음.   조건식; 증감식
			System.out.println(c+"   " + (int)(c++) +", "+ d+" "+(int)d++);   
		}
		System.out.println(count);
		System.out.println(c);
		}
	 



	}

