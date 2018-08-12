package jejune3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Jejune on 2018/8/10.
 */
/*
 * InputStreamReader的方法：
 * int read():一次读取一个字符
 * int read(char[] chs):一次读取一个字符数组
 */
public class InputStreamReaderDemo {
    public static void main(String[] args) throws IOException {
        // 创建对象
        InputStreamReader isr = new InputStreamReader(new FileInputStream("StringDemo.java"));

//        //1次读取1个字符
//        int ch = 0;
//        while ((ch = isr.read()) != -1) {
//            System.out.print((char) ch);
//        }

        int len = 0;
        char[] chs = new char[1024];
        while ((len = isr.read(chs)) != -1) {
            System.out.println(new String(chs, 0, len));
        }
        isr.close();
    }
}

/*

 */