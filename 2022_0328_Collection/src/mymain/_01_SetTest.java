package mymain;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class _01_SetTest {

	// Set - 순서없이 저장되는 자료구조
	// - 동일값 저장이 되지 않는다.
	// HashSet - 순서없이 출력
	// TreeSet - 정렬되어 출력

	public static void main(String[] args) {
		Set set = new HashSet();

		set.add(10);
		set.add(10.5);
		set.add(true);
		set.add("aaa");

		// 순서가 없이 출력된다

		Set<Integer> set2 = new TreeSet<Integer>();
		set2.add(10);
		set2.add(5);
		set2.add(9);
		set2.add(2);

		System.out.println(set2);

		Set<String> set3 = new HashSet<String>();
		set3.add("사과");
		set3.add("포도");
		set3.add("수박");
		set3.add("딸기");

		// 개선루프
		for (String fruit : set3) {
			System.out.println(fruit);
		}
		// Ilterator(반복자)
		Iterator<String> it = set3.iterator();
		System.out.println("--각 요소 추출--");
		while (it.hasNext()) {
			String fruit = it.next(); // 값을 가져온다
			System.out.println(fruit);
		}
		
		// 로또번호 생성
		
		Random random = new Random();
		int n = 6;
		Set<Integer> lotto = new TreeSet<Integer>();
		while(n>0) {
			int number = random.nextInt(46);
			if(lotto.add(number)==false) {
				continue;
			}
			n--;

		}
		
		System.out.println(lotto);
		
		//collection -> array
		Integer[] lottoArray = new Integer[lotto.size()];
		lotto.toArray(lottoArray);
		
		for(int i=0; i<lottoArray.length;i++) {
			System.out.printf("%d - %d\n",i, lottoArray[i]);
		}

	}

}
