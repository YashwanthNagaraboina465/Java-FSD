package AssistedProject4;

// selection sort
public class mySort {

	public static void main(String[] args) {
		int[] arr = {1,5,8,4,0,9};
		
		int alength = arr.length;
		
		sort(arr);  // sorting
		
		for (int a : arr) {
			System.out.print(a+" ");
			
	}
	}
 
	static void sort(int[] arr) {
		
		int length = arr.length;
		
	int temp ;
		 for(int i = 0; i<length; i++) {
			int  smallest = arr[i];
			
			 for(int j=i+1;j<length;j++) {
				 if(smallest>arr[j]) {
					 temp=arr[i];
					 arr[i]=arr[j];
					 arr[j]=temp;
				 }
			 }
		 }
	}
	
}
