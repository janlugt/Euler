public class Euler13 extends EulerBase {

	int numDivisors(int number) {
		int result = 0;
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				result++;
			}
		}
		return result;
	}
	
	void run() {
		int index = 0;
		int number = 0;
		while (numDivisors(number) < 500) {
			index++;
			number += index;
		}
		print(number);
	}
	
	public static void main(String[] args) {
		new Euler13().start();
	}

}