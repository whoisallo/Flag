/**
 * Line
 *
 * 		a line that is to graphics points
 */

import java.awt.Graphics;

class Line {

	private GraphicsPoint a, b;

	public Line(int x0, int y0, int x1, int y1) {
		this(new GraphicsPoint(x0, y0), new GraphicsPoint(x1, y1));
	}

	public Line(GraphicsPoint a, GraphicsPoint b) {
		this.a = a;
		this.b = b;
	}

	/**
	 * Setters and Getters
	 */
	
	public void setA(GraphicsPoint a) {
		this.a = a;
	}
 
	public void setA(int x, int y) {
		setA(new GraphicsPoint(x, y));
	}

	public GraphicsPoint getA() {
		return a;
	}

	public GraphicsPoint getB() {
		return b;
	}

	public void draw(Graphics g) {
		g.drawLine(a.getX(), a.getY(), b.getX(), b.getY());
	}

}