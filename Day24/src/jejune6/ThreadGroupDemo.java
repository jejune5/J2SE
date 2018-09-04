package jejune6;

/*
 * 线程组： 把多个线程组合到一起。
 * 它可以对一批线程进行分类管理，Java允许程序直接对线程组进行控制。
 */
public class ThreadGroupDemo {
	public static void main(String[] args) {
		method1();

		// 我们如何修改线程所在的组呢?
		// 创建一个线程组
		// 创建其他线程的时候，把其他线程的组指定为我们自己新建线程组
		method2();
	}

	private static void method1() {
		MyRunnable my = new MyRunnable();
		Thread t1 = new Thread(my, "茅敏敏");
		Thread t2 = new Thread(my, "徐涛");
		// 我不知道他们属于那个线程组,我想知道，怎么办
		// 线程类里面的方法：public final ThreadGroup getThreadGroup()
		ThreadGroup tg1 = t1.getThreadGroup();
		ThreadGroup tg2 = t2.getThreadGroup();
		// 线程组里面的方法：public final String getName()
		String name1 = tg1.getName();
		String name2 = tg2.getName();
		System.out.println(name1);
		System.out.println(name2);
		// 通过结果我们知道了：线程默认情况下属于main线程组
		// 通过下面的测试，你应该能够看到，默任情况下，所有的线程都属于同一个组
		System.out.println(Thread.currentThread().getName());
	}

	private static void method2() {
		// ThreadGroup(String name)
		ThreadGroup tg = new ThreadGroup("这是一个新的组");

		MyRunnable my = new MyRunnable();

		// // Thread(ThreadGroup group, Runnable target, String name)
		Thread t1 = new Thread(tg, my, "茅敏敏");
		Thread t2 = new Thread(tg, my, "徐涛");

		System.out.println(t1.getThreadGroup().getName());
		System.out.println(t2.getThreadGroup().getName());

		// 通过组名称设置后台线程，表示该组的线程都是后台线程
		tg.setDaemon(true);
	}
}

/*
G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7534 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\J2SE\Day24\out\production\day24_Thread;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain jejune6.ThreadGroupDemo
main
main
main
这是一个新的组
这是一个新的组

Process finished with exit code 0

 */