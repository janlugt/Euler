public class Euler4 extends EulerBase {

	void run() {
		int max_a = 0, max_b = 0, max = Integer.MIN_VALUE;
		for (int a = 999; a >= 100; a--) {
			for (int b = 999; b >= 100; b--) {
				if (isPalindrome(a * b) && a * b > max) {
					max = a * b;
					max_a = a;
					max_b = b;
				}
			}
		}
		print(max_a);
		print(max_b);
		print(max);
	}

	static boolean isPalindrome(int number) {
		char[] s = Integer.toString(number).toCharArray();
		for (int i = 0; i <= s.length / 2; i++) {
			if (s[i] != s[s.length - i - 1]) {
				return false;
			}
		}
		return true;
	}

	static int pal_aux(int number, int r) {
		return number == 0 ? r : pal_aux(number / 10, r * 10 + number % 10);
	}

	static boolean is_pal(int number) {
		return pal_aux(number, 0) == number;
	}
	
	public static void main(String[] args) {
		new Euler4().start();
	}

}