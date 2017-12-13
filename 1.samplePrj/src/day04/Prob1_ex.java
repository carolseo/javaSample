package day04;

import java.util.Scanner;

public class Prob1_ex {
	public static void main(String[] args) {	
		
Scanner scanner=new Scanner(System.in);
System.out.print("msg가 yes 또는 no인지 선택해주세요.");
String a = scanner.nextLine();
			
	boolean yes;
	String result = (a = "yes" != null? "true":"false");
System.out.println("답변="+result);


				//  문자열 참조변수  msg 가 "yes" 일때 true 인  조건식 
	}
	}
/*int i=100, j=200;
int max = (i >j) ? i : j ;
System.out.println(max);
System.out.println("max : "+((i>j)? i : j ) );  //3항연산식(최대값) >>  (조건식)? 조건에 따른 값A: 값B) ;*/