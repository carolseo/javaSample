package day08;

public class Calc {
	public static int add(){
		return 0;
	}
	public static int add(int a, int b){  //instance method가 아님.   < method 선언
		return a+b ;   //연산 process 진행후 return.  <method 정의 
	}
	//매개변수 type, 개수가 다르고 name은 같으면, 'method overloading'
	/**
	 * 
	 * @param a 더할 데이터
	 * @return 합계가 리턴됩니다.
	 */
	public static int add(int...a){     // (type...변수) > 0부터 시작하는 정수 배열/  add(int[]a) 같은 배열로 처리되므로 중복X
	//	public static int add(char A, int...a){            //가변인자는 매개변수 맨 뒤에.         
		int sum=0;                                                  
		for(int i=0; i<a.length;i++){
			sum += a[i];
	}
		return sum;
}
	public static double add(double a,double  b){
		return a+b;
		
	}
}
