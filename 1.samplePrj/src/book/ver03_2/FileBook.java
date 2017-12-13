package book.ver03_2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileBook { //file save & load ����� ������ class ����

		public synchronized void save(Object obj, String fileName){ //����ȭ ó�� 
			FileOutputStream fos = null;
			BufferedOutputStream bos = null;
			ObjectOutputStream oos = null;
			
			try {
				fos = new FileOutputStream(fileName);
				bos = new BufferedOutputStream(fos);
				oos = new ObjectOutputStream(bos);
				oos.writeObject(obj);
				oos.flush(); //buffer�� ���� �ݵ�� flush() �����ؾ�.
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
				System.out.println("������ �Ϸ�Ǿ����ϴ�.");
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
				
				obj = ois.readObject(); //�о obj�� ����.
				System.out.println("���� �бⰡ �Ϸ�Ǿ����ϴ�."); 

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

