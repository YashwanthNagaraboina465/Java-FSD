package AssistedProject5;

public class myBubbleSort {

	public static void main(String[] args) {
		int[] arr = { 1, 5, 8, 4, 0, 9, 7 };

		int alength = arr.length;

		BubbleSort(arr); // Bubble sorting

		for (int a : arr) {
			System.out.print(a + " ");

		}
	}

	static void BubbleSort(int[] arr) {

		int length = arr.length;

		int temp;
		for (int i = 0; i < length; i++) {
			for (int j = 1; j < length; j++) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}
