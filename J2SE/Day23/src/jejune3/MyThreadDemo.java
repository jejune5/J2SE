package jejune3;

/*
 * ��λ�ȡ�̶߳����������?
 * public final String getName():��ȡ�̵߳����ơ�
 * ��������̶߳����������?
 * public final void setName(String name):�����̵߳�����
 * 
 * ��Բ���Thread�����������λ�ȡ�̶߳���������?
 * public static Thread currentThread():���ص�ǰ����ִ�е��̶߳���
 * Thread.currentThread().getName()
 */
public class MyThreadDemo {
	public static void main(String[] args) {
		/**
		 * // �����̶߳��� // �޲ι���+setXxx() MyThread my1 = new MyThread(); MyThread
		 * my2 = new MyThread(); // //���÷����������� my1.setName("é����");
		 * my2.setName("ëëë"); my1.start(); my2.start();
		 */

		// ���ι�����߳�����
		MyThread my1 = new MyThread("é����");
		MyThread 
		my2 = new MyThread("ëëë");
		my1.start();
		my2.start();

		// ��Ҫ��ȡmain�������ڵ��̶߳�������ƣ�����ô����?
		// �����������,Thread���ṩ��һ���ܺ���ķ���:
		// public static Thread currentThread():���ص�ǰ����ִ�е��̶߳���
		System.out.println(Thread.currentThread().getName());
	}
}

/*
G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7533 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\J2SE\Day23\out\production\Day23;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain jejune3.MyThreadDemo
main
é����:0
é����:1
é����:2
é����:3
é����:4
é����:5
é����:6
é����:7
é����:8
é����:9
é����:10
é����:11
é����:12
é����:13
é����:14
é����:15
é����:16
é����:17
é����:18
é����:19
é����:20
é����:21
é����:22
é����:23
é����:24
é����:25
é����:26
é����:27
é����:28
é����:29
é����:30
é����:31
é����:32
é����:33
é����:34
é����:35
é����:36
é����:37
é����:38
é����:39
é����:40
é����:41
é����:42
é����:43
é����:44
é����:45
é����:46
é����:47
é����:48
é����:49
é����:50
é����:51
é����:52
é����:53
é����:54
é����:55
é����:56
é����:57
é����:58
é����:59
é����:60
é����:61
é����:62
é����:63
é����:64
é����:65
é����:66
é����:67
é����:68
é����:69
é����:70
é����:71
é����:72
é����:73
é����:74
é����:75
é����:76
é����:77
é����:78
é����:79
é����:80
é����:81
é����:82
é����:83
é����:84
é����:85
é����:86
é����:87
é����:88
é����:89
é����:90
é����:91
é����:92
é����:93
é����:94
é����:95
é����:96
é����:97
é����:98
é����:99
ëëë:0
ëëë:1
ëëë:2
ëëë:3
ëëë:4
ëëë:5
ëëë:6
ëëë:7
ëëë:8
ëëë:9
ëëë:10
ëëë:11
ëëë:12
ëëë:13
ëëë:14
ëëë:15
ëëë:16
ëëë:17
ëëë:18
ëëë:19
ëëë:20
ëëë:21
ëëë:22
ëëë:23
ëëë:24
ëëë:25
ëëë:26
ëëë:27
ëëë:28
ëëë:29
ëëë:30
ëëë:31
ëëë:32
ëëë:33
ëëë:34
ëëë:35
ëëë:36
ëëë:37
ëëë:38
ëëë:39
ëëë:40
ëëë:41
ëëë:42
ëëë:43
ëëë:44
ëëë:45
ëëë:46
ëëë:47
ëëë:48
ëëë:49
ëëë:50
ëëë:51
ëëë:52
ëëë:53
ëëë:54
ëëë:55
ëëë:56
ëëë:57
ëëë:58
ëëë:59
ëëë:60
ëëë:61
ëëë:62
ëëë:63
ëëë:64
ëëë:65
ëëë:66
ëëë:67
ëëë:68
ëëë:69
ëëë:70
ëëë:71
ëëë:72
ëëë:73
ëëë:74
ëëë:75
ëëë:76
ëëë:77
ëëë:78
ëëë:79
ëëë:80
ëëë:81
ëëë:82
ëëë:83
ëëë:84
ëëë:85
ëëë:86
ëëë:87
ëëë:88
ëëë:89
ëëë:90
ëëë:91
ëëë:92
ëëë:93
ëëë:94
ëëë:95
ëëë:96
ëëë:97
ëëë:98
ëëë:99

Process finished with exit code 0

 */