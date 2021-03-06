package week4;

import java.util.Scanner;
import acm.program.ConsoleProgram;
import java.util.*;

public class NameCounts extends ConsoleProgram {
	
	public void run() {
		Scanner names = new Scanner(System.in);
		HashMap<String, Integer> nameCounts = new HashMap<String, Integer>();
		
		while(true) {
			String a = readLine("Input Name: ");
			if(a.equals("")) {
				break;
			}else if(!nameCounts.containsKey(a)) {
				nameCounts.put(a, 1);
			}else {
				if(nameCounts.containsKey(a)) {
					Integer j = new Integer(nameCounts.get(a));
					j++;
					nameCounts.remove(a);
					nameCounts.put(a, j);
				}
			}
		}
		println();
		println("Names and Values: ");
		for(String w : nameCounts.keySet()) {
			println(w + ", "+nameCounts.get(w));
		}
	}
	
}
