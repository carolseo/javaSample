package day16.lang;   //Scanner클래스 (다른 file로부터 데이터 읽기)

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class P510 {
	public static void main(String[] args) {
		String filename = "sample2.txt";  
		try(Scanner scanner = new Scanner(new File(filename));) {   //System.in 키보드로 넘겨받을때 / file 불러오기는 다름.

			while(scanner.hasNextLine()){
				String data = scanner.nextLine();   //한 줄씩 불러오기
				// System.out.println(data);
				int sum = 0;
				String[] datas = data.split("/");
				for(int i = 1; i<datas.length; i++){ //int i=0은 이름이므로
					sum += Integer.parseInt(datas[i].trim());      
				}
				System.out.printf("이름: %s  총점: %d  평균:%5.2f  %n", datas[0],sum, sum/3.0); 
			}
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (Exception e){
			e.printStackTrace();
		} finally {
 		
		}
		System.out.println("************** Main END ****************");

	}
}
