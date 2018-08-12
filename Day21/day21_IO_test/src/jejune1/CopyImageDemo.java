package jejune1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Jejune on 2018/8/11.
 */
/*
 * 复制图片
 *
 * 分析：
 * 		复制数据，如果我们知道用记事本打开并能够读懂，就用字符流，否则用字节流。
 * 		通过该原理，我们知道我们应该采用字节流。
 * 		而字节流有4种方式，所以做这个题目我们有4种方式。推荐掌握第4种。
 *
 * 数据源：
 * 		c:\\a.jpg -- FileInputStream -- BufferedInputStream
 * 目的地：
 * 		d:\\b.jpg -- FileOutputStream -- BufferedOutputStream
 */
public class CopyImageDemo {
    public static void main(String[] args) throws IOException {
        // 使用字符串作为路径
        // String srcString = "c:\\a.jpg";
        // String destString = "d:\\b.jpg";
        // 使用File对象做为参数
        File srcFile = new File("G:\\demo\\mmm\\mmm.jpg");
        File desFile = new File("G:\\demo\\wjj\\1052.jpg");

        method1(srcFile, desFile);
    }

    // 基本字节流一次读写一个字节
    private static void method1(File srcFile, File desFile) throws IOException {
        FileInputStream fis = new FileInputStream(srcFile);
        FileOutputStream fos = new FileOutputStream(desFile);

        int by = 0;
        while ((by = fis.read()) != -1) {
            fos.write(by);
        }
        fis.close();
        fos.close();
    }
}
