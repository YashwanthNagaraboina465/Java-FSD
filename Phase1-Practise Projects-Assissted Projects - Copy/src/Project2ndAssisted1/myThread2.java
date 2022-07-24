package Project2ndAssisted1;

public class myThread2 implements Runnable {

	public static int myCount = 0;

	public myThread2() {

	}

	public void run() {
		while (myThread2.myCount <= 10) {
			try {
				System.out.println("Expl Thread: " + (++myThread2.myCount));
				Thread.sleep(100);
			} catch (InterruptedException i) {
				System.out.println("Exception in thread: " + i.getMessage());
			}
		}
	}

	public static void main(String a[]) {
		System.out.println("Starting Main Thread...");
		myThread2 t2 = new myThread2();
		Thread t = new Thread(t2);
		t.start();
		while (myThread2.myCount <= 10) {
			try {
				System.out.println("Main Thread: " + (++myThread2.myCount));
				Thread.sleep(100);
			} catch (InterruptedException i2) {
				System.out.println("Exception in main thread: " + i2.getMessage());
			}
		}
		System.out.println("End of Main Thread...");
	}
}
