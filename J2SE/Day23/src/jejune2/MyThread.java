package jejune2;

public class MyThread extends Thread {
	@Override
	public void run() {
		// 自己写代码
		// 一般来说，被线程执行的代码肯定是比较耗时的。所以我们用循环改进
		for (int x = 0; x < 200; x++) {
			System.out.println(x);
		}
	}
}
