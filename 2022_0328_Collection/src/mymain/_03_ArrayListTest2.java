package mymain;

import java.util.ArrayList;
import java.util.List;

import vo.PersonVo;

public class _03_ArrayListTest2 {

	public static void main(String[] args) {
		List<PersonVo> personList = new ArrayList<PersonVo>();

		personList.add(new PersonVo("일길동", 11, "서울시 마포구 서교1동"));
		personList.add(new PersonVo("이길동", 21, "서울시 마포구 서교2동"));
		personList.add(new PersonVo("삼길동", 31, "서울시 마포구 서교3동"));
		personList.add(new PersonVo("사길동", 41, "서울시 마포구 서교4동"));
		personList.add(new PersonVo("오길동", 51, "서울시 마포구 서교5동"));

		// 첫번째 객체정보 얻어오기

		System.out.println("");
		PersonVo person1 = personList.get(0);
		System.out.println(person1);

		System.out.println("첨자 이용한 출력");
		for (int i = 0; i < personList.size(); i++) {
			PersonVo p = personList.get(i);
			System.out.println(p);
		}

		System.out.println("개선루프");
		for (PersonVo p : personList) {
			System.out.println(p);
		}

	}

}
