/**
 * 
 */

import java.awt.Graphics;
import java.awt.Color;

class Rectangle {
	
	private int a, b, c, d;
	private Color color;

	public Rectangle(int a, int b, int h, int w, Color color) {
		this.a = a;
		this.b = b;
		this.c = h;
		this.d = w;
		this.color = color;
	}

	/**
	 * Setters and Getters
	 */

	public void draw(Graphics g) {
		g.setColor(color);
		g.fillRect(a, b, c, d);
	}
}