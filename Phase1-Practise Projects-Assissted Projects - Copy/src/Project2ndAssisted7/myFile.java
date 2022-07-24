package Project2ndAssisted7;

import java.io.File;
import java.io.IOException;

public class myFile {

	public static void main(String[] args) {
		try {
			File o = new File("C:\\eclipseWorkspace\\file1.txt");
			if(o.createNewFile()) {
				System.out.println("file created"+o.getName());
			}else {
				System.out.println("file already there");
			}
		}catch(IOException ioe) {
			System.out.println("error occured");
			System.out.println("ioe");
		}
	}
	
}
