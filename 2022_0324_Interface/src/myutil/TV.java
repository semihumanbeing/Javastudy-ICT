package myutil;

public class TV implements RemoteControler {

	int volume = 10; // 볼륨값 저장
	int channel = 4; // 채널값 저장

	boolean onOff = false; // 전원 상태
	boolean silent = false; // 음소거상태

	@Override
	public void volumeUp() {
		volume++;
		if (volume> Volume.MAX) {
			volume = Volume.MAX;
		}
		display();
	}

	@Override
	public void volumeDown() {
		volume--;
		if(volume < Volume.MIN) {
			volume = Volume.MIN;
		}
		display();
	}

	@Override
	public void silentMode() {
		silent = !silent;
		display();
	}

	@Override
	public void channelUp() {
		channel++;
		if (channel > Channel.MAX) {
			channel = Channel.MIN;
		}
		display();
	}

	@Override
	public void channelDown() {
		channel--;
		if (channel < Channel.MIN) {
			channel = Channel.MAX;
			
		}
		display();
			
	}

	@Override
	public void setChannel(int channel) {
		this.channel = channel;
		display();
	}

	@Override
	public void onOff() {
		// toggle 처리
		onOff = !onOff;
		display();

	}

	private void display() {
		if (onOff == true) {
			System.out.println("---TV: 켜짐---");
			System.out.printf("채널: %d번\n", channel);
			if (silent) {
				System.out.println("음소거");
			} else {
				System.out.printf("음량: %d\n", volume);
			}

		} else {
			System.out.println("---TV: 꺼짐---");
		}

	}

}
