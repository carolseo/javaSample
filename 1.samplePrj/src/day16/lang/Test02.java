package day16.lang;

import java.util.Arrays;

public class Test02 {
	public static void main(String[] args) {
		int[] num = {77,8,99,34};
		int[] num2 = num.clone() ;   //배열 복제 method > clone() 
	
		System.out.println(Arrays.toString(num));
		System.out.println(Arrays.toString(num2));
		System.out.println(num);
		System.out.println(num2);
		
		String[] str1 = {"spring","summer","fall","winter"};
		String[] str2 = str1.clone() ;	    //String 타입도 배열 복제 가능. clone()
		str1[0] = "~~~~~~~~~~~~";
		System.out.println(Arrays.toString(str1));
		System.out.println(Arrays.toString(str2));
		System.out.println(str1);
		System.out.println(str2);
		
		
	}
}
