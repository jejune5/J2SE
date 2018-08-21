package jejune6;

public class SellTicket implements Runnable {
	public int ticket = 100;

	@Override
	public void run() {
		while (true) {
			if (ticket > 0) {
				System.out.println(Thread.currentThread().getName() + "正在出售第"
						+ (ticket--) + "张票");
			}
		}
	}

}
