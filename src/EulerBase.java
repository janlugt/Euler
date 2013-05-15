abstract public class EulerBase {

	void print(int i) {
		System.out.println(i);
	}

	void print(String s) {
		System.out.println(s);
	}
	
	void print(long l) {
		System.out.println(l);
	}
	
	void start() {
		long start = System.currentTimeMillis();
		run();
		long stop = System.currentTimeMillis();
		print("Execution took " + (stop - start) + " millis");
	}
	
	abstract void run();
	
}
