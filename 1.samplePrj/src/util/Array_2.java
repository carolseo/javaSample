package util;  

public class Array_2 {
	int sort;  //변수 선언 
	public static int[] sort(int[] a){  // 메소드 선언(정의)부 + 구현부 
		int[] data = new int[a.length];
		System.arraycopy(a, 0, data, 0, a.length);  //a 원본 보존을 위함 (copy)
		
		// sort
		for(int i =0;i < data.length-1 ;i++){         //오름차순 
			for(int j =i+1; j < data.length ; j++){
				if(data[i] > data [j]){
						int temp = data[i]; //data swaping
						data[i] = data[j];
						data[j] = temp;  
				}
			}
		}		
		return data;
	}
	/**
	 * 
	 * @param a
	 * @param descmode
	 * @return 정렬된 결과 값
	 */
	public static int[] sort(int[] a, boolean descmode){  // 메소드 선언(정의)부 + 구현부 
		int[] data = new int[a.length];
		System.arraycopy(a, 0, data, 0, a.length);  //a 원본 보존을 위함 (copy)
		
		//if( )       boolean descmode에 따라 code 완성하기!
 		// sort
		for(int i =0;i < data.length-1 ;i++){
			for(int j =i+1; j < data.length ; j++){
				if(data[i] > data [j]){
						int temp = data[i]; //data swaping
						data[i] = data[j];
						data[j] = temp;  
				}
			}
		}		
		return data;
 /*	public static String[] sort(String[] a){  // Overloading (String) 
		String[] data = a;
		// sort
		for(int i =0;i < data.length-1 ;i++){
			for(int j =i+1; j < data.length ; j++){
				if(data[i] > data [j]){   
						String temp = data[i]; 
						data[i] = data[j];
						data[j] = temp;    */ // String 배열 오름차순 알고리즘 고민!
	}
}