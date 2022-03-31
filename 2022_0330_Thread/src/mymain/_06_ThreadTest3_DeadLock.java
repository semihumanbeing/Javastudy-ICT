package mymain;

class MyRunnable3 implements Runnable{
	
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
					wait();
					//중간에 자원이 끊겨버리면 교착상태가 되어 프로그램이 진행되지않는다.
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
				
			}//while
			
				
			}
	}//run
	
}
public class _06_ThreadTest3_DeadLock {
	
	
	public static void main(String[] args) {
		Runnable runnable = new MyRunnable3();
		
		Thread t1 = new Thread(runnable,"형님");
		Thread t2 = new Thread(runnable,"아우");
		
		t1.start();
		t2.start();
		
	}

}
