public class Euler6 extends EulerBase {

	void run() {
		print (
			1 *
//			2 *
				3 *
				(2 * 2) *
				5 *
				(2 * 3) *
				7 *
//			(2 * 2 * 2) *
//			(3 * 3) *
//			(2 * 2 * 5) *
			1
		);
		print (
			1 *
				2 *
//			3 *
//			(2 * 2) *
				5 *
//			(2 * 3) *
				7 *
				(2 * 2 * 2) *
				(3 * 3) *
//			(2 * 5) *
				11 *
//			(2 * 2 * 3) *
				13 *
//			(2 * 7) *
//			(3 * 5) *
//			(2 * 2 * 2 * 2) *
				17 *
//			(2 * 3 * 3) *
				19 *
//			(2 * 2 * 5) *
			1
		);
	}
	
	public static void main(String[] args) {
		new Euler6().start();
	}

}