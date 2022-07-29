package VirtualKey;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Lockers {
	
	
// Main Method
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the user credentials(User Name)");
		String User = sc.next();
System.out.println();
		System.out.println("Hello " + User);
		System.out.println();

		MyPrototype();

	}

	private static void MyPrototype() {

		System.out.println(" ******   WELCOME to Lockers Pvt.Ltd  APP  ******");  

		System.out.println();

		System.out.println("Developed by '______ ' ");
		System.out.println();

		System.out.println("User Options ");
		String[] str = { "1.View My Sorted Files", "2. My Operatios ", "3. Close the application " };

		int length = str.length;
		for (int i = 0; i < length; i++) {
			System.out.println(str[i]);
		}

		List<String> list = new ArrayList<>();

		list.add("File1.txt");
		list.add("File4.txt");
		list.add("File3.txt");
		list.add("File1.zip");
		list.add("Project.docx");
		list.add("Layout.pdf");
		list.add("File2.txt");

		System.out.println("\n Click on your choice:\t");
	try {	Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();

		for (int j = 1; j <= length; j++) {
			if (option == j) {
				switch (option) {

				case 1:
					sort(list);
					System.out.println("Click '0' to enter the main Menu ");
					try {
						if (sc.nextInt() == 0) {
							MyPrototype();
						}
					} catch (Exception e) {
						System.out.println("Invalid Entry ");
						System.out.println("Pushed out off App");
					}
					break;

				case 2:

					System.out.println(" \n  **** OPERATIONS ***");

					System.out.println("Clik on the Below options");

					String[] arr = { "1. Add a new File", "2. Search a File ", "3. Delete a File",
							"4.Click to navigate to Miain Menu  " };

					int b2 = 4;
					for (int i = 0; i < b2; i++) {
						System.out.println(arr[i]);
					}

					System.out.println("\nEnter your choice:\t");

					int option2 = sc.nextInt();

					for (int p = 1; p <=4; p++) {
						if (option2 == p) {
							switch (option2) {
							case 1:
								System.out.println("Enter the File you wanted to add : \n");
								String value = sc.next();
								list.add(value);
								System.out.println("Your value is updated\n");
								System.out.println(list + "\n");

								System.out.println("Click '0' to enter the main Menu ");
								try {
									if (sc.nextInt() == 0) {
										MyPrototype();
									}
								} catch (Exception e) {
									System.out.println("Invalid Entry ");
									System.out.println("Pushed out off App");
								}

								break;

							case 2:
								searchExpenses(list);

								System.out.println();

								System.out.println("Click '0' to enter the main Menu ");
								try {
									if (sc.nextInt() == 0) {
										MyPrototype();
									}
								} catch (Exception e) {
									System.out.println("Invalid Entry ");
									System.out.println("Pushed out off App");
								}

								break;

							case 3:
								System.out.println("Enter the File you wanted to delete");

								String aFile = sc.next();
								boolean boo = list.remove(aFile);
								if (boo == true) {
									System.out.println(aFile + " is successfuly Deleted");
								} else {
									System.out.println("File is not found");
								}
								System.out.println("Click '0' to enter the main Menu ");
								try {
									if (sc.nextInt() == 0) {
										MyPrototype();
									}
								} catch (Exception e) {
									System.out.println("Invalid Entry ");
									System.out.println("Pushed out off App");
								}
								break;

							case 4 :
								
								MyPrototype();
								break;

							}
						}

					}
				
break;
				case 3:
					closeApp();
					break;

				}
			}
		}
	}catch(Exception jdkf) {
		System.out.println("Invalid Entry . Try again..");
		MyPrototype();
	}

	}

	private static void closeApp() {
		System.out.println(
				"the application is closing  \n  *********** \n Enter  '0' if you refuse. \n  enter 'continue' to proceed to close");
		Scanner s = new Scanner(System.in);
		try {
			int gg = s.nextInt();

			if (gg == 0) {
				MyPrototype();
			}
		} catch (Exception e) {
			System.out.println("the app is closed");
		}
	}

	private static void searchExpenses(List<String> list) {

		System.out.println("enter the File you wanted to search");
		Scanner se = new Scanner(System.in);
		String lc = se.next();
		int l3 = list.size();
	
		for (int i = 0; i < l3; i++) {

			if (lc.compareTo(list.get(i)) == 0) {
				System.out.println("your File " + lc + " is found at index " + i);
				return;
			}
		}
		System.out.println("your File  " + lc + " is  not found  ");
		System.out.println("**************");

	}

	private static void sort(List<String> list) {

		int l = list.size();
		String[] a = new String[l];
		Collections.sort(list);

		for (int i = 0; i < l; i++) {
			a[i] = list.get(i);

		}
		System.out.println("the sorted Files in increasing FileSize order are ");
		for (int k = 0; k < a.length; k++) {

			System.out.println(a[k] + "  ");
		}

		System.out.println("\n***************");

	}
}
