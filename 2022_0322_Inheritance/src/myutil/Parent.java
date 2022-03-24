package myutil;

public class Parent {
	
	int parentMoney;//ºÎ¸ğµ·
	
	public Parent() {
		parentMoney = 100;
		System.out.println("--parent()--");
	}

	public Parent(int parentMoney) {
		super();
		this.parentMoney = parentMoney;
		System.out.println("--parent(int)--");
	}

}
