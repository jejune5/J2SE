package jejune7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * �̳߳صĺô����̳߳����ÿһ���̴߳�������󣬲����������������ٴλص��̳߳��г�Ϊ����״̬���ȴ���һ��������ʹ�á�
 * 
 * ���ʵ���̵߳Ĵ�����?
 * 		A:����һ���̳߳ض��󣬿���Ҫ���������̶߳���
 * 			public static ExecutorService newFixedThreadPool(int nThreads)
 * 		B:�����̳߳ص��߳̿���ִ�У�
 * 			����ִ��Runnable�������Callable���������߳�
 * 			��һ����ʵ��Runnable�ӿڡ�
 * 		C:�������·�������
 * 			Future<?> submit(Runnable task)
 *			<T> Future<T> submit(Callable<T> task)
 *		D:�Ҿ�Ҫ������������?
 *			���ԡ�
 */
public class ExecutorsDemo {
	public static void main(String[] args) {
		// ����һ���̳߳ض��󣬿���Ҫ���������̶߳���
		// public static ExecutorService newFixedThreadPool(int nThreads)
		ExecutorService pool = Executors.newFixedThreadPool(2);

		// ����ִ��Runnable�������Callable���������߳�
		pool.submit(new MyRunnable());
		pool.submit(new MyRunnable());

		// �����̳߳�
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