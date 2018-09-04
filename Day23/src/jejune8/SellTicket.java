package jejune8;

public class SellTicket implements Runnable {

	// 定义100张票
	private static int ticket = 100;

	// 定义同一把锁
	private Object obj = new Object();
	private Demo d = new Demo();

	private int x = 0;

	@Override
	public void run() {
		while (true) {
			if (x % 2 == 0) {
				/*
				* 关键字 synchronized可以保证在同一个时刻，只有一个线程可以执行某个方法或者某个代码块(主要是对方法或者代码块中存在共享数据的操作)，
				* 同时我们还应该注意到synchronized另外一个重要的作用，
				* synchronized可保证一个线程的变化(主要是共享数据的变化)被其他线程所看到（保证可见性，完全可以替代Volatile功能）
				* */
				synchronized (SellTicket.class) {
					if (ticket > 0) {
						try {
							Thread.sleep(100);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println(Thread.currentThread().getName()
								+ "正在获取第" + (ticket--) + "張票");
					}
				}
			} else {
				sellTicket();
			}
			x++;
		}
	}

	private static synchronized void sellTicket() {
		if (ticket > 0) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "正在获取第"
					+ (ticket--) + "張票");
		}
	}
}

class Demo {
}
