package week2;
import acm.program.*;
import java.awt.Event;
import java.awt.event.MouseEvent;
import acm.graphics.*;
public class DrawingLines extends GraphicsProgram {
	public void run() { addMouseListeners();
	}/*this starts the line*/
	GLine StartLine;
	public void mousePressed(MouseEvent e) {
		StartLine = new GLine(e.getX(), e.getY(), e.getX(), e.getY());
		add(StartLine);
	}/*this drags the line and finds the end points*/
	public void mouseDragged(MouseEvent e) {
		StartLine.setEndPoint(e.getX(), e.getY());
	}
}
