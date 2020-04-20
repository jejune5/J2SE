package jejune6;

import java.io.*;
import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by Jejune on 2018/8/12.
 */
/*
 * 以前的操作：
 * a.txt -- b.txt
 * c.txt -- d.txt
 * e.txt -- f.txt
 *
 * 现在想要：
 * a.txt+b.txt+c.txt -- d.txt
 */
public class SequenceInputStreamDemo2 {
    public static void main(String[] args) throws IOException {
        // 需求：把下面的三个文件的内容复制到Copy.java中
        // ByteArrayStreamDemo.java,CopyFileDemo.java,DataStreamDemo.java

        // SequenceInputStream(Enumeration e)
        // 通过简单的回顾我们知道了Enumeration是Vector中的一个方法的返回值类型。
        // Enumeration<E> elements()

        Vector<InputStream> v = new Vector<InputStream>();
        InputStream s1 = new FileInputStream("ByteArrayStreamDemo.java");
        InputStream s2 = new FileInputStream("DataStreamDemo.java");
        InputStream s3 = new FileInputStream("CopyFile.java");

        v.add(s1);
        v.add(s2);
        v.add(s3);

        Enumeration<InputStream> en = v.elements();   //联想迭代器
        SequenceInputStream sis = new SequenceInputStream(en);
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("Copy2044.java"));

        //读写
        byte[] by = new byte[1024];
        int len = 0;
        while ((len = sis.read(by)) != -1) {
            bos.write(by, 0, len);
        }

        sis.close();
        bos.close();

    }
}
