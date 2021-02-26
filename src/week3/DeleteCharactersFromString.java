package week3;

import acm.program.ConsoleProgram;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class DeleteCharactersFromString extends ConsoleProgram {

	public static String removeAllOccurrences(String input, String toRemove) {
		String str = input.replaceAll(toRemove, " ");
		return str;
	}

	public void run() {

		println(removeAllOccurrences("How many shrimps do you have to eat" + " Before you make your skin turn pink"
				+ " Eat too much and you'll get sick" + " Shrimps are pretty rich", "h"));

	}

}
