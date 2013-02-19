/**
 * GraphicsPoint
 *
 * 		a point that is limited to positive integers
 */

class GraphicsPoint {
	
	private int x, y;

	/**
	 * Constructor
	 *
	 * @param x - x coordinate of point
	 * @param y - y coordinate of point
	 */
	public GraphicsPoint(int x, int y) {
		moveTo(x, y);
	}

	/**
	 * Getters and Setters
	 */
	
	/**
	 * limit x to positive integers
	 */
	public void setX(int x) {
		if (x >= 0) {
			this.x = x;
		}
	}

	public int getX(){
		return this.x;
	}

	public void setY(int y) {
		if (y >= 0) {
			this.y = y;
		}
	}

	public int getY(){
		return this.y;
	}

	// methods
	
	public void moveTo(int x, int y) {
		setX(x);
		setY(y);
	}

}