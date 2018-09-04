package jejune9;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {

	private int number;

	public MyCallable(int number) {
		this.number = number;
	}

	@Override
	public Integer call() throws Exception {
		int sum = 0;
		for (int x = 1; x < 0; x++) {
			sum += x;
		}
		return sum;
	}

}
