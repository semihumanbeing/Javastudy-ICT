package mymain;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class _04_MapTest {
	
	/*
	 * Map 
	 * ㄴ HashMap - 정렬되지않는 맵 
	 * ㄴ TreeMap - 정렬되는 맵 
	 */
	
	public static void main(String[] args) {
		Map<Integer, String> telMap = new HashMap<Integer,String>();
		
		telMap.put(1, "010-111-1234");
		telMap.put(2, "010-222-1234");
		telMap.put(3, "010-333-1234");
		telMap.put(4, "010-444-1234");
		telMap.put(5, "010-555-1234");
		
		int shortNumber = 1;
		String tel = telMap.get(shortNumber);
		System.out.printf("단축번호 %d / %s\n", shortNumber,tel);
		
		Set<Integer> keySet = telMap.keySet();
		System.out.println("맵 전체 데이터 출력");
		for(Integer key:keySet) {
			// key 에 해당하는 값 얻어오기
			String tel1 = telMap.get(key);
			System.out.printf("단축번호: %d / %s\n", key, tel1);
		}
		
	}
}
