package day03;

public class P130 {
	public static void main(String[] args) {
			int jumsu = 8;  // 점수의 유효성 검증 필요(-60점) 

			if (0<= jumsu && jumsu <=100){    // 점수 유효성 if 조건식 (점수 범위 설정)
				String result = (jumsu >= 80) ? "Pass" : "No Pass" ;   // 선행조건: 참,거짓 data type 일치
				System.out.println(jumsu+ "  :  " +result);

			}else{   // 조건에 맞지 않을 경우 
				System.out.println("점수 오류 => 확인하세요.");  // 점수 유효성 에러 표시
			}
			// char c = 0<= jumsu && jumsu <=100 ? 'O' : 'X'  ;   	//String일 경우, 'O' : 'X'

			
			
			int i=100, j=200;
			int max = (i >j) ? i : j ;
			System.out.println(max);
			System.out.println("max : "+((i>j)? i : j ) );  //3항연산식(최대값) >>  (조건식)? 조건에 따른 값A: 값B) ;
			
			
			
	}

}
