package jejune1;

import java.io.File;

/**
 * Created by Jejune on 2018/8/7.
 */
/*
 * 我们要想实现IO的操作，就必须知道硬盘上文件的表现形式。
 * 而Java就提供了一个类File供我们使用。
 *
 * File:文件和目录(文件夹)路径名的抽象表示形式
 * 构造方法：
 * 		File(String pathname)：根据一个路径得到File对象
 * 		File(String parent, String child):根据一个目录和一个子文件/目录得到File对象
 * 		File(File parent, String child):根据一个父File对象和一个子文件/目录得到File对象
 */
public class FileDemo {
    public static void main(String[] args) {
        // File(String pathname)：根据一个路径得到File对象
        // 把e:\\demo\\a.txt封装成一个File对象
        File file = new File("G:\\Test\\wjj.txt");

        // File(String parent, String child):根据一个目录和一个子文件/目录得到File对象
        File file2 = new File("G:\\Test", "wjj.txt");

        // File(File parent, String child):根据一个父File对象和一个子文件/目录得到File对象
        File file3 = new File("G:\\Test");
        File file4 = new File(file3, "wjj.txt");

        // 以上三种方式其实效果一样
    }
}
