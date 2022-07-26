package AssistedProject9;

import java.util.LinkedList;
import java.util.Queue;

public class myQueue {

	public static void main(String[] args) {
		
		Queue<String> q = new LinkedList<>();
		q.add("rama");
		q.add("sita");
		q.add("laxman");
		q.add("hanuma");
		
		System.out.println(q +" "+ 	q.size());
		
		System.out.println(q.remove());
		System.out.println(q + " "+ q.size());
	
		q.removeAll(q);
		System.out.println(q + " "+ q.size());
	}

}
