package jejune3;

/*
 * ÈçºÎ»ñÈ¡Ïß³Ì¶ÔÏóµÄÃû³ÆÄØ?
 * public final String getName():»ñÈ¡Ïß³ÌµÄÃû³Æ¡£
 * ÈçºÎÉèÖÃÏß³Ì¶ÔÏóµÄÃû³ÆÄØ?
 * public final void setName(String name):ÉèÖÃÏß³ÌµÄÃû³Æ
 * 
 * Õë¶Ô²»ÊÇThreadÀàµÄ×ÓÀàÖĞÈçºÎ»ñÈ¡Ïß³Ì¶ÔÏóÃû³ÆÄØ?
 * public static Thread currentThread():·µ»Øµ±Ç°ÕıÔÚÖ´ĞĞµÄÏß³Ì¶ÔÏó
 * Thread.currentThread().getName()
 */
public class MyThreadDemo {
	public static void main(String[] args) {
		/**
		 * // ´´½¨Ïß³Ì¶ÔÏó // ÎŞ²Î¹¹Ôì+setXxx() MyThread my1 = new MyThread(); MyThread
		 * my2 = new MyThread(); // //µ÷ÓÃ·½·¨ÉèÖÃÃû³Æ my1.setName("Ã©ÃôÃô");
		 * my2.setName("Ã«Ã«Ã«"); my1.start(); my2.start();
		 */

		// ´ø²Î¹¹Ôì¸øÏß³ÌÆğÃû
		MyThread my1 = new MyThread("Ã©ÃôÃô");
		MyThread 
		my2 = new MyThread("Ã«Ã«Ã«");
		my1.start();
		my2.start();

		// ÎÒÒª»ñÈ¡main·½·¨ËùÔÚµÄÏß³Ì¶ÔÏóµÄÃû³Æ£¬¸ÃÔõÃ´°ìÄØ?
		// Óöµ½ÕâÖÖÇé¿ö,ThreadÀàÌá¹©ÁËÒ»¸öºÜºÃÍæµÄ·½·¨:
		// public static Thread currentThread():·µ»Øµ±Ç°ÕıÔÚÖ´ĞĞµÄÏß³Ì¶ÔÏó
		System.out.println(Thread.currentThread().getName());
	}
}

/*
G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7533 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\J2SE\Day23\out\production\Day23;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain jejune3.MyThreadDemo
main
Ã©ÃôÃô:0
Ã©ÃôÃô:1
Ã©ÃôÃô:2
Ã©ÃôÃô:3
Ã©ÃôÃô:4
Ã©ÃôÃô:5
Ã©ÃôÃô:6
Ã©ÃôÃô:7
Ã©ÃôÃô:8
Ã©ÃôÃô:9
Ã©ÃôÃô:10
Ã©ÃôÃô:11
Ã©ÃôÃô:12
Ã©ÃôÃô:13
Ã©ÃôÃô:14
Ã©ÃôÃô:15
Ã©ÃôÃô:16
Ã©ÃôÃô:17
Ã©ÃôÃô:18
Ã©ÃôÃô:19
Ã©ÃôÃô:20
Ã©ÃôÃô:21
Ã©ÃôÃô:22
Ã©ÃôÃô:23
Ã©ÃôÃô:24
Ã©ÃôÃô:25
Ã©ÃôÃô:26
Ã©ÃôÃô:27
Ã©ÃôÃô:28
Ã©ÃôÃô:29
Ã©ÃôÃô:30
Ã©ÃôÃô:31
Ã©ÃôÃô:32
Ã©ÃôÃô:33
Ã©ÃôÃô:34
Ã©ÃôÃô:35
Ã©ÃôÃô:36
Ã©ÃôÃô:37
Ã©ÃôÃô:38
Ã©ÃôÃô:39
Ã©ÃôÃô:40
Ã©ÃôÃô:41
Ã©ÃôÃô:42
Ã©ÃôÃô:43
Ã©ÃôÃô:44
Ã©ÃôÃô:45
Ã©ÃôÃô:46
Ã©ÃôÃô:47
Ã©ÃôÃô:48
Ã©ÃôÃô:49
Ã©ÃôÃô:50
Ã©ÃôÃô:51
Ã©ÃôÃô:52
Ã©ÃôÃô:53
Ã©ÃôÃô:54
Ã©ÃôÃô:55
Ã©ÃôÃô:56
Ã©ÃôÃô:57
Ã©ÃôÃô:58
Ã©ÃôÃô:59
Ã©ÃôÃô:60
Ã©ÃôÃô:61
Ã©ÃôÃô:62
Ã©ÃôÃô:63
Ã©ÃôÃô:64
Ã©ÃôÃô:65
Ã©ÃôÃô:66
Ã©ÃôÃô:67
Ã©ÃôÃô:68
Ã©ÃôÃô:69
Ã©ÃôÃô:70
Ã©ÃôÃô:71
Ã©ÃôÃô:72
Ã©ÃôÃô:73
Ã©ÃôÃô:74
Ã©ÃôÃô:75
Ã©ÃôÃô:76
Ã©ÃôÃô:77
Ã©ÃôÃô:78
Ã©ÃôÃô:79
Ã©ÃôÃô:80
Ã©ÃôÃô:81
Ã©ÃôÃô:82
Ã©ÃôÃô:83
Ã©ÃôÃô:84
Ã©ÃôÃô:85
Ã©ÃôÃô:86
Ã©ÃôÃô:87
Ã©ÃôÃô:88
Ã©ÃôÃô:89
Ã©ÃôÃô:90
Ã©ÃôÃô:91
Ã©ÃôÃô:92
Ã©ÃôÃô:93
Ã©ÃôÃô:94
Ã©ÃôÃô:95
Ã©ÃôÃô:96
Ã©ÃôÃô:97
Ã©ÃôÃô:98
Ã©ÃôÃô:99
Ã«Ã«Ã«:0
Ã«Ã«Ã«:1
Ã«Ã«Ã«:2
Ã«Ã«Ã«:3
Ã«Ã«Ã«:4
Ã«Ã«Ã«:5
Ã«Ã«Ã«:6
Ã«Ã«Ã«:7
Ã«Ã«Ã«:8
Ã«Ã«Ã«:9
Ã«Ã«Ã«:10
Ã«Ã«Ã«:11
Ã«Ã«Ã«:12
Ã«Ã«Ã«:13
Ã«Ã«Ã«:14
Ã«Ã«Ã«:15
Ã«Ã«Ã«:16
Ã«Ã«Ã«:17
Ã«Ã«Ã«:18
Ã«Ã«Ã«:19
Ã«Ã«Ã«:20
Ã«Ã«Ã«:21
Ã«Ã«Ã«:22
Ã«Ã«Ã«:23
Ã«Ã«Ã«:24
Ã«Ã«Ã«:25
Ã«Ã«Ã«:26
Ã«Ã«Ã«:27
Ã«Ã«Ã«:28
Ã«Ã«Ã«:29
Ã«Ã«Ã«:30
Ã«Ã«Ã«:31
Ã«Ã«Ã«:32
Ã«Ã«Ã«:33
Ã«Ã«Ã«:34
Ã«Ã«Ã«:35
Ã«Ã«Ã«:36
Ã«Ã«Ã«:37
Ã«Ã«Ã«:38
Ã«Ã«Ã«:39
Ã«Ã«Ã«:40
Ã«Ã«Ã«:41
Ã«Ã«Ã«:42
Ã«Ã«Ã«:43
Ã«Ã«Ã«:44
Ã«Ã«Ã«:45
Ã«Ã«Ã«:46
Ã«Ã«Ã«:47
Ã«Ã«Ã«:48
Ã«Ã«Ã«:49
Ã«Ã«Ã«:50
Ã«Ã«Ã«:51
Ã«Ã«Ã«:52
Ã«Ã«Ã«:53
Ã«Ã«Ã«:54
Ã«Ã«Ã«:55
Ã«Ã«Ã«:56
Ã«Ã«Ã«:57
Ã«Ã«Ã«:58
Ã«Ã«Ã«:59
Ã«Ã«Ã«:60
Ã«Ã«Ã«:61
Ã«Ã«Ã«:62
Ã«Ã«Ã«:63
Ã«Ã«Ã«:64
Ã«Ã«Ã«:65
Ã«Ã«Ã«:66
Ã«Ã«Ã«:67
Ã«Ã«Ã«:68
Ã«Ã«Ã«:69
Ã«Ã«Ã«:70
Ã«Ã«Ã«:71
Ã«Ã«Ã«:72
Ã«Ã«Ã«:73
Ã«Ã«Ã«:74
Ã«Ã«Ã«:75
Ã«Ã«Ã«:76
Ã«Ã«Ã«:77
Ã«Ã«Ã«:78
Ã«Ã«Ã«:79
Ã«Ã«Ã«:80
Ã«Ã«Ã«:81
Ã«Ã«Ã«:82
Ã«Ã«Ã«:83
Ã«Ã«Ã«:84
Ã«Ã«Ã«:85
Ã«Ã«Ã«:86
Ã«Ã«Ã«:87
Ã«Ã«Ã«:88
Ã«Ã«Ã«:89
Ã«Ã«Ã«:90
Ã«Ã«Ã«:91
Ã«Ã«Ã«:92
Ã«Ã«Ã«:93
Ã«Ã«Ã«:94
Ã«Ã«Ã«:95
Ã«Ã«Ã«:96
Ã«Ã«Ã«:97
Ã«Ã«Ã«:98
Ã«Ã«Ã«:99

Process finished with exit code 0

 */