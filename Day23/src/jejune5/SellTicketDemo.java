package jejune5;

/*
 * ĳ��ӰԺĿǰ������ӳ�����Ƭ(�����,�����´���,�ؾ���)������100��Ʊ��
 * ������3����Ʊ������Ʊ�������һ������ģ��õ�ӰԺ��Ʊ��
 * �̳�Thread����ʵ�֡�
 */
public class SellTicketDemo {
	public static void main(String[] args) {
		// ���������̶߳���
		SellTicket st1 = new SellTicket();
		SellTicket st2 = new SellTicket();
		SellTicket st3 = new SellTicket();

		// ���̶߳���ȡ����
		st1.setName("����1");
		st2.setName("����2");
		st3.setName("����3");

		// �����߳�
		st1.start();
		st2.start();
		st3.start();
	}
}
/*
G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7540 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\J2SE\Day23\out\production\Day23;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain jejune5.SellTicketDemo
����1���ڳ��۵�100Ʊ
����1���ڳ��۵�99Ʊ
����1���ڳ��۵�98Ʊ
����1���ڳ��۵�97Ʊ
����1���ڳ��۵�96Ʊ
����1���ڳ��۵�95Ʊ
����1���ڳ��۵�94Ʊ
����1���ڳ��۵�93Ʊ
����1���ڳ��۵�92Ʊ
����1���ڳ��۵�91Ʊ
����1���ڳ��۵�90Ʊ
����1���ڳ��۵�89Ʊ
����1���ڳ��۵�88Ʊ
����1���ڳ��۵�87Ʊ
����1���ڳ��۵�86Ʊ
����1���ڳ��۵�85Ʊ
����1���ڳ��۵�84Ʊ
����1���ڳ��۵�83Ʊ
����1���ڳ��۵�82Ʊ
����1���ڳ��۵�81Ʊ
����1���ڳ��۵�80Ʊ
����1���ڳ��۵�79Ʊ
����1���ڳ��۵�78Ʊ
����1���ڳ��۵�77Ʊ
����1���ڳ��۵�76Ʊ
����1���ڳ��۵�75Ʊ
����1���ڳ��۵�74Ʊ
����1���ڳ��۵�73Ʊ
����1���ڳ��۵�72Ʊ
����1���ڳ��۵�71Ʊ
����1���ڳ��۵�70Ʊ
����1���ڳ��۵�69Ʊ
����1���ڳ��۵�68Ʊ
����1���ڳ��۵�67Ʊ
����1���ڳ��۵�66Ʊ
����1���ڳ��۵�65Ʊ
����1���ڳ��۵�64Ʊ
����1���ڳ��۵�63Ʊ
����1���ڳ��۵�62Ʊ
����1���ڳ��۵�61Ʊ
����1���ڳ��۵�60Ʊ
����1���ڳ��۵�59Ʊ
����1���ڳ��۵�58Ʊ
����1���ڳ��۵�57Ʊ
����1���ڳ��۵�56Ʊ
����1���ڳ��۵�55Ʊ
����1���ڳ��۵�54Ʊ
����1���ڳ��۵�53Ʊ
����1���ڳ��۵�52Ʊ
����1���ڳ��۵�51Ʊ
����1���ڳ��۵�50Ʊ
����1���ڳ��۵�49Ʊ
����1���ڳ��۵�48Ʊ
����1���ڳ��۵�47Ʊ
����1���ڳ��۵�46Ʊ
����1���ڳ��۵�45Ʊ
����1���ڳ��۵�44Ʊ
����1���ڳ��۵�43Ʊ
����1���ڳ��۵�42Ʊ
����1���ڳ��۵�41Ʊ
����1���ڳ��۵�40Ʊ
����1���ڳ��۵�39Ʊ
����1���ڳ��۵�38Ʊ
����1���ڳ��۵�37Ʊ
����1���ڳ��۵�36Ʊ
����1���ڳ��۵�35Ʊ
����1���ڳ��۵�34Ʊ
����1���ڳ��۵�33Ʊ
����1���ڳ��۵�32Ʊ
����1���ڳ��۵�31Ʊ
����1���ڳ��۵�30Ʊ
����1���ڳ��۵�29Ʊ
����1���ڳ��۵�28Ʊ
����1���ڳ��۵�27Ʊ
����1���ڳ��۵�26Ʊ
����1���ڳ��۵�25Ʊ
����1���ڳ��۵�24Ʊ
����1���ڳ��۵�23Ʊ
����1���ڳ��۵�22Ʊ
����1���ڳ��۵�21Ʊ
����1���ڳ��۵�20Ʊ
����1���ڳ��۵�19Ʊ
����1���ڳ��۵�18Ʊ
����1���ڳ��۵�17Ʊ
����1���ڳ��۵�16Ʊ
����1���ڳ��۵�15Ʊ
����1���ڳ��۵�14Ʊ
����1���ڳ��۵�13Ʊ
����1���ڳ��۵�12Ʊ
����1���ڳ��۵�11Ʊ
����1���ڳ��۵�10Ʊ
����1���ڳ��۵�9Ʊ
����1���ڳ��۵�8Ʊ
����1���ڳ��۵�7Ʊ
����1���ڳ��۵�6Ʊ
����1���ڳ��۵�5Ʊ
����1���ڳ��۵�4Ʊ
����1���ڳ��۵�3Ʊ
����1���ڳ��۵�2Ʊ
����1���ڳ��۵�1Ʊ

 */
