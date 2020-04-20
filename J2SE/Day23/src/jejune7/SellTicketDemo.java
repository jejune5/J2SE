package jejune7;

/*
 * 如何解决线程安全问题呢?
 * 
 * 要想解决问题，就要知道哪些原因会导致出问题:(而且这些原因也是以后我们判断一个程序是否会有线程安全问题的标准)
 * A:是否是多线程环境
 * B:是否有共享数据
 * C:是否有多条语句操作共享数据
 * 
 * 我们来回想一下我们的程序有没有上面的问题呢?
 * A:是否是多线程环境	是
 * B:是否有共享数据	是
 * C:是否有多条语句操作共享数据	是
 * 
 * 由此可见我们的程序出现问题是正常的，因为它满足出问题的条件。
 * 接下来才是我们要想想如何解决问题呢?
 * A和B的问题我们改变不了，我们只能想办法去把C改变一下。
 * 思想：
 * 		把多条语句操作共享数据的代码给包成一个整体，让某个线程在执行的时候，别人不能来执行。
 * 问题是我们不知道怎么包啊?其实我也不知道，但是Java给我们提供了：同步机制。
 * 
 * 同步代码块：
 * 		synchronized(对象){
 * 			需要同步的代码;
 * 		}
 * 
 * 		A:对象是什么呢?
 * 			我们可以随便创建一个对象试试。
 * 		B:需要同步的代码是哪些呢?
 * 			把多条语句操作共享数据的代码的部分给包起来
 * 
 * 		注意：
 * 			同步可以解决安全问题的根本原因就在那个对象上。该对象如同锁的功能。
 * 			多个线程必须是同一把锁。
 */
public class SellTicketDemo {
	public static void main(String[] args) {
		// 创建资源对象
		SellTicket st = new SellTicket();

		Thread t1 = new Thread(st, "窗口1");
		Thread t2 = new Thread(st, "窗口2");
		Thread t3 = new Thread(st, "窗口3");

		// 启动进程
		t1.start();
		t2.start();
		t3.start();

	}
}
/*
G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7542 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\J2SE\Day23\out\production\Day23;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain jejune7.SellTicketDemo
窗口3正在出售第100张票
窗口3正在出售第99张票
窗口3正在出售第98张票
窗口3正在出售第97张票
窗口3正在出售第96张票
窗口3正在出售第95张票
窗口3正在出售第94张票
窗口3正在出售第93张票
窗口3正在出售第92张票
窗口3正在出售第91张票
窗口3正在出售第90张票
窗口3正在出售第89张票
窗口3正在出售第88张票
窗口3正在出售第87张票
窗口3正在出售第86张票
窗口3正在出售第85张票
窗口3正在出售第84张票
窗口3正在出售第83张票
窗口3正在出售第82张票
窗口3正在出售第81张票
窗口3正在出售第80张票
窗口3正在出售第79张票
窗口3正在出售第78张票
窗口3正在出售第77张票
窗口3正在出售第76张票
窗口3正在出售第75张票
窗口3正在出售第74张票
窗口3正在出售第73张票
窗口3正在出售第72张票
窗口3正在出售第71张票
窗口3正在出售第70张票
窗口3正在出售第69张票
窗口3正在出售第68张票
窗口3正在出售第67张票
窗口3正在出售第66张票
窗口3正在出售第65张票
窗口3正在出售第64张票
窗口3正在出售第63张票
窗口3正在出售第62张票
窗口3正在出售第61张票
窗口3正在出售第60张票
窗口3正在出售第59张票
窗口3正在出售第58张票
窗口3正在出售第57张票
窗口3正在出售第56张票
窗口3正在出售第55张票
窗口3正在出售第54张票
窗口3正在出售第53张票
窗口3正在出售第52张票
窗口3正在出售第51张票
窗口3正在出售第50张票
窗口3正在出售第49张票
窗口3正在出售第48张票
窗口3正在出售第47张票
窗口3正在出售第46张票
窗口3正在出售第45张票
窗口3正在出售第44张票
窗口3正在出售第43张票
窗口3正在出售第42张票
窗口3正在出售第41张票
窗口3正在出售第40张票
窗口3正在出售第39张票
窗口3正在出售第38张票
窗口3正在出售第37张票
窗口3正在出售第36张票
窗口3正在出售第35张票
窗口3正在出售第34张票
窗口3正在出售第33张票
窗口3正在出售第32张票
窗口3正在出售第31张票
窗口3正在出售第30张票
窗口3正在出售第29张票
窗口3正在出售第28张票
窗口3正在出售第27张票
窗口3正在出售第26张票
窗口3正在出售第25张票
窗口3正在出售第24张票
窗口3正在出售第23张票
窗口3正在出售第22张票
窗口3正在出售第21张票
窗口3正在出售第20张票
窗口3正在出售第19张票
窗口3正在出售第18张票
窗口3正在出售第17张票
窗口3正在出售第16张票
窗口3正在出售第15张票
窗口3正在出售第14张票
窗口3正在出售第13张票
窗口3正在出售第12张票
窗口3正在出售第11张票
窗口3正在出售第10张票
窗口3正在出售第9张票
窗口3正在出售第8张票
窗口3正在出售第7张票
窗口3正在出售第6张票
窗口3正在出售第5张票
窗口3正在出售第4张票
窗口3正在出售第3张票
窗口3正在出售第2张票
窗口3正在出售第1张票

 */
