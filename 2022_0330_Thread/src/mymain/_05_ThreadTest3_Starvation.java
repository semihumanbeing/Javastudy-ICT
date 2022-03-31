package mymain;

class MyRunnable2 implements Runnable{
	
	int money = 10000;
	
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		
		while(true) {
			synchronized(this) {
				if(money>1000)
				notify();
				money -=1000;
				System.out.printf("%s 먼저 (%d원) \n",name,money);
				try {
					Thread.sleep(500);
					wait();
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
				
			}//while
			
				
			}
	}//run
	
}
public class _05_ThreadTest3_Starvation {
	
	
	public static void main(String[] args) {
		Runnable runnable = new MyRunnable2();
		
		Thread t1 = new Thread(runnable,"형님");
		Thread t2 = new Thread(runnable,"아우");
		
		t1.start();
		t2.start();
		
	}

}
