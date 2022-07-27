package AssistedProject7;

// MergeSort method : by divide&Conquer
public class MergeSort {

	
	public static void conquer(int[] arr,int x ,int mid,int y) {
		
		int len = arr.length;
		int[] sort = new int[y-x+1];
		
		int n1=x;
		int n2=mid+1;
		int temp=0;
		while(n1 <= mid && n2 <= y) {
			if(arr[n1]<=arr[n2]) {
				sort[temp]=arr[n1];
				temp++;
				n1++;
			}
			else {
				sort[temp]=arr[n2];
				temp++;
				n2++;
			}
		}
		while(n1<mid) {
			sort[temp]=arr[n1];
			temp++;
			n1++;
		}
		while(n2 < y) {
			sort[temp]=arr[n2];
			temp++;
			n2++;
		}
	print(sort);
	}
	public static void print(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		
	}
	
	public static void divide(int[] arr,int x ,int y) {
	 int p =arr.length;
		if (x<y) {
		int mid = x+(y-x)/2;
		 divide(arr, x,mid);
		 divide(arr, mid+1 ,y);
		
		 conquer(arr,x,mid,y);
		return ;}
		}
	public static void main(String[] args) {
		int arr[] = {7,8,9};
		int n = arr.length;
		
		divide(arr,0,n-1);
	
	}
	
}
