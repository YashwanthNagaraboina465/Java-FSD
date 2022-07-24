package Project2ndAssisted7;

import java.io.FileWriter;
import java.io.IOException;

public class myWrite {

	public static void main(String[] args) {
		try {
			FileWriter mw = new FileWriter("C:\\eclipseWorkspace\\file1.txt");
			mw.write("somenj datajhjid ");
			mw.close();
			System.out.println("some data is written in file");
		} catch (IOException ioe) {
			System.out.println("some error occured");
			System.out.println(ioe);
		}

	}

}
