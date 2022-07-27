package AssistedProject6;


// Insertion sort
public class myInsertSort {

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
		
		for(int i=1;i<length; i++) {
			int current = arr[i];
			int j=i-1;
			while(j>=0 && current <arr[j]) {
				
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1]=current;
		}
	}
}
