package jejune3;

import java.io.File;

/**
 * Created by Jejune on 2018/8/9.
 */
/*
 * 需求：递归删除带内容的目录
 *
 * 目录我已经给定：demo
 *
 * 分析：
 * 		A:封装目录
 * 		B:获取该目录下的所有文件或者文件夹的File数组
 * 		C:遍历该File数组，得到每一个File对象
 * 		D:判断该File对象是否是文件夹
 * 			是：回到B
 * 			否：就删除
 */
public class FileDeleteDemo {
    public static void main(String[] args) {
        //封装目录
        File srcFolder = new File("G:\\demo\\");
        //递归实现
        deleteFolder(srcFolder);

    }

    private static void deleteFolder(File srcFolder) {
        // 获取该目录下的所有文件或者文件夹的File数组
        File[] fileArray = srcFolder.listFiles();

        if (fileArray != null) {
            //遍历该File数组，得到每一个File对象
            for (File file : fileArray) {
                // 判断该File对象是否是文件夹
                if (file.isDirectory()) {
                    deleteFolder(file);
                } else {
                    System.out.println(file.getName() + "---" + file.delete());
                }
            }

            System.out.println(srcFolder.getName() + "---" + srcFolder.delete());
        }

    }
}
/*
G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7533 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\J2SE\Day20\day20_DiGui\out\production\day20_DiGui;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain jejune3.FileDeleteDemo
a.txt---true
ddd---true
ccc---true
bbb---true
bizhi_201501071047025562.jpg---true
gui-config.json---true
mmm.txt---true
Shadowsocks.exe---true
statistics-config.json---true
wjj.txt---true
茅敏敏---true
茅敏敏.jpg---true
Test---true

Process finished with exit code 0

 */