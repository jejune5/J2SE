package jejune8;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;

/*
 * 这里的集合必须是Properties集合：
 * public void load(Reader reader):把文件中的数据读取到集合中
 * public void store(Writer writer,String comments):把集合中的数据存储到文件
 *
 * 单机版游戏：
 * 		进度保存和加载。
 * 		三国群英传，三国志，仙剑奇侠传...
 *
 * 		吕布=1
 * 		方天画戟=1
 */
public class PropertiesDemo3 {
	public static void main(String[] args) throws IOException {
		 myLoad();

		myStore();
	}

	private static void myStore() throws IOException {
		// 创建集合对象
		Properties prop = new Properties();

		prop.setProperty("茅敏敏", "22");
		prop.setProperty("毛毛毛", "20");
		prop.setProperty("喵喵喵", "18");
		
		//public void store(Writer writer,String comments):把集合中的数据存储到文件
		Writer w = new FileWriter("name.txt");
		prop.store(w, "helloworld");
		w.close();
	}

	private static void myLoad() throws IOException {
		Properties prop = new Properties();

		// public void load(Reader reader):把文件中的数据读取到集合中
		// 注意：这个文件的数据必须是键值对形式
		Reader r = new FileReader("prop.txt");
		prop.load(r);
		r.close();

		System.out.println("prop:" + prop);
	}
}

/*
G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7538 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\J2SE\Day22\day22_IO\out\production\day22_IO;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain jejune8.PropertiesDemo3
prop:{喵喵喵=18, 毛毛毛=20, 茅敏敏=22}

Process finished with exit code 0

 */
