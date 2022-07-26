package AssistedProject8;


public class myStack {
	int k = 10;
	int[] arr = new int[k];
	int t = 0; 
	
	public void  Push(int a) {
		
		arr[t]=a;
		t++;
	}
	
	public int pop() {
		
		int b = arr[--t];
		
		return b;
	}
	 
	
	public void display() {
		
		for(int n : arr) {
			System.out.print(n +" ");
		}
	}
	
public static void main(String[] args) {
	myStack s = new myStack();
	s.Push(5);
	s.Push(9);
	s.Push(11);
	s.display();
	System.out.println("\n"+s.pop() +" is popped out");
	
}
}
