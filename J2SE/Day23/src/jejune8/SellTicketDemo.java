package jejune8;

/*
 * A:同步代码块的锁对象是谁呢?
 * 		任意对象。
 * 
 * B:同步方法的格式及锁对象问题?
 * 		把同步关键字加在方法上。
 * 
 * 		同步方法是谁呢?
 * 			this
 * 
 * C:静态方法及锁对象问题?
 * 		静态方法的锁对象是谁呢?
 * 			类的字节码文件对象。(反射会讲)
 */
public class SellTicketDemo {
	public static void main(String[] args) {
		// 创建资源对象
		SellTicket st = new SellTicket();

		// 创建三个线程
		Thread t1 = new Thread(st, "窗口1");
		Thread t2 = new Thread(st, "窗口2");
		Thread t3 = new Thread(st, "窗口3");

		// 启动线程
		t1.start();
		t2.start();
		t3.start();
	}
}
/*
G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7543 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\J2SE\Day23\out\production\Day23;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain jejune8.SellTicketDemo
窗口1正在获取第100張票
窗口3正在获取第99張票
窗口2正在获取第98張票
窗口2正在获取第97張票
窗口2正在获取第96張票
窗口2正在获取第95張票
窗口2正在获取第94張票
窗口2正在获取第93張票
窗口2正在获取第92張票
窗口2正在获取第91張票
窗口2正在获取第90張票
窗口3正在获取第89張票
窗口1正在获取第88張票
窗口3正在获取第87張票
窗口2正在获取第86張票
窗口2正在获取第85張票
窗口2正在获取第84張票
窗口2正在获取第83張票
窗口2正在获取第82張票
窗口2正在获取第81張票
窗口3正在获取第80張票
窗口3正在获取第79張票
窗口1正在获取第78張票
窗口1正在获取第77張票
窗口1正在获取第76張票
窗口1正在获取第75張票
窗口1正在获取第74張票
窗口1正在获取第73張票
窗口1正在获取第72張票
窗口1正在获取第71張票
窗口3正在获取第70張票
窗口3正在获取第69張票
窗口3正在获取第68張票
窗口3正在获取第67張票
窗口3正在获取第66張票
窗口3正在获取第65張票
窗口3正在获取第64張票
窗口3正在获取第63張票
窗口3正在获取第62張票
窗口3正在获取第61張票
窗口3正在获取第60張票
窗口3正在获取第59張票
窗口3正在获取第58張票
窗口3正在获取第57張票
窗口3正在获取第56張票
窗口3正在获取第55張票
窗口2正在获取第54張票
窗口2正在获取第53張票
窗口2正在获取第52張票
窗口2正在获取第51張票
窗口3正在获取第50張票
窗口3正在获取第49張票
窗口1正在获取第48張票
窗口1正在获取第47張票
窗口1正在获取第46張票
窗口1正在获取第45張票
窗口3正在获取第44張票
窗口3正在获取第43張票
窗口2正在获取第42張票
窗口2正在获取第41張票
窗口2正在获取第40張票
窗口2正在获取第39張票

Process finished with exit code -1

 */