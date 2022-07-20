
public class ap1TYPRECASTING {

	public static void main(String[] args) {

		// implicit conversion: SMALLER to LARGER

		System.out.println("Implicit Type Casting");

		char a = 'a';
		System.out.println("Value of a: " + a + "(ASCII value is " + (a+0)+ ")");

		int b = a;
		System.out.println("Value of b: " + b);

		float c = a;
		System.out.println("Value of c: " + c);

		long d = a;
		System.out.println("Value of d: " + d);

		double e = a;
		System.out.println("Value of e: " + e + "\n");
		

		// explicit conversion: BIGGER to SMALLER

		System.out.println("Explicit Type Casting");

		double x = 12.658;
		int y = (int) x;
		System.out.println("Value of x: " + x);
		System.out.println("Value of y: " + y);
		System.out.println("loss of data is occured during explicit casting" + " \n");

	}

}
