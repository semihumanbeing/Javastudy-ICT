package mymain;

class MyRunnable implements Runnable{
	
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		
		while(true) {
			synchronized(this) {
				notify();
				System.out.printf("%s 먼저\n",name);
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
public class _04_ThreadTest3_Fairness {
	
	
	public static void main(String[] args) {
		Runnable runnable = new MyRunnable();
		
		Thread t1 = new Thread(runnable,"형님");
		Thread t2 = new Thread(runnable,"아우");
		
		t1.start();
		t2.start();
		
	}

}
