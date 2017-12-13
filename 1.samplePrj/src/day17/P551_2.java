package day17;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Scanner;

public class P551_2 {
	public static void main(String[] args) {
		String tableName = "userinfo";
		String fileName = "data4.txt";
		String msg = "INSERT INTO "+tableName+" VALUES({0},{1},{2},{3});";
		String pattern = "{0},{1},{2},{3}";
        MessageFormat f = new MessageFormat(pattern);
        
		try(Scanner scanner = new Scanner(new File(fileName))){
		   while(scanner.hasNextLine()){
			   String readLine = scanner.nextLine();
			   Object[] obj =  f.parse(readLine);
			   System.out.println(Arrays.toString(obj));
			   String makeMsg = MessageFormat.format(msg, obj);
			   System.out.println(makeMsg);
		   }
		}catch (FileNotFoundException e) {
           System.out.println(e.getMessage());
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			
		} 

	}
}
