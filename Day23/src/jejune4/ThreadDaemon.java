package jejune4;

public class ThreadDaemon extends Thread {
	@Override
	public void run() {
		for (int x = 0; x < 5; x++) {
			System.out.println(getName() + ":" + x);
		}
	}
}
