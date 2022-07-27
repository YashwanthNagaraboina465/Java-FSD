package AssistedProject2;

import java.util.Arrays;
import java.util.Scanner;

public class myBsearch {
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 5, 9, 41, 2, 6, 8, 4 };

		Arrays.sort(arr);
		for (int i : arr) {
			System.out.print(i + " "); // the sorted array

		}
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the search element");
		int key = s.nextInt();

		int alength = arr.length;
		BinarySearch(arr, key);

	}

	public static void BinarySearch(int[] arr, int key) {
		int length = arr.length;
		int temp = 0;

		int midvalue = (temp + length) / 2;

		try {
			while (temp <= length) {
				if (arr[midvalue] == key) {
					System.out.println("Element is found at " + midvalue + " in the sorted array");
					break;
				} else if (arr[midvalue] < key) {
					temp = midvalue + 1;

				} else {
					length = midvalue - 1;
				}
				midvalue = (temp + length) / 2;
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("element not found");
		}
	}
}