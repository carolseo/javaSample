package day16.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {

		FileInputStream fis = null;
		Scanner scanner = null;
		
		try {
			fis = new FileInputStream("sample3.txt");  //FileInputStream 특정파일 읽어오기 / FileoutputStream 특정파일 저장하기
		} catch (FileNotFoundException e) {
		// e.printStackTrace();
		System.out.println(e.getMessage());
		System.out.println("sample2.txt 해당 파일을 준비해주세요");
		}catch (Exception e){  //모든 exception 발생 방지
		}finally{
			System.out.println(fis);
			try {
				if(fis != null) fis.close(); //자원 반납 필수
			} catch (IOException e) {
		//	e.printStackTrace();
				System.out.println(e.getMessage());

			}
		}
		
		
		System.out.println("main END");
	}
}
