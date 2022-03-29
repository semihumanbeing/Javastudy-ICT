package mymain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import vo.PersonVo;

public class _05_ArrayList_CompareTo_Map_OnSearch {
	public static void main(String[] args) {
		Random random = new Random();
		
	List<PersonVo> personList = new ArrayList<PersonVo>();
	Map<String,PersonVo> personMap = new HashMap<String,PersonVo>();
	
	for(int i =0;i<=100;i++) {
		String name = String.format("길동%03d", i);
		//System.out.println(name);
		int age = random.nextInt(99)+1;
		//System.out.println(age);
		String address = String.format("서울시 마포구 서교%d동",random.nextInt(10)+1);
		
		PersonVo p = new PersonVo(name,age,address);
		// 생성된 객체를 어레이리스트에 추가한것
		personList.add(p);
		// 생성된 객체를 맵에 추가하기
		personMap.put(name, p);
		
	}
	
	//System.out.println(personList.size());
	String searchName = "길동060";
	
	// ArrayList로 객체 검색하기
	int count = 0;
	for(int i = 0; i <personList.size();i++) {
		count++;
		PersonVo p = personList.get(i);
		
		if(searchName.equals(p.getName())) {
			System.out.println(p);
			break;
		}
	}

	System.out.printf("ArrayList로 %s를 발견할 때 까지의 검색횟수: %d\n",searchName, count);
	
	
	// Map으로 객체 검색하기
	PersonVo p = personMap.get(searchName);
	System.out.println(p);
	

	}
}
