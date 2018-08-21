package jejune5;

/*
 * 某电影院目前正在上映贺岁大片(红高粱,少林寺传奇,藏经阁)，共有100张票，
 * 而它有3个售票窗口售票，请设计一个程序模拟该电影院售票。
 * 继承Thread类来实现。
 */
public class SellTicketDemo {
	public static void main(String[] args) {
		// 创建三个线程对象
		SellTicket st1 = new SellTicket();
		SellTicket st2 = new SellTicket();
		SellTicket st3 = new SellTicket();

		// 给线程对象取名字
		st1.setName("窗口1");
		st2.setName("窗口2");
		st3.setName("窗口3");

		// 启动线程
		st1.start();
		st2.start();
		st3.start();
	}
}
/*
G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7540 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\J2SE\Day23\out\production\Day23;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain jejune5.SellTicketDemo
窗口1正在出售第100票
窗口1正在出售第99票
窗口1正在出售第98票
窗口1正在出售第97票
窗口1正在出售第96票
窗口1正在出售第95票
窗口1正在出售第94票
窗口1正在出售第93票
窗口1正在出售第92票
窗口1正在出售第91票
窗口1正在出售第90票
窗口1正在出售第89票
窗口1正在出售第88票
窗口1正在出售第87票
窗口1正在出售第86票
窗口1正在出售第85票
窗口1正在出售第84票
窗口1正在出售第83票
窗口1正在出售第82票
窗口1正在出售第81票
窗口1正在出售第80票
窗口1正在出售第79票
窗口1正在出售第78票
窗口1正在出售第77票
窗口1正在出售第76票
窗口1正在出售第75票
窗口1正在出售第74票
窗口1正在出售第73票
窗口1正在出售第72票
窗口1正在出售第71票
窗口1正在出售第70票
窗口1正在出售第69票
窗口1正在出售第68票
窗口1正在出售第67票
窗口1正在出售第66票
窗口1正在出售第65票
窗口1正在出售第64票
窗口1正在出售第63票
窗口1正在出售第62票
窗口1正在出售第61票
窗口1正在出售第60票
窗口1正在出售第59票
窗口1正在出售第58票
窗口1正在出售第57票
窗口1正在出售第56票
窗口1正在出售第55票
窗口1正在出售第54票
窗口1正在出售第53票
窗口1正在出售第52票
窗口1正在出售第51票
窗口1正在出售第50票
窗口1正在出售第49票
窗口1正在出售第48票
窗口1正在出售第47票
窗口1正在出售第46票
窗口1正在出售第45票
窗口1正在出售第44票
窗口1正在出售第43票
窗口1正在出售第42票
窗口1正在出售第41票
窗口1正在出售第40票
窗口1正在出售第39票
窗口1正在出售第38票
窗口1正在出售第37票
窗口1正在出售第36票
窗口1正在出售第35票
窗口1正在出售第34票
窗口1正在出售第33票
窗口1正在出售第32票
窗口1正在出售第31票
窗口1正在出售第30票
窗口1正在出售第29票
窗口1正在出售第28票
窗口1正在出售第27票
窗口1正在出售第26票
窗口1正在出售第25票
窗口1正在出售第24票
窗口1正在出售第23票
窗口1正在出售第22票
窗口1正在出售第21票
窗口1正在出售第20票
窗口1正在出售第19票
窗口1正在出售第18票
窗口1正在出售第17票
窗口1正在出售第16票
窗口1正在出售第15票
窗口1正在出售第14票
窗口1正在出售第13票
窗口1正在出售第12票
窗口1正在出售第11票
窗口1正在出售第10票
窗口1正在出售第9票
窗口1正在出售第8票
窗口1正在出售第7票
窗口1正在出售第6票
窗口1正在出售第5票
窗口1正在出售第4票
窗口1正在出售第3票
窗口1正在出售第2票
窗口1正在出售第1票

 */
