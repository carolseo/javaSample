package book.ver03_2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileBook { //file save & load 기능을 포함한 class 생성

		public synchronized void save(Object obj, String fileName){ //동기화 처리 
			FileOutputStream fos = null;
			BufferedOutputStream bos = null;
			ObjectOutputStream oos = null;
			
			try {
				fos = new FileOutputStream(fileName);
				bos = new BufferedOutputStream(fos);
				oos = new ObjectOutputStream(bos);
				oos.writeObject(obj);
				oos.flush(); //buffer를 쓰면 반드시 flush() 수행해야.
			} catch (FileNotFoundException e) {
				System.err.println(e.getMessage());
			} catch (Exception e) {
				System.err.println(e.getMessage());
			} finally {
				try {
					if(oos !=null){
						oos.close(); 
						oos= null;
					}if(bos !=null){
						bos.close(); 
						bos= null;
				} if(fos != null){
						fos.close();
						fos = null;
					}
				} catch (IOException e) {
					System.err.println(e.getMessage());
				}
			}
				System.out.println("저장이 완료되었습니다.");
		}

		public synchronized Object read(String fileName){  
			FileInputStream fis = null;
			BufferedInputStream bis = null;
			ObjectInputStream ois = null;
			Object obj = null; //return data type
			
			try {
				fis = new FileInputStream(fileName);
				bis = new BufferedInputStream(fis);
				ois = new ObjectInputStream(bis);
				
				obj = ois.readObject(); //읽어서 obj에 저장.
				System.out.println("파일 읽기가 완료되었습니다."); 

			}catch (FileNotFoundException e) {
				System.err.println(e.getMessage());
			} catch (Exception e) {
				System.err.println(e.getMessage());
			} finally {
				try {
					if(ois !=null){
						ois.close(); 
						ois= null;
					}if(bis !=null){
						bis.close(); 
						bis= null;
					} if(fis != null){
						fis.close();
						fis = null;
					}
				} catch (IOException e) {
					System.err.println(e.getMessage());
				}
			}
		return obj;
		}
}

