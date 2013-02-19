/**
 * 
 */

import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;

class RectangleTest extends JFrame{

	public static void main(String[] args) {
		RectangleTest rec = new RectangleTest("Rectangle Test");
	}

	private Rectangle blue;
	private Rectangle white;
	private Rectangle red1;
	private Rectangle red2;
	private Rectangle red3;
	private Rectangle red4;
	private Rectangle red5;
	private Rectangle red6;
	private Rectangle red7;
	private Rectangle red8;
	private Rectangle red9;
	private Rectangle red10;
	private Rectangle red11;
	private Rectangle red12;
	private Rectangle red13;

	private int stripes = 400/13;

	/**
	 * constructor
	 *
	 * @param title - title of the window
	 */
	public RectangleTest(String title) {
		super(title);

		this.setBounds(100, 100, 600, 400);
		white = new Rectangle(0, 0, 600, 400, Color.white);
		blue = new Rectangle(0, 0, 200, 200, Color.blue);

		red1 = new Rectangle(200, 0, 400, stripes, Color.white);
		red2 = new Rectangle(200, stripes, 400, stripes*2, Color.blue);
		this.setVisible(true);
	}

	/**
	 * paint
	 */
	
	public void paint(Graphics g) {
		this.white.draw(g);
		this.blue.draw(g);
	}
}