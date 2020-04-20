package jejune6;

import java.io.*;

/**
 * Created by Jejune on 2018/8/11.
 */
/*
 * 需求：把当前项目目录下的a.txt内容复制到当前项目目录下的b.txt中
 *
 * 数据源：
 * 		a.txt -- 读取数据 -- 字符转换流 -- InputStreamReader -- FileReader -- BufferedReader
 * 目的地：
 * 		b.txt -- 写出数据 -- 字符转换流 -- OutputStreamWriter -- FileWriter -- BufferedWriter
 */
public class CopyFileDemo {
    public static void main(String[] args) throws IOException {
        //封装数据源
        BufferedReader br = new BufferedReader(new FileReader("a.txt"));
        //封装目的源
        BufferedWriter bw = new BufferedWriter(new FileWriter("b.txt"));

        // 两种方式其中的一种一次读写一个字符数组
        char[] chs = new char[1024];
        int len = 0;
        while ((len = br.read(chs)) != -1) {
            bw.write(chs, 0, len);
        }

        //释放资源
        br.close();
        bw.close();
    }
}
