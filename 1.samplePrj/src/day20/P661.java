package day20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class P661 {
	public static void main(String[] args) {
		Properties p = new Properties();    //Properties  객체 생성
		
		try {
			p.load(new FileInputStream("dbinfo.txt"));  // load 외부 데이터 문서 
			
			String url = p.getProperty("url");
			String driver = p.getProperty("driver");
			String username= p.getProperty("username");
			String pw= p.getProperty("pw");
			
			System.out.println(url);
			System.out.println(username);
			System.out.println(pw);
			System.out.println(driver);
			
			System.out.println(p);
			
			System.out.println("=============================");
			//xml로 저장 
			p.storeToXML(new FileOutputStream("data.xml"), "DB Info");
			System.out.println("dbinfo 정보가 data.xml로 저장되었습니다.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("main END");
	}
}
