package AssistedProject3;

import java.util.Arrays;
import java.util.Scanner;

public class ExpSearch {

	public static void main(String[] args) {

		int[] arr = { 1, 8, 9, 5, 4, 12, 7 };

		Arrays.sort(arr);
		for (int i : arr) {
			System.out.print(i + " "); // the sorted array
		}
		int alength = arr.length;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the search element");
		int key = s.nextInt();
		
		int result = expsearch(arr,key);

		if(result <0) {
			System.out.println("Element is not found in the array");
		}else {
			System.out.println("Element is foud at "+result + " lcation of sorted array");
		}
	}

	public static int expsearch(int[] arr , int key) {
		
		int length = arr.length;
		if(arr[0] == key) {
			return 0;
		}
		int i=1;
		while(i<length && arr[i] <= key) {
			i*=2;
		}
		return Arrays.binarySearch(arr, key);  // Binary Search is intiated here;
	}
	
}
