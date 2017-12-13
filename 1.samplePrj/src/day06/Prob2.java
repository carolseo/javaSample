package day06;   // 강사님 풀이 (과제5)

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Prob2 {
	public static void main(String[] args) {
		String size= JOptionPane.showInputDialog("1~45사이의 정수를 입력하세요.");     //dialog box 명령어-data가 들어올때까지 block됨.
		// System.out.println(size);
		int [] num = new int[Integer.parseInt(size)];   //String을 Int로 바꿈.
		
		num[0] = (int)(Math.random()*45)+1;  //0번쨰는 스스로를 중복 비교할 필요 없음
		
	T:	for(int i = 0; i<num.length;i++){
			num[i] = (int)(Math.random()*45)+1;    //0 제외 45의 값  //random수 줄여서 Test 다실행> 유효성 검증  
			for(int j=0; j<i ; j++){
					if(num[i] == num[j]){
						i --; 
					//	break;  // 1) 불필요한 for loof 반복 방지
						continue T; // 2) 첫번째 for문으로 재진입을 위해서는 해당for문에 labeling해야함.
					}
			}
			System.out.println(Arrays.toString(num));   //무한루프 중복되는지 확인(random수 줄여서)
		}
	}
}