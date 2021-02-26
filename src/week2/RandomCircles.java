package week2;

import acm.program.GraphicsProgram;
import acm.util.*;

import java.awt.Color;

import acm.graphics.*;
import acm.program.*;

public class RandomCircles extends GraphicsProgram {
	/* Private instance variable */
	private RandomGenerator rgen = RandomGenerator.getInstance();

	public void run() {

		for (int i = 0; i < 10; i++) {
			/* Constants */
			int size = rgen.nextInt(5, 50);
			int x = rgen.nextInt(0, getWidth());
			int y = rgen.nextInt(0, getHeight());

			/* Making the Circles */
			GOval Circ = new GOval(x*4, y*4, size, size);
			Circ.setFilled(true);
			Circ.setFillColor(rgen.nextColor());
			Circ.setColor(rgen.nextColor());
			add(Circ);

		}

	}

}
