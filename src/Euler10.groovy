import java.util.ArrayList;
import java.util.List;

public class Euler10 extends EulerBase {

	final static int MAX_PRIME = 2000000;
	boolean[] isPrime = new boolean[MAX_PRIME + 1];

	void run() {
		for (int i = 2; i <= MAX_PRIME; i++) {
			isPrime[i] = true;
		}
		for (int i = 2; i <= MAX_PRIME; i++) {
			if (isPrime[i]) {
				for (int j = i * 2; j <= MAX_PRIME; j += i) {
					isPrime[j] = false;
				}
			}
		}
		long sum = 0;
		for (int i = 2; i <= MAX_PRIME; i++) {
			if (isPrime[i]) {
				sum += i;
			}
		}
		print(sum);
	}

	void firstAttempt() {
		List<Integer> primes = new ArrayList<Integer>();
		int counter = 2, sum = 0;
		outer: while (counter < 100000) {
			for (int i : primes) {
				if (counter % i == 0) {
					counter++;
					continue outer;
				}
			}
			sum += counter;
			primes.add(counter);
			counter++;
		}
		print(sum);
	}

	public static void main(String[] args) {
		new Euler10().start();
	}

}