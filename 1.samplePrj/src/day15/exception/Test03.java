package day15.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test03 {
	public static void main(String[] args) {
		System.out.println("START");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("sample2.txt"); // 파일 실행 주소에 따라 바뀜
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (fis != null)fis.close(); // fis = null이기 때문에 NullPointer 발생. Null은 반납할 자원이 없음.
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		System.out.println("END");
	}
}
