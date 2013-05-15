import java.util.HashMap;

public class Test extends EulerBase {

	enum TEST { A, B ;
	int getValue() {
		return ordinal();
	}
	}
	
	void run() {
		HashMap<Integer, Object> map = new HashMap<Integer, Object>();
		map.put(1, TEST.B.getValue());
		TEST a = (TEST) map.get(1);
	}
	
	public static void main(String[] args) {
		new Test().start();
	}

}