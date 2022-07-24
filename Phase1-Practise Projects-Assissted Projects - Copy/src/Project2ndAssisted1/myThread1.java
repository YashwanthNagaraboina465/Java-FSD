package Project2ndAssisted1;

public class myThread1 extends Thread { // extending the Thread class

	public void run() {
		System.out.println("new Thread 't' is running ");
	}

	public static void main(String[] args) {

		myThread1 t = new myThread1();
		t.start();
		System.out.println("its main .");
	}

}
