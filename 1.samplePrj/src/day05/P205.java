package day05;

import java.util.Arrays;

public class P205 {
	public static void main(String[] args) {

	String[] names;      // 공간 생성
	names = new String[5];
//	System.out.println(Arrays.toString(names));

	for(int i=0; i <names.length;i++){
			names[i] = "hello" +i;
	}
		System.out.println(Arrays.toString(names));

		
	}

}
