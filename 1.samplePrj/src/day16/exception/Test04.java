package day16.exception; //P.436

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {

		try (FileInputStream fis = new FileInputStream("sample3.txt");) { // auto close됨. //자원반납 객체 복수로 기술 가능.
			System.out.println("작업 처리"); // 예외 발생이 없을 경우 수행.
		} catch (FileNotFoundException e) { // 예외 발생시 catch로 넘어감/ Closable을 구현했을
											// 경우만 가능
			System.out.println(e.getMessage());
			System.out.println("sample2.txt 해당 파일을 준비해주세요");
		} catch (Exception e) {
		} finally {
			System.out.println("finally{} 수행 ");
		}
		System.out.println("__________________________");
		try (Scanner scanner = new Scanner(new File("sample2.txt"));){
			Account a = new Account("", 400);
			
		} catch (FileNotFoundException e) {  //Exception e는 모든 예외 처리이므로 FileNotFoundEx. 사용.
			System.out.println("sample2.txt 파일을 준비해주세요.");
		} catch (MoneyException e){
			System.out.println(e.getMessage());
		} catch (Exception e){  //그외 모든 예외처리
			e.printStackTrace();
		} finally {
		}
		System.out.println("main END");
	}
}
