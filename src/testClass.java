import acm.graphics.GObject;
import acm.program.*;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class testClass extends ConsoleProgram{
	public boolean isNameQ() {
		String name = readLine("Enter name: ");
		return (name == "Q");
	}

	public boolean isNameq() {
		String name1 = readLine("Enter name: ");
		System.out.println(name1);
		char ch = name1.charAt(0);
		return ((ch == 'Q') && (name1.length() == 1));
	}

}