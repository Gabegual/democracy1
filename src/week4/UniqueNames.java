package week4;

import acm.program.ConsoleProgram;
import acmx.export.java.util.ArrayList;

public class UniqueNames extends ConsoleProgram {
	ArrayList namesPrint = new ArrayList();

	public void run() {

		initialNameList();
		storeName();
		printName();
	}

	/*
	 * this method gets input from user for name and adds it to arraylist namePrint
	 */
	private void storeName() {
		while (true) {
			String name = readLine("Enter Name: ");
			if (name.equals("")) {
				break;
			} else {
				if (!namesPrint.contains(name)) {
					namesPrint.add(name);

				}
			}
		}
	}

	/* clears name */
	private void initialNameList() {
		namesPrint.clear();
	}

	/* prints name from array list */
	private void printName() {
		for (int i = 0; i < namesPrint.size(); i++) {
			println(namesPrint.get(i));
			
		}
	}
}
