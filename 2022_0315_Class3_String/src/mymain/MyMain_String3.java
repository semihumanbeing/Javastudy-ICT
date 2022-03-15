package mymain;

public class MyMain_String3 {
	public static void main(String[] args) {
		
		int count = 0;
		
		//과한 메모리 낭비
		String msg = ++count + "little," + ++count + "little," + ++count + "little";
		
		System.out.println(msg);
		System.out.println(msg.length());
		
		//해결방안: StringBuffer 이용하기
		StringBuffer sb = new StringBuffer(40); // StringBuffer 에 40개 문자를 넣을 수 있는 공간확보
		count = 0;
		
		sb.append(++count);
		sb.append("little");
		sb.append(++count);
		sb.append("little");
		
		String msg1 = sb.toString();
		
		System.out.println(msg1);
		
	}

}
