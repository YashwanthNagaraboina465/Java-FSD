import java.util.*;

public class collections {

	public static void main(String[] args) {

		// creating array list

		System.out.println("ArrayList at position 1& 2 are");
		ArrayList<String> student = new ArrayList<String>();
		student.add("radha");
		student.add("krishna");
		System.out.println(student.get(0) + student.get(1) + "\n");

		
		   System.out.println("LinkedList");
		LinkedList<String> a = new LinkedList<String>();
		a.add("Ravi");
		a.add("Vijay");
		a.add("Ravi");
		a.add("Ajay");
		Iterator<String> i = a.iterator();
		while (i.hasNext()) {
			System.out.println(i.next() + "\n");
		}
		
		
		   System.out.println("Vector");
			Vector<String> v=new Vector<String>();  
			v.add("1");  
			v.add("15");  
			v.add("-2");  
			 System.out.println(v);
			 
			 
			   System.out.println("LinkedHashSet");
			 LinkedHashSet<String> set=new LinkedHashSet<String>();  
			 set.add("001");  
			 set.add("0041");  
			 set.add("006");  
			 set.add("009");  
			  
			 System.out.println(set );  
			   System.out.println("\n");
			 
			   
			   
		       //creating hashset : ascending order
		       
		       System.out.println("HashSet");
		       HashSet<Integer> sp=new HashSet<Integer>();  
		       sp.add(10);  
		       sp.add(13);  
		       sp.add(2);
		       sp.add(1);
		       System.out.println(sp);
		       
		       System.out.println("\n");
		       
		       //treeset : quick than hashset
		       System.out.println("TreeSet");
		       TreeSet<Integer> ts=new TreeSet<Integer>();  
		       ts.add(101);  
		       ts.add(13);  
		       ts.add(29);
		       ts.add(1);
		       System.out.println(ts);
		       

			 
			 
		}

	}

