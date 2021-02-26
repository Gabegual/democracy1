package week2;

import acm.graphics.*; 
import acm.program.GraphicsProgram;
import acm.program.*;
import java.awt.Color;

public class RobotFace extends GraphicsProgram {

	private static final int HEAD_WIDTH = 150 * 2;
	private static final double HEAD_HEIGHT = 200 * 2.4;
	private static final double EYE_RADIUS = 20 * 3;
	private static final int MOUTH_WIDTH = 232;
	private static final int MOUTH_HEIGHT = 50;

	public void run() {

		/* This is the head portion */
		GRect RHead = new GRect(x + 600, y + 200, HEAD_WIDTH, HEAD_HEIGHT);
			RHead.setColor(Color.DARK_GRAY);
			RHead.setFillColor(Color.DARK_GRAY);
			RHead.setFilled(true);
			add(RHead);

		/* This is the eyes */
		GOval RIGHTEYE = new GOval(x + 630, y + 240, EYE_RADIUS, EYE_RADIUS);
		GOval LEFTEYE = new GOval(x + 800, y + 240, EYE_RADIUS, EYE_RADIUS);
			RIGHTEYE.setFilled(true);
			LEFTEYE.setFilled(true);
			RIGHTEYE.setFillColor(Color.YELLOW);
			LEFTEYE.setFillColor(Color.YELLOW);
			add(RIGHTEYE);
			add(LEFTEYE);

		/* This is the mouth */
		GRect Mouth = new GRect(x + 630, y + 450, MOUTH_WIDTH, MOUTH_HEIGHT);
			Mouth.setColor(Color.white);
			Mouth.setFillColor(Color.white);
			Mouth.setFilled(true);
			add(Mouth);
	

	}

	public double x = getWidth();
	public double y = getHeight();

}
