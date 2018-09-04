package jejune7;

public class SellTicket implements Runnable {
	// 定义100张票
	private int tickets = 100;
	
	private Object obj = new Object();

	@Override
	public void run() {
		while (true) {
			//省略其他耗时操作....
			//使用同步代码块对变量i进行同步操作,锁对象为instance
			synchronized (obj) {
				if (tickets > 0) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()
							+ "正在出售第" + (tickets--) + "张票");
				}
			}
		}
	}
}
