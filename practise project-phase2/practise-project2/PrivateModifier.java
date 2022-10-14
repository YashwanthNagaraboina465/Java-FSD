package AccessModifiers;

// 2. private : it is accessible within the class itself.

class PriMod {

	private int k = 5;

	private void data2() {
		System.out.println("it is private acess modifier");
	}

	void data21() {
		System.out.println(k); // 'k' is accessible within this class

	}

}

public class PrivateModifier {

	public static void main(String[] args) {
		PriMod d2 = new PriMod();

		System.out.println("in the private access ");

		// System.out.println(d2.k); ------- visibility in private mode

		d2.data21(); // data is visible method

		// d2.data2(); ------method is private and cannot be accessible

	}
}
