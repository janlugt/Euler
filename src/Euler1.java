public class Euler1 extends EulerBase {

	void run() {
		int sum = 0;
		for (int i = 3; i < 1000; i += 3) {
			sum += i;
		}
		for (int i = 5; i < 1000; i += 5) {
			if (i % 3 != 0) {
				sum += i;
			}
		}
		print(sum);
	}
	
	public static void main(String[] args) {
		new Euler1().start();
	}

}