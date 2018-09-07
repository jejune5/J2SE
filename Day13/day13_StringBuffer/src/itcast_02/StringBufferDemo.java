package itcast_02;

/*
 * StringBuffer����ӹ��ܣ�
 * public StringBuffer append(String str):���԰���������������ӵ��ַ�������������,�������ַ�������������
 * 
 * public StringBuffer insert(int offset,String str):��ָ��λ�ð��������͵����ݲ��뵽�ַ�������������,�������ַ�������������
 */
public class StringBufferDemo {
	public static void main(String[] args) {
		// �����ַ�������������
		StringBuffer sb = new StringBuffer();

		// public StringBuffer append(String str)
		// StringBuffer sb2 = sb.append("hello");
		// System.out.println("sb:" + sb);
		// System.out.println("sb2:" + sb2);
		// System.out.println(sb == sb2); // true

		// һ��һ�����������
		// sb.append("hello");
		// sb.append(true);
		// sb.append(12);
		// sb.append(34.56);

		// ��ʽ���
		sb.append("hello").append(true).append(12).append(34.56);
		System.out.println("sb:" + sb);

		// public StringBuffer insert(int offset,String
		// str):��ָ��λ�ð��������͵����ݲ��뵽�ַ�������������,�������ַ�������������
		sb.insert(5, "world");
		System.out.println("sb:" + sb);
	}
}

/*
G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7533 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\J2SE\Day13\day13_StringBuffer\out\production\day13_StringBuffer;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain itcast_02.StringBufferDemo
sb:hellotrue1234.56
sb:helloworldtrue1234.56

Process finished with exit code 0

 */