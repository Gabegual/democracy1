package week5;

import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.*;
import javax.swing.*;
import javax.swing.JButton;
import acm.graphics.GCompound;
import acm.graphics.GLabel;
import acm.graphics.GObject;
import acm.graphics.GPoint;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import java.util.HashMap;
import java.util.Iterator;

public class BoxDiagram extends GraphicsProgram {

	HashMap<String, GObject> BOX_DIAM = new HashMap<String, GObject>();
	private static final double BOX_WIDTH = 120;
	private static final double BOX_HIGHT = 50;
	
	private JTextField nameBOX;
	private JButton Add;
	private JButton Remove;
	private JButton Clear;
	private JLabel label;
	private GCompound compound;
	private GPoint point;
	private GObject Mouse;

	public void init() {

		nameBOX = new JTextField(25);
		add(new JLabel("Name: "), SOUTH);
		add(nameBOX, SOUTH);
		nameBOX.addActionListener(this);

		add(new JButton("Add"), SOUTH);
		add(new JButton("Remove"), SOUTH);
		add(new JButton("Clear"), SOUTH);
		addActionListeners();
		addMouseListeners();

	}

	public void Add(String name) {
		GCompound Compound = new GCompound();
		GRect BOX = new GRect(BOX_WIDTH, BOX_HIGHT);
		GLabel label = new GLabel(name);
		Compound.add(BOX, -BOX_WIDTH / 2, -BOX_HIGHT / 2);
		Compound.add(label, -label.getWidth() / 2, label.getHeight() / 2);
		add(Compound, getWidth() / 2, getHeight() / 2);
		BOX_DIAM.put(name, Compound);

	}

	private void removeBox(String name) {
		GObject remo = BOX_DIAM.get(name);
		if (remo != null) {
			remove(remo);
		}
	}

	private void Clear() {
		Iterator<String> iterator = BOX_DIAM.keySet().iterator();
		while (iterator.hasNext()) {
			removeBox(iterator.next());
		}
		BOX_DIAM.clear();
	}

	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if(cmd == "Add" || cmd == "nameBOX") {
			Add(nameBOX.getText());
		}else 
			if(cmd == "Remove") {
			removeBox(nameBOX.getText());
		}else 
			if(cmd == "Clear")
			Clear();
		}
	
	
	public void mousePressed(MouseEvent e) {
		point = new GPoint(e.getPoint());
		Mouse = getElementAt(point);
	}
	
	public void mouseDragged(MouseEvent e) {
		if(Mouse != null) {
			Mouse.move(e.getX() - point.getX(), e.getY() - point.getY());
			point = new GPoint(e.getPoint());
		}
	}
	
	public void mouseRelesed(MouseEvent m) {
	
		}
	}

