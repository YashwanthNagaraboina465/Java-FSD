package Practise2ndAssisted5;

// here MyException is custom which extends Exception

	class MyException extends Exception 
	{ 
	    public MyException(String s) 
	    { 
	        super(s); 
	    } 
	} 
	public class myCustomThrow 
	{ 
	    public static void main(String args[]) 
	    { 
	        try
	        { 
	            throw new MyException("temp"); 
	        } 
	        catch (MyException ex) 
	        { 
	            System.out.println("Error"); 
	            System.out.println(ex.getMessage()); 
	        } 
	    } 
	}


