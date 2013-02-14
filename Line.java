/**
 * Line
 *
 * 		a line that is to graphics points
 */

import java.awt.Graphics;


class Line extends JFrame{

	private GraphicsPoint a, b;

	public Line(int x0, int y0, int x1, int y1) {
		p0 = new GraphicsPoint(x0, y0);
		p1 = new GraphicsPoint(x1, y1);
		this.(p0, p1);
	}

	public Line(GraphicsPoint a, GraphicsPoint b) {
		this.a = a;
		this.b = b;
	}

	public void Paint(Graphics g) {
		g.drawLine(p0.getX(),p0.getY(),p1.getX(),p1.getY());
	}

	/**
	 * Setters and Getters
	 */
	
	public void setA(GraphicsPoint a) {
		this.a = a;
	}

	public void SetA(int x, int y) {
		setA(new GraphicsPoint(x, y));
	}

	public GraphicsPoint getA() {
		return a;
	}

	public void draw(Graphics g) {
		g.drawLine(a.getX(), a.getY(), b.getX(), b.getY());
	}

}