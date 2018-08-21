package jejune4;

public class ThreadSleepDemo {
	public static void main(String[] args) {
		ThreadSleep ts1 = new ThreadSleep();
		ThreadSleep ts2 = new ThreadSleep();
		ThreadSleep ts3 = new ThreadSleep();

		ts1.setName("茅敏敏");
		ts2.setName("毛毛毛");
		ts3.setName("毛啊毛");

		ts1.start();
		ts2.start();
		ts3.start();
	}
}
/*
G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7537 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\J2SE\Day23\out\production\Day23;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain jejune4.ThreadSleepDemo
茅敏敏:,日期Wed Aug 22 01:31:21 CST 2018
毛啊毛:,日期Wed Aug 22 01:31:21 CST 2018
毛毛毛:,日期Wed Aug 22 01:31:21 CST 2018
茅敏敏:,日期Wed Aug 22 01:31:23 CST 2018
毛啊毛:,日期Wed Aug 22 01:31:23 CST 2018
毛毛毛:,日期Wed Aug 22 01:31:23 CST 2018
茅敏敏:,日期Wed Aug 22 01:31:24 CST 2018
毛啊毛:,日期Wed Aug 22 01:31:24 CST 2018
毛毛毛:,日期Wed Aug 22 01:31:24 CST 2018
茅敏敏:,日期Wed Aug 22 01:31:25 CST 2018
毛毛毛:,日期Wed Aug 22 01:31:25 CST 2018
毛啊毛:,日期Wed Aug 22 01:31:25 CST 2018
茅敏敏:,日期Wed Aug 22 01:31:26 CST 2018
毛毛毛:,日期Wed Aug 22 01:31:26 CST 2018
毛啊毛:,日期Wed Aug 22 01:31:26 CST 2018
茅敏敏:,日期Wed Aug 22 01:31:27 CST 2018
毛啊毛:,日期Wed Aug 22 01:31:27 CST 2018
毛毛毛:,日期Wed Aug 22 01:31:27 CST 2018
茅敏敏:,日期Wed Aug 22 01:31:28 CST 2018
毛啊毛:,日期Wed Aug 22 01:31:28 CST 2018
毛毛毛:,日期Wed Aug 22 01:31:28 CST 2018
茅敏敏:,日期Wed Aug 22 01:31:29 CST 2018
毛毛毛:,日期Wed Aug 22 01:31:29 CST 2018
毛啊毛:,日期Wed Aug 22 01:31:29 CST 2018

Process finished with exit code -1

 */