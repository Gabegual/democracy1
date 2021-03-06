package week4;

import java.io.*;
import java.util.*;

import acm.program.ConsoleProgram;

public class WordCount  extends ConsoleProgram{

	public void run() {

		File wordCount = new File("C:\\Users\\Gabe\\Desktop\\wordCount.txt");
		FileInputStream localFile = null;
		try {
			localFile = new FileInputStream(wordCount);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		InputStreamReader input = new InputStreamReader(localFile);
		BufferedReader readFile = new BufferedReader(input);

		String count;

		int countWords = 0;
		int sentenceCount = 0;
		int characterCount = 1;

		try {
			while ((count = readFile.readLine()) != null) {

				characterCount += count.length();

				String[] wordList = count.split("\\s");
				countWords += wordList.length;

				String[] sentenceList = count.split("!?.:s");
				sentenceCount += sentenceList.length;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		println("Words: " + countWords);
		println("Lines: " + sentenceCount);
		println("Chars: " + characterCount);
	}

}
