package mymain;

import myutil.Channel;
import myutil.RemoteControler;
import myutil.TV;
import myutil.Volume;

public class MyMainTV {

	public static void main(String[] args) {
		//매뉴얼                   설계도
		RemoteControler remocon = new TV();
		
		remocon.onOff();
		remocon.volumeUp();
		remocon.volumeUp();
		
		remocon.setChannel(8);
		for(int i=0;i<10;i++) {
			remocon.channelDown();
			
		}
		
		//리모콘으로부터 기능만 추출
		Volume volume = remocon;
		Channel channel = remocon;
		volume.volumeUp();
		channel.setChannel(55);
		
	}

}
