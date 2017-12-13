package day04;

public class P162 {

	public static void main(String[] args) {
	
		
		for(int j=0;j<2;j++){     // 중첩 for루프문 - 다중for문(정렬 알고리즘)
			for(int i=0;i<3;i++){
				System.out.print('*'+"  ");        // println일 경우, 수직 반복 /기본은 수평 반복
		}
			System.out.println();  
		}
	System.out.println("=========================");
	
	for(int i = 0;i<3;i++){
		for(int j=0 ; j<i+1; j++){     // i=j+1                      // 초기값에 대한 행/열 for문 이해
		System.out.print("*");
		}
		System.out.println();
		
		}
	System.out.println("=========================");
	
	
 OUT:	for(int i=1; i<=9; i++){
		    for(int j=2; j<=9;j++) {//안쪽 for문이 시작단.
			// if(j==5) break;   // 5단부터 처리가 안됨. 제약 기능 걸기 */
		    // if(j==5) break OUT;  //block naming (p/ handling)
		    //  if(j==5) continue;  // 재진입 (건너뛰기)  5단'만' 제외됨.
			System.out.printf("%dx%d =%2d        ",j,i,i*j) ;		
		}
		System.out.println();
	    }
	}
	}

