package jejune8;

public class SellTicket implements Runnable {

	// ����100��Ʊ
	private static int ticket = 100;

	// ����ͬһ����
	private Object obj = new Object();
	private Demo d = new Demo();

	private int x = 0;

	@Override
	public void run() {
		while (true) {
			if (x % 2 == 0) {
				synchronized (SellTicket.class) {
					if (ticket > 0) {
						try {
							Thread.sleep(100);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println(Thread.currentThread().getName()
								+ "���ڻ�ȡ��" + (ticket--) + "��Ʊ");
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
			System.out.println(Thread.currentThread().getName() + "���ڻ�ȡ��"
					+ (ticket--) + "��Ʊ");
		}
	}
}

class Demo {
}
