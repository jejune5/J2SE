package jejune7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * 线程池的好处：线程池里的每一个线程代码结束后，并不会死亡，而是再次回到线程池中成为空闲状态，等待下一个对象来使用。
 * 
 * 如何实现线程的代码呢?
 * 		A:创建一个线程池对象，控制要创建几个线程对象。
 * 			public static ExecutorService newFixedThreadPool(int nThreads)
 * 		B:这种线程池的线程可以执行：
 * 			可以执行Runnable对象或者Callable对象代表的线程
 * 			做一个类实现Runnable接口。
 * 		C:调用如下方法即可
 * 			Future<?> submit(Runnable task)
 *			<T> Future<T> submit(Callable<T> task)
 *		D:我就要结束，可以吗?
 *			可以。
 */
public class ExecutorsDemo {
	public static void main(String[] args) {
		// 创建一个线程池对象，控制要创建几个线程对象。
		// public static ExecutorService newFixedThreadPool(int nThreads)
		ExecutorService pool = Executors.newFixedThreadPool(2);

		// 可以执行Runnable对象或者Callable对象代表的线程
		pool.submit(new MyRunnable());
		pool.submit(new MyRunnable());

		// 结束线程池
		pool.shutdown();
	}
}

/*
G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7535 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\J2SE\Day24\out\production\day24_Thread;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain jejune7.ExecutorsDemo
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-1
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2
pool-1-thread-2

Process finished with exit code 0

 */