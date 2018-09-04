package jejune5;

/* 问题3:虽然数据安全了，但是呢，一次一大片不好看，我就想依次的一次一个输出。
 * 如何实现呢?
 * 		通过Java提供的等待唤醒机制解决。
 * 
 * 等待唤醒：
 * 		Object类中提供了三个方法：
 * 			wait():等待
 * 			notify():唤醒单个线程
 * 			notifyAll():唤醒所有线程
 * 		为什么这些方法不定义在Thread类中呢?
 * 			这些方法的调用必须通过锁对象调用，而我们刚才使用的锁对象是任意锁对象。
 * 			所以，这些方法必须定义在Object类中。
 */
public class StudentDemo {
	public static void main(String[] args) {

		// 创建资源
		Student s = new Student();

		// 设置和获取的类
		SetThread st = new SetThread(s);
		GetThread gt = new GetThread(s);

		// 线程类
		Thread t1 = new Thread(st);
		Thread t2 = new Thread(gt);

		// 启动线程
		t1.start();
		t2.start();
	}
}
