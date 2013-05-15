public class Euler9 extends EulerBase {

	void run() {
		int a = 0, b = 0, c = 0;
		outer: for (a = 1; a < 1000; a++) {
			for (b = a + 1; b < 1000; b++) {
				c = 1000 - a - b;
				if (a * a + b * b == c * c) {
					break outer;
				}
			}
			
		}
		print(a + "," + b + "," + c);
		print(a*b*c);
	}
	
	public static void main(String[] args) {
		new Euler9().start();
	}

}