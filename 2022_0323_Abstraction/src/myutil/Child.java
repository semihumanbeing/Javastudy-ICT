package myutil;

public class Child extends Parent {
	
	
	// method Override(재정의)
	// 부모의 메서드를 자식이 다시 정의한 메서드
	
	@Override // <- JVM을 위한 주석
	public void sub() {
		// TODO Auto-generated method stub
		//super.sub();
		System.out.println("--child:sub()--");
	
	}

}
