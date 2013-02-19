/**
 * LineTest
 *
 * 		tests Graphics
 */

import javax.swing.JFrame;
import java.awt.Graphics;

class LineTest extends JFrame {
	
	public static void main(String[] args) {
		LineTest lt = new LineTest("Tester");

	}

	private Line l;

	/**
	 * constructor
	 *
	 * @param title - title of the window
	 */
	public LineTest(String title) {
		super(title);

		this.setBounds(100, 100, 600, 400);
		this.setVisible(true);
		l = new Line(20, 40, 30, 50);
	}

	/**
	 * paint
	 */
	
	public void paint(Graphics g) {
		this.l.draw(g);
	}

}