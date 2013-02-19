import java.awt.Graphics;


class Flag {
	
	private int a, b, h, w;

	public Flag(int a, int b, int h, int w) {
		this.a = a;
		this.b = b;
		this.h = h;
		this.w = w;
		createBoxes();
	}

	public void draw(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(a, b, h, w);
		g.setColor()
	}

	public void createBoxes() {
		int stripes = h/13;
		Rectangle white = new Rectangle(a, b, h, w);
		Rectangle[] red = new Rectangle[7];
		for(int i = 0, i<7, i++) {
			red[i] = new Rectangle(a, stripes*i, stripes, w);
		}
	}

}