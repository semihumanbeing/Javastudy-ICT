package mymain;

import myutil.MySingleTon;

public class MyMain_SingleTon {

	public static void main(String[] args) throws Exception {
		
		
		while(true) {
			MySingleTon singleton = MySingleTon.getInstance();
			singleton.push_nail();
			
			Thread.sleep(2000);
		}

	}

}
