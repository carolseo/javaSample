package day05;

import java.util.Arrays;

public class P192 {
	public static void main(String[] args) {
		int[] src = {66,77,99,56,79,78};
		System.out.println(Arrays.toString(src));     //또는 for문 사용
	
	int[] dest = new int[src.length*2];     //destination 배열 전체수
	System.out.println(Arrays.toString(dest));         //Arrays.toString method는 모든 타입 처리 가능 

	System.arraycopy(src, 0, dest, 0, src.length);//매개변수 선택,  소스 전체 copy 가능.
	System.out.println(Arrays.toString(dest)); 
	} 

}
