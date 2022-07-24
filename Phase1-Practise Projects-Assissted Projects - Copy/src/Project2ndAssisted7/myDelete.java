package Project2ndAssisted7;

import java.io.File;

public class myDelete {

	public static void main(String[] args) {
	
File d = new File("C:\\eclipseWorkspace\\file1.txt");
    if (d.delete()) {
    	System.out.println("file is delted succsessfully");
    }else {
    	System.out.println("file is not deleted");
    }

	}

}
