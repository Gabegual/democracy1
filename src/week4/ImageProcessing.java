package week4;
import acm.graphics.*;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;
import acm.graphics.*;

public class ImageProcessing extends GraphicsProgram{
	
	private static final int x = 100;
	private static final int y = 100;
	
	public void run() {
		GImage doge = new GImage("doge.gif");
		add(flipHorizontal(doge), x , y);
	}
	
	private GImage flipHorizontal(GImage image) {
		int[][] array = image.getPixelArray();
		int width = array[0].length;
		
		for(int i = 0; i < array.length; i++) {
			for(int p1 = 0; p1 < width /2; p1++){
				int p2 = width - p1 - 1;
				int temp = array[i][p1];
				array[i][p1] = array[i][p2];
				array[i][p2] = temp;
			}
		}
		return new GImage(array);
	}
}