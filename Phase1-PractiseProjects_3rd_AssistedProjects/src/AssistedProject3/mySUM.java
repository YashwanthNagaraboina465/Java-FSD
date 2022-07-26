package AssistedProject3;
 
// sum of numbers between range l and r
public class mySUM {
	static int n = 200000, i,j,k;
	
	public static int sum(int L,int R)
	{
		int[] arr = new int [20000];
		arr[0]=1;
		for(i=1;i<20000;i++) {
			arr[i]= arr[i-1]+2;
		}
		// for sum of numbers before l
		int sum1 =0;
		for (j=0;j<L;j++) {
			sum1= sum1 + arr[j];
		}
		int sum2=0;
		for (k=0;k<=R;k++) {
			sum2= sum2 + arr[k];
			}
		
		return sum2-sum1;
		
	}

	
	public static void main(String[] args) {
		
		int[] arr = new int[n];   // arr ={1,3,5,7,....n} ----> series of odd numbers
	
	System.out.println(sum(0,3));
	System.out.println(sum(1,13));
	System.out.println(sum(99,103));
	
	}
}
