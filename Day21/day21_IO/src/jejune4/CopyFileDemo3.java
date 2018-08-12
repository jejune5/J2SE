package jejune4;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Jejune on 2018/8/10.
 */
/*
 * 需求：把c:\\a.txt内容复制到d:\\b.txt中
 *
 * 数据源：
 * 		c:\\a.txt -- FileReader
 * 目的地:
 * 		d:\\b.txt -- FileWriter
 */
public class CopyFileDemo3 {
    public static void main(String[] args) throws IOException{
        // 封装数据源
        FileReader fr = new FileReader("g:\\demo\\mmm\\mmm.jpg");
        // 封装目的地
        FileWriter fw = new FileWriter("g:\\demo\\wjj\\mmm2034.jpg");

        // 读写数据
        // int ch = 0;
        int ch;
        while ((ch = fr.read()) != -1) {
            fw.write(ch);
        }

        //释放资源
        fw.close();
        fr.close();
    }
}
