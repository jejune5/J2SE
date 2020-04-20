package jejune3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Jejune on 2018/8/10.
 */
/*
 * 需求：把e:\\哥有老婆.mp4复制到当前项目目录下的copy.mp4中
 *
 * 数据源：
 * 		e:\\哥有老婆.mp4--读取数据--FileInputStream
 * 目的地：
 * 		copy.mp4--写出数据--FileOutputStream
 */
public class CopyFileDemo3 {
    public static void main(String[] args) throws IOException {
        //封装原数据
        FileInputStream fis = new FileInputStream("D:\\视频\\鼓浪屿\\VID_20180430_145207.mp4");
        //封装目的源
        FileOutputStream fos = new FileOutputStream("G:\\demo\\mmm\\20180430.mp4");

        //复制数据
        int by = 0;
        while ((by = fis.read()) != -1) {
            fos.write(by);
        }

        fis.close();
        fos.close();
    }
}
