package day09;

import java.util.Arrays;

import util.Array_2;     //다른 PKG 내에 있는 class 불러오기 구문 

public class ArrayTest {
	public static void main(String[] args) {
		int[] source = {77,99,33,79,44};

		int[] result = Array_2.sort(source);  //함수 호출문 >data주소 입력
	
		System.out.println(Arrays.toString(source));
		System.out.println(Arrays.toString(result));   // source, result는 결과적으로 같은 주소값.
	}
}
