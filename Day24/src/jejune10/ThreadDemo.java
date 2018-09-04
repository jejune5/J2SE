package jejune10;

/*
 * �����ڲ���ĸ�ʽ��
 * 		new �������߽ӿ���() {
 * 			��д����;
 * 		};
 * 		���ʣ��Ǹ�����߽ӿڵ��������
 */
public class ThreadDemo {
	public static void main(String[] args) {
		// �̳�Thread����ʵ�ֶ��߳�
		new Thread() {
			public void run() {
				for (int x = 0; x < 100; x++) {
					System.out.println(Thread.currentThread().getName() + "---"
							+ x);
				}
			}
		}.start();

		// ʵ��Runnable�ӿ���ʵ�ֶ��߳�
		new Thread(new Runnable() {
			public void run() {
				for (int x = 0; x < 100; x++) {
					System.out.println(Thread.currentThread().getName() + "---"
							+ x);
				}
			}
		}) {
		}.start();

		// �����Ѷȵ�
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int x = 0; x < 100; x++) {
					System.out.println("world" + ":" + x);
				}
			}
		}) {
			@Override
			public void run() {
				for (int x = 0; x < 100; x++) {
					System.out.println("world" + ":" + x);
				}
			}
		}.start();
	}
}
