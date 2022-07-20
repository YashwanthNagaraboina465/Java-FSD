package AccessModifiers;


public class PrivateModifierMain {

	public static void main(String[] args) {
	
		System.out.println("data can't be accessbile in private");
		PrivateModifier d2 = new PrivateModifier();
		// d2.data2();  -------- data can't be accessible as it is private
		// System.out.println(d2.k);     --------- compile time error
		
		

	}

}
