package myutil;

public interface Channel {
	
	// 상수
	
	int MIN = 0;
	int MAX = 100;
	
	//추상메서드
	
	void channelUp();
	void channelDown();
	void setChannel(int channel);
	

}
