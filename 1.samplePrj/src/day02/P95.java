package day02;

public class P95 {
	public static void main(String[] args) {
	//char x ='a';
	float x = 'a'; //에러 유무 문제 > 에러 아님
	double y = 7+ 8 * x; //char값이 int값으로 promotion.
	//System.out.println(y);
	System.out.printf("y= %.2f %n", y); //더블형  %.2f  소수점 자리수 설정

	int i=5, j=5;
	System.out.printf("i= %d , j= %d: i==j => %s %n",i,j,i==j); 
	//System.out.printf("x>y = %s %n",i==j); //비교연산자의 결과값은 T/F, 비교식의 결과값에 따라 %b, %d, %s등 선택.
	System.out.printf("i= %d, j=%d %n",i,j);
	System.out.println(++i);  //++ 앞,뒤 위치에 따라 연산값 증가 시기 다름.
	System.out.println(i++);
	System.out.printf("i= %d, j=%d %n",i,j);
	
	int sum = 100;
	sum +=(int)y;  //또는 sum  = sum + (int)y;
	System.out.println(sum);
	System.out.println(sum % 10);  //% 나머지연산
	System.out.println(sum / 10);
	
	
	}

}
