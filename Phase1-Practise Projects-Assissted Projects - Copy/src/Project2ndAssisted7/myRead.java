package Project2ndAssisted7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class myRead {
	public static void main(String[] args) {
		try {
			File o = new File("C:\\eclipseWorkspace\\file1.txt");
			Scanner mr = new Scanner(o);
			while (mr.hasNextLine()) {
				String data = mr.nextLine();
				System.out.println(data);
			}
			mr.close();
		} catch (FileNotFoundException e) {
			System.out.println("an error occured");
			System.out.println(e);
		}
	}
}
