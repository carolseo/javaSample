package day19;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class MapTest {
	public static void main(String[] args) {
		Map<String, String> map = new TreeMap<>();
		map.put("java01", "1234");
		map.put("java01", "1234");
		map.put("java02", "43214");
		map.put("kk", "1234");
		map.put("vv", "1234");
		map.put("java05", "321444");
		map.put("java06", "321664");
		map.put("java07", "335214");
		map.put("java08", "433214");
		map.put("java09", "22214");
		map.put("java10", "1111");

		boolean flag = true;
		while (flag) {
			System.out.println(" 로그인 처리");
			Scanner scanner = new Scanner(System.in); // 키보드 입력은 예외처리 필요 없음.
			System.out.println("ID : _");
			String id = scanner.nextLine();
			System.out.println("\n PW : _");
			String pw = scanner.nextLine();

			if (map.containsKey(id)) {
				if (map.get(id).equals(pw)) {
					System.out.println("로그인에 성공하였습니다.");
					flag = false;
					break; // 성공시 중지(빠져나오기)
				} else {
					System.out.println("비밀번호를 다시 확인해주세요.");
					continue;
				}
			} else {
				System.out.println("입력하신 ID가 존재하지 않습니다.");
				continue;
			}
		}
		System.out.println("------------------------  서비스 목록 ----------------------------");
		Set<String> keys = map.keySet(); Iterator<String> it = keys.iterator();
		while (it.hasNext()) { 
			String keyName = (String) it.next();
	
		System.out.println("ID :"+keyName+" , pw : "+map.get(keyName)); 
		
		}	
	}
}
	
/*
 * System.out.println(map); //마지막 data가 오버라이트됨. (key값은 중복불허) /
 * System.out.println(map.get("java01"));
 * 
 * System.out.println(map.keySet()); //keySet()> key값만 추출하여 set 구조 만듬.
 */
