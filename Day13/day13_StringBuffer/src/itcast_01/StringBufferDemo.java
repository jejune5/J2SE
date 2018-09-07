package itcast_01;

/*
 * �̰߳�ȫ(���߳̽���)
 * ��ȫ -- ͬ�� -- �����ǰ�ȫ��
 * ����ȫ -- ��ͬ�� -- Ч�ʸ�һЩ
 * ��ȫ��Ч����������Զ�������ǵ����⡣
 * ��ȫ��ҽԺ����վ��������վ
 * Ч�ʣ�������վ����̳֮���
 * 
 * StringBuffer:
 * 		�̰߳�ȫ�Ŀɱ��ַ�����
 * 
 * StringBuffer��String������?
 * ǰ�߳��Ⱥ����ݿɱ䣬���߲��ɱ䡣
 * ���ʹ��ǰ�����ַ�����ƴ�ӣ������˷�̫�����Դ��
 * 
 * StringBuffer�Ĺ��췽����
 * 		public StringBuffer():�޲ι��췽��
 *		public StringBuffer(int capacity):ָ���������ַ�������������
 *		public StringBuffer(String str):ָ���ַ������ݵ��ַ�������������
 *
 * StringBuffer�ķ�����
 *		public int capacity()�����ص�ǰ������	����ֵ
 *		public int length():���س��ȣ��ַ������� ʵ��ֵ
 */
public class StringBufferDemo {
	public static void main(String[] args) {
		// public StringBuffer():�޲ι��췽��
		StringBuffer sb = new StringBuffer();
		System.out.println("sb:" + sb);
		System.out.println("sb.capacity():" + sb.capacity());
		System.out.println("sb.length():" + sb.length());
		System.out.println("--------------------------");

		// public StringBuffer(int capacity):ָ���������ַ�������������
		StringBuffer sb2 = new StringBuffer(50);
		System.out.println("sb2:" + sb2);
		System.out.println("sb2.capacity():" + sb2.capacity());
		System.out.println("sb2.length():" + sb2.length());
		System.out.println("--------------------------");

		// public StringBuffer(String str):ָ���ַ������ݵ��ַ�������������
		StringBuffer sb3 = new StringBuffer("hello");
		System.out.println("sb3:" + sb3);
		System.out.println("sb3.capacity():" + sb3.capacity());
		System.out.println("sb3.length():" + sb3.length());
	}
}

/*
G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7532 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\J2SE\Day13\day13_StringBuffer\out\production\day13_StringBuffer;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain itcast_01.StringBufferDemo
sb:
sb.capacity():16
sb.length():0
--------------------------
sb2:
sb2.capacity():50
sb2.length():0
--------------------------
sb3:hello
sb3.capacity():21
sb3.length():5

Process finished with exit code 0

 */