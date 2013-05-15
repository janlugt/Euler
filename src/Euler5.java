public class Euler5 extends EulerBase {

	void run() {
		long square_of_sums = 0;
		for (int i = 1; i <= 100; i++) {
			square_of_sums += i;
		}
		square_of_sums *= square_of_sums;
		long sum_of_squares = 0;
		for (int i = 1; i <= 100; i++) {
			sum_of_squares += i * i;
		}
		print(square_of_sums);
		print(sum_of_squares);
		print(square_of_sums - sum_of_squares);
	}

	
	public static void main(String[] args) {
		new Euler5().start();
	}
}