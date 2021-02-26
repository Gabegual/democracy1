package week2;

import acm.program.*;

public class Fibonacci extends ConsoleProgram {

	private int Fib1 = 0;
	private int Fib2 = 1;
	private int Fib3 = Fib1 + Fib2;
	String Waste = "This Program list the fib seq : ";

	public void run() {
		println(Waste);

		while (Fib1 < 10_000) {
			println(Fib1);
			Fib2 = Fib1;
			Fib1 = Fib3;
			Fib3 = Fib1 + Fib2;
		}

	}
}
