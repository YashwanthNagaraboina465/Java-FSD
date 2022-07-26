package AssistedProject2;

import java.util.Arrays;

public class OrderStatistics {

	public static int kthSmallest(int[] abc, int k) {

		if ((k < 1) || (k > abc.length)) {

			System.out.println("error");
			
		}
		else
			Arrays.sort(abc); // Sort the given array in ascending order

		return abc[k - 1];
	}

	// Main
	public static void main(String[] args) throws Exception{
		int arr[] = { 5, 266, 58, 15, 7, 8, 9 };
		

		int k = 0; // k= 2; 2nd smallest

		int l = kthSmallest(arr, k);
		System.out.print(k + "th" + " smallest element is " + l);
	}
}
