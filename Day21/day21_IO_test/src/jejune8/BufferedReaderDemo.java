package jejune8;

import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Jejune on 2018/8/12.
 */
/*
 * 测试MyBufferedReader的时候，你就把它当作BufferedReader一样的使用
 */
public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {

        MyBufferedReader mbr = new MyBufferedReader(new FileReader("a.txt"));

        String line = null;
        while ((line = mbr.readLine()) != null) {
            System.out.println(line);
        }

        mbr.close();
    }
}
