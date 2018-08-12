package jejune9;

import java.io.FileReader;
import java.io.IOException;

public class MyLineNumberReaderTest {
	public static void main(String[] args) throws IOException {
		// MyLineNumberReader mlnr = new MyLineNumberReader(new FileReader(
		// "a.txt"));

		MyLineNumberReader2 mlnr = new MyLineNumberReader2(new FileReader(
				"b.txt"));

		// mlnr.setLineNumber(10);

		// System.out.println(mlnr.getLineNumber());
		// System.out.println(mlnr.getLineNumber());
		// System.out.println(mlnr.getLineNumber());

		String line = null;
		while ((line = mlnr.readLine()) != null) {
			System.out.println(mlnr.getLineNumber() + ":" + line);
		}

		mlnr.close();
	}
}

/*
G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7533 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\J2SE\Day21\day21_IO_test\out\production\day21_IO_test;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain jejune9.MyLineNumberReaderTest

Process finished with exit code 0

 */