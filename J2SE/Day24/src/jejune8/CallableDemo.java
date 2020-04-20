package jejune8;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * 多线程实现的方式3：
 *  	A:创建一个线程池对象，控制要创建几个线程对象。
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
public class CallableDemo {
	public static void main(String[] args) {
		// 创建线程池对象
		ExecutorService pool = Executors.newFixedThreadPool(2);
		// 可以执行Runnable对象或者Callable对象代表的线程
		pool.submit(new MyCallable());
		pool.submit(new MyCallable());
		// 结束
		pool.shutdown();
	}
}

/*
G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7532 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\J2SE\Day24\out\production\day24_Thread;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain jejune8.CallableDemo
pool-1-thread-1:0
pool-1-thread-1:1
pool-1-thread-1:2
pool-1-thread-1:3
pool-1-thread-1:4
pool-1-thread-1:5
pool-1-thread-2:0
pool-1-thread-2:1
pool-1-thread-2:2
pool-1-thread-2:3
pool-1-thread-2:4
pool-1-thread-2:5
pool-1-thread-2:6
pool-1-thread-2:7
pool-1-thread-1:6
pool-1-thread-1:7
pool-1-thread-1:8
pool-1-thread-1:9
pool-1-thread-1:10
pool-1-thread-2:8
pool-1-thread-2:9
pool-1-thread-2:10
pool-1-thread-2:11
pool-1-thread-2:12
pool-1-thread-2:13
pool-1-thread-2:14
pool-1-thread-2:15
pool-1-thread-2:16
pool-1-thread-2:17
pool-1-thread-1:11
pool-1-thread-2:18
pool-1-thread-1:12
pool-1-thread-2:19
pool-1-thread-1:13
pool-1-thread-2:20
pool-1-thread-1:14
pool-1-thread-2:21
pool-1-thread-1:15
pool-1-thread-2:22
pool-1-thread-1:16
pool-1-thread-2:23
pool-1-thread-1:17
pool-1-thread-2:24
pool-1-thread-1:18
pool-1-thread-2:25
pool-1-thread-1:19
pool-1-thread-2:26
pool-1-thread-1:20
pool-1-thread-2:27
pool-1-thread-1:21
pool-1-thread-2:28
pool-1-thread-1:22
pool-1-thread-2:29
pool-1-thread-1:23
pool-1-thread-2:30
pool-1-thread-1:24
pool-1-thread-2:31
pool-1-thread-1:25
pool-1-thread-2:32
pool-1-thread-1:26
pool-1-thread-2:33
pool-1-thread-2:34
pool-1-thread-1:27
pool-1-thread-2:35
pool-1-thread-2:36
pool-1-thread-2:37
pool-1-thread-2:38
pool-1-thread-2:39
pool-1-thread-2:40
pool-1-thread-2:41
pool-1-thread-2:42
pool-1-thread-2:43
pool-1-thread-2:44
pool-1-thread-2:45
pool-1-thread-1:28
pool-1-thread-2:46
pool-1-thread-1:29
pool-1-thread-2:47
pool-1-thread-1:30
pool-1-thread-2:48
pool-1-thread-2:49
pool-1-thread-1:31
pool-1-thread-2:50
pool-1-thread-1:32
pool-1-thread-2:51
pool-1-thread-1:33
pool-1-thread-2:52
pool-1-thread-1:34
pool-1-thread-2:53
pool-1-thread-1:35
pool-1-thread-2:54
pool-1-thread-2:55
pool-1-thread-1:36
pool-1-thread-2:56
pool-1-thread-1:37
pool-1-thread-2:57
pool-1-thread-2:58
pool-1-thread-1:38
pool-1-thread-2:59
pool-1-thread-1:39
pool-1-thread-2:60
pool-1-thread-1:40
pool-1-thread-2:61
pool-1-thread-1:41
pool-1-thread-1:42
pool-1-thread-1:43
pool-1-thread-1:44
pool-1-thread-1:45
pool-1-thread-1:46
pool-1-thread-1:47
pool-1-thread-1:48
pool-1-thread-1:49
pool-1-thread-1:50
pool-1-thread-1:51
pool-1-thread-1:52
pool-1-thread-1:53
pool-1-thread-1:54
pool-1-thread-1:55
pool-1-thread-1:56
pool-1-thread-1:57
pool-1-thread-1:58
pool-1-thread-1:59
pool-1-thread-1:60
pool-1-thread-1:61
pool-1-thread-1:62
pool-1-thread-1:63
pool-1-thread-1:64
pool-1-thread-1:65
pool-1-thread-1:66
pool-1-thread-1:67
pool-1-thread-1:68
pool-1-thread-1:69
pool-1-thread-1:70
pool-1-thread-1:71
pool-1-thread-1:72
pool-1-thread-1:73
pool-1-thread-1:74
pool-1-thread-1:75
pool-1-thread-1:76
pool-1-thread-1:77
pool-1-thread-1:78
pool-1-thread-1:79
pool-1-thread-1:80
pool-1-thread-1:81
pool-1-thread-1:82
pool-1-thread-1:83
pool-1-thread-1:84
pool-1-thread-1:85
pool-1-thread-1:86
pool-1-thread-1:87
pool-1-thread-1:88
pool-1-thread-1:89
pool-1-thread-1:90
pool-1-thread-1:91
pool-1-thread-1:92
pool-1-thread-1:93
pool-1-thread-1:94
pool-1-thread-1:95
pool-1-thread-1:96
pool-1-thread-1:97
pool-1-thread-1:98
pool-1-thread-1:99
pool-1-thread-2:62
pool-1-thread-2:63
pool-1-thread-2:64
pool-1-thread-2:65
pool-1-thread-2:66
pool-1-thread-2:67
pool-1-thread-2:68
pool-1-thread-2:69
pool-1-thread-2:70
pool-1-thread-2:71
pool-1-thread-2:72
pool-1-thread-2:73
pool-1-thread-2:74
pool-1-thread-2:75
pool-1-thread-2:76
pool-1-thread-2:77
pool-1-thread-2:78
pool-1-thread-2:79
pool-1-thread-2:80
pool-1-thread-2:81
pool-1-thread-2:82
pool-1-thread-2:83
pool-1-thread-2:84
pool-1-thread-2:85
pool-1-thread-2:86
pool-1-thread-2:87
pool-1-thread-2:88
pool-1-thread-2:89
pool-1-thread-2:90
pool-1-thread-2:91
pool-1-thread-2:92
pool-1-thread-2:93
pool-1-thread-2:94
pool-1-thread-2:95
pool-1-thread-2:96
pool-1-thread-2:97
pool-1-thread-2:98
pool-1-thread-2:99

Process finished with exit code 0

 */