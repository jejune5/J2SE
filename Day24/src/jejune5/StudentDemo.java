package jejune5;

/* ����3:��Ȼ���ݰ�ȫ�ˣ������أ�һ��һ��Ƭ���ÿ����Ҿ������ε�һ��һ�������
 * ���ʵ����?
 * 		ͨ��Java�ṩ�ĵȴ����ѻ��ƽ����
 * 
 * �ȴ����ѣ�
 * 		Object�����ṩ������������
 * 			wait():�ȴ�
 * 			notify():���ѵ����߳�
 * 			notifyAll():���������߳�
 * 		Ϊʲô��Щ������������Thread������?
 * 			��Щ�����ĵ��ñ���ͨ����������ã������Ǹղ�ʹ�õ�������������������
 * 			���ԣ���Щ�������붨����Object���С�
 */
public class StudentDemo {
	public static void main(String[] args) {

		// ������Դ
		Student s = new Student();

		// ���úͻ�ȡ����
		SetThread st = new SetThread(s);
		GetThread gt = new GetThread(s);

		// �߳���
		Thread t1 = new Thread(st);
		Thread t2 = new Thread(gt);

		// �����߳�
		t1.start();
		t2.start();
	}
}

/*
G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7533 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\J2SE\Day24\out\production\day24_Thread;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain jejune5.StudentDemo
é����---16
����---25
é����---16
����---25
é����---16
����---25
é����---16
 */