public class Euler7 extends EulerBase {

	final static int PRIME_INDEX = 100000;

	void run() {
		int[] primes = new int[PRIME_INDEX + 1];
		int primes_found = 0;
		int counter = 1;
		outer: while (primes_found < PRIME_INDEX + 1) {
			for (int i = 1; i < primes_found; i++) {
				if (counter % primes[i] == 0) {
					counter++;
					continue outer;
				}
			}
			primes[primes_found] = counter;
			primes_found++;
			counter++;
		}
		print(primes[PRIME_INDEX]);
		
		//bla();
	}

	void bla() {
		int aantal = 0;

		int testtal = 2;
		int test = 2;
		for (; aantal != 10001; test++) {
			testtal = 2;

			for (; testtal <= test; testtal++) {
				if (test % testtal == 0 && testtal != test) {
					break;
				}

				else if (testtal == test) {
					aantal += 1;
				}

			}

		}
		print(test);
	}
	
	public static void main(String[] args) {
		new Euler7().start();
	}

}