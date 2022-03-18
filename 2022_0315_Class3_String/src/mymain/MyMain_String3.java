package mymain;

public class MyMain_String3 {
	public static void main(String[] args) {
		
		int count = 0;
		
		// String을 + 로 늘릴때마다 새로운 스트링이 만들어지기 때문에 과한 메모리 낭비를 유발하게된다.
		String msg = ++count + "little," + ++count + "little," + ++count + "little";
		
		System.out.println(msg);
		
		//해결방안: StringBuffer 이용하기
		StringBuffer sb = new StringBuffer(40); // StringBuffer 에 40개 문자를 넣을 수 있는 공간확보
		count = 0;
		
		sb.append(++count);
		sb.append(" little ");
		sb.append(++count);
		sb.append(" little ");
		
		String msg1 = sb.toString(); // StringBuffer -> String 추출하기
		
		System.out.println(msg1);
		
		// 해결방안 2: Formatter 이용하기
		count = 0;
		
		String msg2 = String.format("%d little, %d little, %dlittle", ++count, ++count, ++count);
		System.out.println(msg2);
		
		
		
	}

}
