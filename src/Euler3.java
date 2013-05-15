public class Euler3 extends EulerBase {

	void run() {
		final long number = 600851475143l;
		long temp = number;
		long factor = 2;
		while (temp > 1) {
			if (temp % factor == 0) {
				temp /= factor;
				print(factor);
			} else {
				factor++;
			}
		}
	}
	
	public static void main(String[] args) {
		new Euler3().start();
	}

}
