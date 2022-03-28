package mymain;

public class AnonymousTest {

	class TestA {
		int a;

		public void sub() {
			System.out.println("--testA:sub()--");
		}
	}

	class TestB extends TestA {
		int b;

		public void sub() {
			System.out.println("--testB:sub()--");
		}
	}

	public static void main(String[] args) {
		new AnonymousTest() {
		
		TestA a = new TestB();{
		a.sub();
		}
		TestA aa = new TestA() {
			public void sub() {
				super.sub();
			}
		
		};
		};
	}
	
}
