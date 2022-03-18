package myutil;

public class MySingleTon {
	
	//single-ton pattern
	static MySingleTon single = null;
	
	public static MySingleTon getInstance() {
		
		if (single == null)
			single = new MySingleTon();
		return single;
		
	}
	
	// 외부에서 생성을 못하게 한다.
	private MySingleTon() {
		System.out.println("--MySingleTon()--");
	}
	
	public void push_nail() {
		System.out.println("--못박기--");
	}

}
