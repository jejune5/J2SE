package jejune8;

/*
 * A:ͬ����������������˭��?
 * 		�������
 * 
 * B:ͬ�������ĸ�ʽ������������?
 * 		��ͬ���ؼ��ּ��ڷ����ϡ�
 * 
 * 		ͬ��������˭��?
 * 			this
 * 
 * C:��̬����������������?
 * 		��̬��������������˭��?
 * 			����ֽ����ļ�����(����ὲ)
 */
public class SellTicketDemo {
	public static void main(String[] args) {
		// ������Դ����
		SellTicket st = new SellTicket();

		// ���������߳�
		Thread t1 = new Thread(st, "����1");
		Thread t2 = new Thread(st, "����2");
		Thread t3 = new Thread(st, "����3");

		// �����߳�
		t1.start();
		t2.start();
		t3.start();
	}
}
/*
G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7543 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\J2SE\Day23\out\production\Day23;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain jejune8.SellTicketDemo
����1���ڻ�ȡ��100��Ʊ
����3���ڻ�ȡ��99��Ʊ
����2���ڻ�ȡ��98��Ʊ
����2���ڻ�ȡ��97��Ʊ
����2���ڻ�ȡ��96��Ʊ
����2���ڻ�ȡ��95��Ʊ
����2���ڻ�ȡ��94��Ʊ
����2���ڻ�ȡ��93��Ʊ
����2���ڻ�ȡ��92��Ʊ
����2���ڻ�ȡ��91��Ʊ
����2���ڻ�ȡ��90��Ʊ
����3���ڻ�ȡ��89��Ʊ
����1���ڻ�ȡ��88��Ʊ
����3���ڻ�ȡ��87��Ʊ
����2���ڻ�ȡ��86��Ʊ
����2���ڻ�ȡ��85��Ʊ
����2���ڻ�ȡ��84��Ʊ
����2���ڻ�ȡ��83��Ʊ
����2���ڻ�ȡ��82��Ʊ
����2���ڻ�ȡ��81��Ʊ
����3���ڻ�ȡ��80��Ʊ
����3���ڻ�ȡ��79��Ʊ
����1���ڻ�ȡ��78��Ʊ
����1���ڻ�ȡ��77��Ʊ
����1���ڻ�ȡ��76��Ʊ
����1���ڻ�ȡ��75��Ʊ
����1���ڻ�ȡ��74��Ʊ
����1���ڻ�ȡ��73��Ʊ
����1���ڻ�ȡ��72��Ʊ
����1���ڻ�ȡ��71��Ʊ
����3���ڻ�ȡ��70��Ʊ
����3���ڻ�ȡ��69��Ʊ
����3���ڻ�ȡ��68��Ʊ
����3���ڻ�ȡ��67��Ʊ
����3���ڻ�ȡ��66��Ʊ
����3���ڻ�ȡ��65��Ʊ
����3���ڻ�ȡ��64��Ʊ
����3���ڻ�ȡ��63��Ʊ
����3���ڻ�ȡ��62��Ʊ
����3���ڻ�ȡ��61��Ʊ
����3���ڻ�ȡ��60��Ʊ
����3���ڻ�ȡ��59��Ʊ
����3���ڻ�ȡ��58��Ʊ
����3���ڻ�ȡ��57��Ʊ
����3���ڻ�ȡ��56��Ʊ
����3���ڻ�ȡ��55��Ʊ
����2���ڻ�ȡ��54��Ʊ
����2���ڻ�ȡ��53��Ʊ
����2���ڻ�ȡ��52��Ʊ
����2���ڻ�ȡ��51��Ʊ
����3���ڻ�ȡ��50��Ʊ
����3���ڻ�ȡ��49��Ʊ
����1���ڻ�ȡ��48��Ʊ
����1���ڻ�ȡ��47��Ʊ
����1���ڻ�ȡ��46��Ʊ
����1���ڻ�ȡ��45��Ʊ
����3���ڻ�ȡ��44��Ʊ
����3���ڻ�ȡ��43��Ʊ
����2���ڻ�ȡ��42��Ʊ
����2���ڻ�ȡ��41��Ʊ
����2���ڻ�ȡ��40��Ʊ
����2���ڻ�ȡ��39��Ʊ

Process finished with exit code -1

 */