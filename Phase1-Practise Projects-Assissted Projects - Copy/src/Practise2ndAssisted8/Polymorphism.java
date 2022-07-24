package Practise2ndAssisted8;
import java.io.FileReader;
public class Polymorphism {

		public static void main(String[] args) {
			Polymorphism obj = new Polymorphism();
			obj.add(2, 4);
			obj.add(2, 3, 4);
			obj.add(2.3f, 4.5f);
		}
		
		void add(int a, int b) {		
			int result1 = a + b;
			System.out.println("Result = " + result1);
		}
		
		void add(float a, float b) {
			float result2 = a + b;
			System.out.println("Result = " + result2);
		}
		
		void add(int a, int b, int c) {
			int result3 = a + b + c;
			System.out.println("Result = " + result3);
		}

		
	}

