package jejune3;

import java.io.File;

/**
 * Created by Jejune on 2018/8/9.
 */
/*
 * 需求：请大家把G:目录下所有的java结尾的文件的绝对路径给输出在控制台。
 *
 * 分析：
 * 		A:封装目录
 * 		B:获取该目录下所有的文件或者文件夹的File数组
 * 		C:遍历该File数组，得到每一个File对象
 * 		D:判断该File对象是否是文件夹
 * 			是：回到B
 * 			否：继续判断是否以.java结尾
 * 				是：就输出该文件的绝对路径
 * 				否：不搭理它
 */
public class FilePathDemo {
    public static void main(String[] args) {
        //A
        File srcFolder = new File("G:\\");
        //B
        getAllJavaFilePaths(srcFolder);

    }

    private static void getAllJavaFilePaths(File srcFolder) {
        //B
        File[] fileArray = srcFolder.listFiles();

        //C
        for (File file : fileArray) {
            if (file.isDirectory()){
                getAllJavaFilePaths(file);
            } else {
                if (file.getName().endsWith(".java")){
                    // 就输出该文件的绝对路径
                    System.out.println(file.getAbsolutePath());
                }
            }
        }
    }
}

/*
G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7532 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\J2SE\Day20\day20_DiGui\out\production\day20_DiGui;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain jejune3.FilePathDemo
G:\$RECYCLE.BIN\S-1-5-21-2517565556-2739361499-1272347033-1000\$RQ8KCCY\Java算法50题.java
G:\$RECYCLE.BIN\S-1-5-21-2517565556-2739361499-1272347033-1000\$RQ8KCCY\src\Demo11_20\Demo11.java
G:\$RECYCLE.BIN\S-1-5-21-2517565556-2739361499-1272347033-1000\$RQ8KCCY\src\Demo1_10\Demo1.java
G:\$RECYCLE.BIN\S-1-5-21-2517565556-2739361499-1272347033-1000\$RQ8KCCY\src\Demo1_10\Demo10.java
G:\$RECYCLE.BIN\S-1-5-21-2517565556-2739361499-1272347033-1000\$RQ8KCCY\src\Demo1_10\Demo2.java
G:\$RECYCLE.BIN\S-1-5-21-2517565556-2739361499-1272347033-1000\$RQ8KCCY\src\Demo1_10\Demo3.java
G:\$RECYCLE.BIN\S-1-5-21-2517565556-2739361499-1272347033-1000\$RQ8KCCY\src\Demo1_10\Demo4.java
G:\$RECYCLE.BIN\S-1-5-21-2517565556-2739361499-1272347033-1000\$RQ8KCCY\src\Demo1_10\Demo5.java
G:\$RECYCLE.BIN\S-1-5-21-2517565556-2739361499-1272347033-1000\$RQ8KCCY\src\Demo1_10\Demo6.java
G:\$RECYCLE.BIN\S-1-5-21-2517565556-2739361499-1272347033-1000\$RQ8KCCY\src\Demo1_10\Demo7.java
G:\$RECYCLE.BIN\S-1-5-21-2517565556-2739361499-1272347033-1000\$RQ8KCCY\src\Demo1_10\Demo8.java
G:\$RECYCLE.BIN\S-1-5-21-2517565556-2739361499-1272347033-1000\$RQ8KCCY\src\Demo1_10\Demo9.java
G:\$RECYCLE.BIN\S-1-5-21-2517565556-2739361499-1272347033-1000\$RZUWNGI\Demo11_20\Demo11.java
G:\$RECYCLE.BIN\S-1-5-21-2517565556-2739361499-1272347033-1000\$RZUWNGI\Demo1_10\Demo1.java
G:\$RECYCLE.BIN\S-1-5-21-2517565556-2739361499-1272347033-1000\$RZUWNGI\Demo1_10\Demo10.java
G:\$RECYCLE.BIN\S-1-5-21-2517565556-2739361499-1272347033-1000\$RZUWNGI\Demo1_10\Demo2.java
G:\$RECYCLE.BIN\S-1-5-21-2517565556-2739361499-1272347033-1000\$RZUWNGI\Demo1_10\Demo3.java
G:\$RECYCLE.BIN\S-1-5-21-2517565556-2739361499-1272347033-1000\$RZUWNGI\Demo1_10\Demo4.java
G:\$RECYCLE.BIN\S-1-5-21-2517565556-2739361499-1272347033-1000\$RZUWNGI\Demo1_10\Demo5.java
G:\$RECYCLE.BIN\S-1-5-21-2517565556-2739361499-1272347033-1000\$RZUWNGI\Demo1_10\Demo6.java
G:\$RECYCLE.BIN\S-1-5-21-2517565556-2739361499-1272347033-1000\$RZUWNGI\Demo1_10\Demo7.java
G:\$RECYCLE.BIN\S-1-5-21-2517565556-2739361499-1272347033-1000\$RZUWNGI\Demo1_10\Demo8.java
G:\$RECYCLE.BIN\S-1-5-21-2517565556-2739361499-1272347033-1000\$RZUWNGI\Demo1_10\Demo9.java
G:\Android\ActivityTest\app\build\generated\source\buildConfig\androidTest\debug\com\example\jejune\activitytest\test\BuildConfig.java
G:\Android\ActivityTest\app\build\generated\source\buildConfig\debug\com\example\jejune\activitytest\BuildConfig.java
G:\Android\ActivityTest\app\build\generated\source\r\androidTest\debug\android\support\test\espresso\R.java
G:\Android\ActivityTest\app\build\generated\source\r\androidTest\debug\android\support\test\rule\R.java
G:\Android\ActivityTest\app\build\generated\source\r\androidTest\debug\com\example\jejune\activitytest\test\R.java
G:\Android\ActivityTest\app\build\generated\source\r\debug\android\support\v7\appcompat\R.java
G:\Android\ActivityTest\app\build\generated\source\r\debug\com\example\jejune\activitytest\R.java
G:\Android\ActivityTest\app\src\androidTest\java\com\example\jejune\activitytest\ExampleInstrumentedTest.java
G:\Android\ActivityTest\app\src\main\java\com\example\jejune\activitytest\MainActivity.java
G:\Android\ActivityTest\app\src\test\java\com\example\jejune\activitytest\ExampleUnitTest.java
G:\Android\app\src\androidTest\java\com\example\jejune\maomin\ExampleInstrumentedTest.java
G:\Android\app\src\test\java\com\example\jejune\maomin\ExampleUnitTest.java
G:\Android\Code2\ch1\app\build\generated\source\buildConfig\androidTest\debug\com\example\jejune\helloworld\test\BuildConfig.java
G:\Android\Code2\ch1\app\build\generated\source\buildConfig\debug\com\example\jejune\helloworld\BuildConfig.java
G:\Android\Code2\ch1\app\build\generated\source\r\androidTest\debug\android\support\test\espresso\R.java
G:\Android\Code2\ch1\app\build\generated\source\r\androidTest\debug\android\support\test\rule\R.java
G:\Android\Code2\ch1\app\build\generated\source\r\androidTest\debug\com\example\jejune\helloworld\test\R.java
G:\Android\Code2\ch1\app\build\generated\source\r\debug\android\support\v7\appcompat\R.java
G:\Android\Code2\ch1\app\build\generated\source\r\debug\com\example\jejune\helloworld\R.java
G:\Android\Code2\ch1\app\src\androidTest\java\com\example\jejune\helloworld\ExampleInstrumentedTest.java
G:\Android\Code2\ch1\app\src\main\java\com\example\jejune\helloworld\HelloWorldActivity.java
G:\Android\Code2\ch1\app\src\test\java\com\example\jejune\helloworld\ExampleUnitTest.java
G:\Android\Code2\ch2\ActivityLifeCycleTest\app\build\generated\source\buildConfig\androidTest\debug\com\example\jejune\activitylifecycletest\test\BuildConfig.java
G:\Android\Code2\ch2\ActivityLifeCycleTest\app\build\generated\source\buildConfig\debug\com\example\jejune\activitylifecycletest\BuildConfig.java
G:\Android\Code2\ch2\ActivityLifeCycleTest\app\build\generated\source\r\androidTest\debug\android\support\test\espresso\R.java
G:\Android\Code2\ch2\ActivityLifeCycleTest\app\build\generated\source\r\androidTest\debug\android\support\test\rule\R.java
G:\Android\Code2\ch2\ActivityLifeCycleTest\app\build\generated\source\r\androidTest\debug\com\example\jejune\activitylifecycletest\test\R.java
G:\Android\Code2\ch2\ActivityLifeCycleTest\app\build\generated\source\r\debug\android\support\v7\appcompat\R.java
G:\Android\Code2\ch2\ActivityLifeCycleTest\app\build\generated\source\r\debug\com\example\jejune\activitylifecycletest\R.java
G:\Android\Code2\ch2\ActivityLifeCycleTest\app\src\androidTest\java\com\example\jejune\activitylifecycletest\ExampleInstrumentedTest.java
G:\Android\Code2\ch2\ActivityLifeCycleTest\app\src\main\java\com\example\jejune\activitylifecycletest\DialogActivity.java
G:\Android\Code2\ch2\ActivityLifeCycleTest\app\src\main\java\com\example\jejune\activitylifecycletest\MainActivity.java
G:\Android\Code2\ch2\ActivityLifeCycleTest\app\src\main\java\com\example\jejune\activitylifecycletest\NormalActivity.java
G:\Android\Code2\ch2\ActivityLifeCycleTest\app\src\test\java\com\example\jejune\activitylifecycletest\ExampleUnitTest.java
G:\Android\Code2\ch2\app\build\generated\source\buildConfig\androidTest\debug\com\example\jejune\activitytest\test\BuildConfig.java
G:\Android\Code2\ch2\app\build\generated\source\buildConfig\debug\com\example\jejune\activitytest\BuildConfig.java
G:\Android\Code2\ch2\app\build\generated\source\r\androidTest\debug\android\support\test\espresso\R.java
G:\Android\Code2\ch2\app\build\generated\source\r\androidTest\debug\android\support\test\rule\R.java
G:\Android\Code2\ch2\app\build\generated\source\r\androidTest\debug\com\example\jejune\activitytest\test\R.java
G:\Android\Code2\ch2\app\build\generated\source\r\debug\android\support\v7\appcompat\R.java
G:\Android\Code2\ch2\app\build\generated\source\r\debug\com\example\jejune\activitytest\R.java
G:\Android\Code2\ch2\app\src\androidTest\java\com\example\jejune\activitytest\ExampleInstrumentedTest.java
G:\Android\Code2\ch2\app\src\main\java\com\example\jejune\activitytest\FirstActivity.java
G:\Android\Code2\ch2\app\src\main\java\com\example\jejune\activitytest\SecondActivity.java
G:\Android\Code2\ch2\app\src\main\java\com\example\jejune\activitytest\ThirdActivity.java
G:\Android\Code2\ch2\app\src\test\java\com\example\jejune\activitytest\ExampleUnitTest.java
G:\Android\Code2\ch3\ListView\app\build\generated\source\buildConfig\androidTest\debug\com\example\wujej\listviewtest\test\BuildConfig.java
G:\Android\Code2\ch3\ListView\app\build\generated\source\buildConfig\debug\com\example\wujej\listviewtest\BuildConfig.java
G:\Android\Code2\ch3\ListView\app\build\generated\source\r\androidTest\debug\android\support\test\espresso\R.java
G:\Android\Code2\ch3\ListView\app\build\generated\source\r\androidTest\debug\android\support\test\rule\R.java
G:\Android\Code2\ch3\ListView\app\build\generated\source\r\androidTest\debug\com\example\wujej\listviewtest\test\R.java
G:\Android\Code2\ch3\ListView\app\build\generated\source\r\debug\android\support\v7\appcompat\R.java
G:\Android\Code2\ch3\ListView\app\build\generated\source\r\debug\com\example\wujej\listviewtest\R.java
G:\Android\Code2\ch3\ListView\app\src\androidTest\java\com\example\wujej\listviewtest\ExampleInstrumentedTest.java
G:\Android\Code2\ch3\ListView\app\src\main\java\com\example\wujej\listviewtest\Fruit.java
G:\Android\Code2\ch3\ListView\app\src\main\java\com\example\wujej\listviewtest\FruitAdapter.java
G:\Android\Code2\ch3\ListView\app\src\main\java\com\example\wujej\listviewtest\MainActivity.java
G:\Android\Code2\ch3\ListView\app\src\test\java\com\example\wujej\listviewtest\ExampleUnitTest.java
G:\Android\Code2\ch3\RecyclerView\app\build\generated\source\buildConfig\androidTest\debug\com\example\wujej\recyclerview\test\BuildConfig.java
G:\Android\Code2\ch3\RecyclerView\app\build\generated\source\buildConfig\debug\com\example\wujej\recyclerview\BuildConfig.java
G:\Android\Code2\ch3\RecyclerView\app\build\generated\source\r\androidTest\debug\android\support\test\espresso\R.java
G:\Android\Code2\ch3\RecyclerView\app\build\generated\source\r\androidTest\debug\android\support\test\rule\R.java
G:\Android\Code2\ch3\RecyclerView\app\build\generated\source\r\androidTest\debug\com\example\wujej\recyclerview\test\R.java
G:\Android\Code2\ch3\RecyclerView\app\build\generated\source\r\debug\android\support\v7\appcompat\R.java
G:\Android\Code2\ch3\RecyclerView\app\build\generated\source\r\debug\android\support\v7\recyclerview\R.java
G:\Android\Code2\ch3\RecyclerView\app\build\generated\source\r\debug\com\example\wujej\recyclerview\R.java
G:\Android\Code2\ch3\RecyclerView\app\src\androidTest\java\com\example\wujej\recyclerview\ExampleInstrumentedTest.java
G:\Android\Code2\ch3\RecyclerView\app\src\main\java\com\example\wujej\recyclerview\Fruit.java
G:\Android\Code2\ch3\RecyclerView\app\src\main\java\com\example\wujej\recyclerview\FruitAdapter.java
G:\Android\Code2\ch3\RecyclerView\app\src\main\java\com\example\wujej\recyclerview\MainActivity.java
G:\Android\Code2\ch3\RecyclerView\app\src\test\java\com\example\wujej\recyclerview\ExampleUnitTest.java
G:\Android\Code2\ch3\UIBestPractice\app\build\generated\source\buildConfig\androidTest\debug\com\example\wujej\uibestpractice\test\BuildConfig.java
G:\Android\Code2\ch3\UIBestPractice\app\build\generated\source\buildConfig\debug\com\example\wujej\uibestpractice\BuildConfig.java
G:\Android\Code2\ch3\UIBestPractice\app\build\generated\source\r\androidTest\debug\android\support\test\espresso\R.java
G:\Android\Code2\ch3\UIBestPractice\app\build\generated\source\r\androidTest\debug\android\support\test\rule\R.java
G:\Android\Code2\ch3\UIBestPractice\app\build\generated\source\r\androidTest\debug\com\example\wujej\uibestpractice\test\R.java
G:\Android\Code2\ch3\UIBestPractice\app\build\generated\source\r\debug\android\support\v7\appcompat\R.java
G:\Android\Code2\ch3\UIBestPractice\app\build\generated\source\r\debug\com\example\wujej\uibestpractice\R.java
G:\Android\Code2\ch3\UIBestPractice\app\src\androidTest\java\com\example\wujej\uibestpractice\ExampleInstrumentedTest.java
G:\Android\Code2\ch3\UIBestPractice\app\src\main\java\com\example\wujej\uibestpractice\MainActivity.java
G:\Android\Code2\ch3\UIBestPractice\app\src\test\java\com\example\wujej\uibestpractice\ExampleUnitTest.java
G:\Android\Code2\ch3\UICustomViews\app\build\generated\source\buildConfig\debug\com\example\wujej\uicustomviews\BuildConfig.java

Process finished with exit code -1

 */