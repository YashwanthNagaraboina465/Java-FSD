package Practise2ndAssisted5;

import java.util.Scanner;

public class myFinally {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		try {
			int a, b;
			System.out.println("enter a,b");
			a = s.nextInt();
			b = s.nextInt();
			int c = a / b;
			System.out.println(c);

		} catch (ArithmeticException A) {
			System.out.println("some errror ");

			System.out.println(A);
		} finally {
			System.out.println("even after execution / error the finally is done ");
		}
	}
}
