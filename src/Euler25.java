import java.math.BigInteger;

public class Euler25 extends EulerBase {

	final static int NUM_DIGITS = 1000;
	void run() {
		BigInteger i = BigInteger.valueOf(1), j = BigInteger.valueOf(1);
		BigInteger limit = BigInteger.valueOf(10);
		limit = limit.pow(NUM_DIGITS - 1);
		int counter = 2;
		
		while (j.compareTo(limit) < 0) {
			BigInteger old_j = j;
			j = j.add(i);
			i = old_j;
			counter++;
		}
		
		print(i.add(j).toString());
		print(counter);
	}
	
	public static void main(String[] args) {
		new Euler25().start();
	}

}