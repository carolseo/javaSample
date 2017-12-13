package day06;

public class P218 {
	public static void main(String[] args) {
		int[][] score = {
						{ 100, 100, 100}
										,  {20, 20, 20}
										,  {30, 30, 30}
										,  {40, 40, 40}
										,  {50, 50, 50}
			};
	int k_sum = 0;
	int e_sum= 0; 
	int m_sum= 0;
	
	System.out.println("번호  국어  영어  수학  총점  평균") ;
	System.out.println("==============================");
	
	for(int i = 0; i< score.length; i++) {    // score.length 학생수
		int sum = 0;    			// 개인 총점
		double avg= 0.0;
		//float avg = 0.0f;		// 개인 평
		
		k_sum += score [i][0];
		e_sum += score [i][1];
	   m_sum += score [i][2];
		System.out.printf("%3d", i+1);
		
		for(int j= 0; j <score[i].length; j++){    //한 학생에 대한 성적 처리
			sum += score[i][j];
			System.out.printf("%3d  ", score[i][j]);
			
			//System.out.printf("%5d", score[i][j]);	
		}
		System.out.printf("    %3d %.2f  %n",sum,((double)sum/score[i].length));
	// avg = sum/(float)score[i].length;
	//	System.out.printf("%5d %5.1f%n", sum, avg);		
	}
	System.out.println("===============================");
	System.out.println("총점	" +k_sum+ "   "+e_sum+"   "+m_sum);
		}
	}

