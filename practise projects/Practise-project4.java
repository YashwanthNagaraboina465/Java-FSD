

	class student {

		int roll;
		String name;

		void idcard() {
			System.out.println("student name is" + name);
			System.out.println("student roll is" + roll);
		}
	}

	class specificStudent {
		int roll;
		String name;

		specificStudent(int a, String b) {
			roll = a;
			name = b;
		}

		void idcard() {
			System.out.println("student name is" + name);
			System.out.println("student roll is" + roll);

		}

	}
	public class Constructor {


	public static void main(String[] args) {
		
		// for default constructor
		student  s = new student();
		 s.idcard();
		 
		 System.out.println("\n");
		 
		 // for parameterized constructor
		 specificStudent sp = new specificStudent(25,"gabbar");
		 
		 sp.idcard();
		 
	}

}
