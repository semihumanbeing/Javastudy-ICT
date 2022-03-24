package mymain;

import myutil.Child;
import myutil.Parent;

public class MyMain_Child {

	public static void main(String[] args) {
		
		Parent p = new Child();
		
		p.sub(10); // parent에 있는 메서드가 호출된다
		p.sub(); // 맨 마지막에 override 된 메서드가 호출된다.

	}

}
