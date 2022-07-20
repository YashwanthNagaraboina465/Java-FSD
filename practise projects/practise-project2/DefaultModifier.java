package AccessModifiers;

// 1. default access modifier : it is accessible within the classes of particular  within package

class DefMod {

	int k = 2;

	void data1() {

		System.out.println("it is default access modifier");
	}

}

public class DefaultModifier {
	public static void main(String[] args) {

		DefMod d1 = new DefMod();

		d1.data1();
		System.out.println(d1.k);
	}

}
