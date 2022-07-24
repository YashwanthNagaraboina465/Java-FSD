package Practise2ndAssisted5;

public class myThrows {

	void Division() throws ArithmeticException {
		int a = 45, b = 0, rs;
		rs = a / b;
		System.out.print("\nThe result is : " + rs);
	}

	public static void main(String[] args) {
		myThrows T = new myThrows();
		try {
			T.Division();
		} catch (ArithmeticException Ex) {
			System.out.print("\n  Arthematic Error : " + Ex.getMessage());
		}
		System.out.print("\nEnd of program.");
	}
}
