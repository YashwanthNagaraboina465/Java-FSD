package Project2ndAssisted2;



public class mySleep extends Thread {
	
	public void run(){
		int i = 2;
		while(i<6) {
			
			i++;
			
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		System.out.println("new Thread 't' is running ");
		}	}


	private static Object LOCK = new Object();

	public static void main(String args[]) throws InterruptedException {
		mySleep t = new mySleep();
	t.start();
		Thread.sleep(1000);
		
		System.out.println("Thread '" + Thread.currentThread().getName() + "' is woken after sleeping for 1 second");
		
		synchronized (LOCK) {
			LOCK.wait(1000);
			System.out.println("Object '" + LOCK + "' is woken after" + " waiting for 1 second");
		}
	}

}
