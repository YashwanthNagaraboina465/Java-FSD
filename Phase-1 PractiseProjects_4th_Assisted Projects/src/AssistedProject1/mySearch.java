package AssistedProject1;

import java.util.Scanner;

public class mySearch {

	public static int Search(int[] arr, int x) {
		int aLength = arr.length;

		for (int i = 0; i < aLength; i++) {

			if (arr[i] == x) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter the size of Array");
		int n = s.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Enter " + i + " th element of  array of Integer Variables");
			arr[i] = s.nextInt();
		}

		System.out.println(arr);

		System.out.println("now enter the element you wanted to search");

		int p = s.nextInt();

		int output = Search(arr, p);

		if (output <0) {
			System.out.println("Element is not found in array");
		} else {
			System.out.println("the element is found at " + output + " of the array");
		}

	}
}
