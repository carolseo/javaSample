package day05;

import java.util.Arrays;
import java.util.Scanner;

//배열 생성 > 데이터 생성 > 추가> 출력 

public class P187 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요_");
		
		int[] num;
		num = new int[Integer.parseInt(scanner.nextLine())];    //nextLine(String)은 숫자로 바꿔줘야
		for(int i = 0; i < num.length; i++) {
			num[i] = (int)(Math.random()*45)+1;
			// num[i] = i*10+10;
		}
		for(int i = 0 ; i < num.length; i++) {
			System.out.print(num[i]+"   ");
		}
		System.out.println();
		System.out.println(Arrays.toString(num));    //Arrays API 불러오기 (Util. method)
		// System.out.print((int)(Math.random()*45));    //난수 발생
		// System.out.print((int)(Math.random()*45)+1);    // 1~45까지 임의 숫자 발생(+1 추가 제어)
		System.out.println();
		
	}
}
