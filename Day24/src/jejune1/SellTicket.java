package jejune1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SellTicket implements Runnable {

	// ����Ʊ
	private int ticket = 0;

	// ����������
	private Lock lock = new ReentrantLock();

	@Override
	public void run() {
		while (true) {
			try {
				// ����
				lock.lock();
				if (ticket > 0) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()
							+ "���ڳ��۵�" + (ticket--) + "��Ʊ");
				}
			} finally {
				lock.unlock();
			}
		}
	}
}
