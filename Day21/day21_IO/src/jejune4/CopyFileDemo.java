package jejune4;

import java.io.*;

/**
 * Created by Jejune on 2018/8/10.
 */
/*
 * 需求：把当前项目目录下的a.txt内容复制到当前项目目录下的b.txt中
 *
 * 数据源：
 * 		a.txt -- 读取数据 -- 字符转换流 -- InputStreamReader
 * 目的地：
 * 		b.txt -- 写出数据 -- 字符转换流 -- OutputStreamWriter
 */
public class CopyFileDemo {
    public static void main(String[] args) throws IOException {
        //封装数据源
        InputStreamReader isr = new InputStreamReader(
                new FileInputStream("a.txt"));
        //封装目的源
        OutputStreamWriter osw = new OutputStreamWriter(
                new FileOutputStream("b.txt"));

        // 读写数据
        // 方式1
        // int ch = 0;
        // while ((ch = isr.read()) != -1) {
        // osw.write(ch);
        // }

        int len = 0;
        char[] chs = new char[1024];
        while ((len = isr.read(chs)) != -1) {
            osw.write(chs, 0, len);
        }
        osw.close();
        isr.close();
    }
}
