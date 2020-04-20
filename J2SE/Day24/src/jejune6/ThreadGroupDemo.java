package jejune6;

/*
 * �߳��飺 �Ѷ���߳���ϵ�һ��
 * �����Զ�һ���߳̽��з������Java�������ֱ�Ӷ��߳�����п��ơ�
 */
public class ThreadGroupDemo {
	public static void main(String[] args) {
		method1();

		// ��������޸��߳����ڵ�����?
		// ����һ���߳���
		// ���������̵߳�ʱ�򣬰������̵߳���ָ��Ϊ�����Լ��½��߳���
		method2();
	}

	private static void method1() {
		MyRunnable my = new MyRunnable();
		Thread t1 = new Thread(my, "é����");
		Thread t2 = new Thread(my, "����");
		// �Ҳ�֪�����������Ǹ��߳���,����֪������ô��
		// �߳�������ķ�����public final ThreadGroup getThreadGroup()
		ThreadGroup tg1 = t1.getThreadGroup();
		ThreadGroup tg2 = t2.getThreadGroup();
		// �߳�������ķ�����public final String getName()
		String name1 = tg1.getName();
		String name2 = tg2.getName();
		System.out.println(name1);
		System.out.println(name2);
		// ͨ���������֪���ˣ��߳�Ĭ�����������main�߳���
		// ͨ������Ĳ��ԣ���Ӧ���ܹ�������Ĭ������£����е��̶߳�����ͬһ����
		System.out.println(Thread.currentThread().getName());
	}

	private static void method2() {
		// ThreadGroup(String name)
		ThreadGroup tg = new ThreadGroup("����һ���µ���");

		MyRunnable my = new MyRunnable();

		// // Thread(ThreadGroup group, Runnable target, String name)
		Thread t1 = new Thread(tg, my, "é����");
		Thread t2 = new Thread(tg, my, "����");

		System.out.println(t1.getThreadGroup().getName());
		System.out.println(t2.getThreadGroup().getName());

		// ͨ�����������ú�̨�̣߳���ʾ������̶߳��Ǻ�̨�߳�
		tg.setDaemon(true);
	}
}

/*
G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7534 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\J2SE\Day24\out\production\day24_Thread;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain jejune6.ThreadGroupDemo
main
main
main
����һ���µ���
����һ���µ���

Process finished with exit code 0

 */