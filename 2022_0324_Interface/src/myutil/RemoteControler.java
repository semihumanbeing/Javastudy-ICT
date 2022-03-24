package myutil;

public interface RemoteControler extends Volume, Channel {
	//다중상속을 받은 모습
	// 같은 종류 상속을 받을 때는 extends를 사용한다.
	
	void onOff();	
	

}
