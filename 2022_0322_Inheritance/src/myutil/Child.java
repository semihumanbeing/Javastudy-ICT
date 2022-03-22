package myutil;

public class Child extends Parent {
	
	int childMoney; //자식돈
	
	public Child() { //기본생성자
		childMoney = 1000;
		System.out.println("--child()--");
		
	}

	public Child(int childMoney) {
		super();
		this.childMoney = childMoney;
		System.out.println("--child(int)--");
	}
	
	public Child(int childMoney, int ParentMoney) {
		super(ParentMoney);
		this.childMoney = childMoney;
		System.out.println("--child(int, int)--");
	}

}
