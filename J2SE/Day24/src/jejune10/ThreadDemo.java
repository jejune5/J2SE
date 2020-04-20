package jejune10;

/*
 * 匿名内部类的格式：
 * 		new 类名或者接口名() {
 * 			重写方法;
 * 		};
 * 		本质：是该类或者接口的子类对象。
 */
public class ThreadDemo {
	public static void main(String[] args) {
		// 继承Thread类来实现多线程
		new Thread() {
			public void run() {
				for (int x = 0; x < 100; x++) {
					System.out.println(Thread.currentThread().getName() + "---"
							+ x);
				}
			}
		}.start();

		// 实现Runnable接口来实现多线程
		new Thread(new Runnable() {
			public void run() {
				for (int x = 0; x < 100; x++) {
					System.out.println(Thread.currentThread().getName() + "---"
							+ x);
				}
			}
		}) {
		}.start();

		// 更有难度的
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int x = 0; x < 100; x++) {
					System.out.println("world" + ":" + x);
				}
			}
		}) {
			@Override
			public void run() {
				for (int x = 0; x < 100; x++) {
					System.out.println("world" + ":" + x);
				}
			}
		}.start();
	}
}

/*
G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7537 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\J2SE\Day24\out\production\day24_Thread;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain jejune10.ThreadDemo
Thread-0---0
Thread-0---1
Thread-0---2
Thread-0---3
Thread-0---4
Thread-0---5
Thread-0---6
Thread-0---7
Thread-0---8
Thread-0---9
Thread-0---10
Thread-0---11
Thread-0---12
Thread-0---13
Thread-0---14
Thread-0---15
Thread-0---16
Thread-0---17
Thread-0---18
Thread-0---19
Thread-0---20
Thread-0---21
Thread-0---22
Thread-0---23
Thread-0---24
Thread-0---25
Thread-0---26
Thread-0---27
Thread-0---28
Thread-0---29
Thread-0---30
Thread-0---31
Thread-0---32
Thread-0---33
Thread-0---34
Thread-0---35
Thread-0---36
Thread-0---37
Thread-0---38
Thread-0---39
Thread-0---40
Thread-0---41
Thread-0---42
Thread-0---43
Thread-0---44
Thread-0---45
Thread-0---46
Thread-0---47
Thread-0---48
Thread-0---49
Thread-0---50
Thread-0---51
Thread-0---52
Thread-0---53
Thread-0---54
Thread-0---55
Thread-0---56
Thread-0---57
Thread-0---58
Thread-0---59
Thread-0---60
Thread-0---61
Thread-0---62
Thread-0---63
Thread-0---64
Thread-0---65
Thread-0---66
Thread-0---67
Thread-0---68
Thread-0---69
Thread-0---70
Thread-0---71
Thread-0---72
Thread-0---73
Thread-0---74
Thread-0---75
Thread-0---76
Thread-0---77
Thread-0---78
Thread-0---79
Thread-0---80
Thread-0---81
Thread-0---82
Thread-0---83
Thread-0---84
Thread-0---85
Thread-0---86
Thread-0---87
Thread-0---88
Thread-0---89
Thread-0---90
Thread-0---91
Thread-0---92
Thread-0---93
Thread-0---94
Thread-0---95
Thread-0---96
Thread-0---97
Thread-0---98
Thread-0---99
Thread-1---0
Thread-1---1
Thread-1---2
Thread-1---3
Thread-1---4
Thread-1---5
Thread-1---6
Thread-1---7
Thread-1---8
Thread-1---9
Thread-1---10
Thread-1---11
Thread-1---12
Thread-1---13
Thread-1---14
Thread-1---15
Thread-1---16
Thread-1---17
Thread-1---18
Thread-1---19
Thread-1---20
Thread-1---21
Thread-1---22
Thread-1---23
Thread-1---24
Thread-1---25
Thread-1---26
Thread-1---27
Thread-1---28
Thread-1---29
Thread-1---30
Thread-1---31
Thread-1---32
Thread-1---33
Thread-1---34
Thread-1---35
Thread-1---36
Thread-1---37
Thread-1---38
Thread-1---39
Thread-1---40
Thread-1---41
Thread-1---42
Thread-1---43
Thread-1---44
Thread-1---45
Thread-1---46
Thread-1---47
Thread-1---48
Thread-1---49
Thread-1---50
Thread-1---51
Thread-1---52
Thread-1---53
Thread-1---54
Thread-1---55
Thread-1---56
Thread-1---57
Thread-1---58
Thread-1---59
Thread-1---60
Thread-1---61
Thread-1---62
Thread-1---63
Thread-1---64
Thread-1---65
Thread-1---66
Thread-1---67
Thread-1---68
Thread-1---69
Thread-1---70
Thread-1---71
Thread-1---72
Thread-1---73
Thread-1---74
Thread-1---75
Thread-1---76
Thread-1---77
Thread-1---78
Thread-1---79
Thread-1---80
Thread-1---81
Thread-1---82
Thread-1---83
Thread-1---84
Thread-1---85
Thread-1---86
Thread-1---87
Thread-1---88
Thread-1---89
Thread-1---90
Thread-1---91
Thread-1---92
Thread-1---93
Thread-1---94
Thread-1---95
Thread-1---96
Thread-1---97
Thread-1---98
Thread-1---99
world:0
world:1
world:2
world:3
world:4
world:5
world:6
world:7
world:8
world:9
world:10
world:11
world:12
world:13
world:14
world:15
world:16
world:17
world:18
world:19
world:20
world:21
world:22
world:23
world:24
world:25
world:26
world:27
world:28
world:29
world:30
world:31
world:32
world:33
world:34
world:35
world:36
world:37
world:38
world:39
world:40
world:41
world:42
world:43
world:44
world:45
world:46
world:47
world:48
world:49
world:50
world:51
world:52
world:53
world:54
world:55
world:56
world:57
world:58
world:59
world:60
world:61
world:62
world:63
world:64
world:65
world:66
world:67
world:68
world:69
world:70
world:71
world:72
world:73
world:74
world:75
world:76
world:77
world:78
world:79
world:80
world:81
world:82
world:83
world:84
world:85
world:86
world:87
world:88
world:89
world:90
world:91
world:92
world:93
world:94
world:95
world:96
world:97
world:98
world:99

Process finished with exit code 0

 */