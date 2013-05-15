public class Euler2 extends EulerBase {

	void run() {
		int sum = 0, i = 1, j = 1;
		while (i + j <= 4000000) {
			j = j + i;
			i = j - i;
			if (j % 2 == 0) {
				sum += j;
			}
		}
		print(sum);
	}
	
	public static void main(String[] args) {
		new Euler2().start();
	}

}
