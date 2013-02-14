/**
 * Test
 *
 * 		Creates and test the Point class
 */

class Test {

	public static void main(String[] args) {
		GraphicsPoint p = new GraphicsPoint(3, 6);

		p.moveTo(5, 10);

		System.out.println(p.getX());
	}

}