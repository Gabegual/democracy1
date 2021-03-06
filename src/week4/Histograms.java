package week4;

import java.io.*;
import java.util.*;
import acm.program.ConsoleProgram;

public class Histograms extends ConsoleProgram {

	public void run() {

		int[] counts = new int[101];

		Scanner nameScan = null;
		try {
			nameScan = new Scanner(new File("midterms.txt"));
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}

		while (nameScan.hasNextInt()) {
			int score = nameScan.nextInt();
			counts[score]++;
		}

		for (int i = 0; i < counts.length; i++) {
			if (counts[i] > 0) {
				println(i + ": ");
				for (int j = 0; j < counts[i]; j++) {
					println("*");
				}
				println();
			}
		}
	}
}
