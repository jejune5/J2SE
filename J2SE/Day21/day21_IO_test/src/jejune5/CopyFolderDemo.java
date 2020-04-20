package jejune5;

import java.io.*;

/**
 * Created by Jejune on 2018/8/11.
 */
/*
 * 需求：复制多极文件夹
 *
 * 数据源：E:\JavaSE\day21\code\demos
 * 目的地：E:\\
 *
 * 分析：
 * 		A:封装数据源File
 * 		B:封装目的地File
 * 		C:判断该File是文件夹还是文件
 * 			a:是文件夹
 * 				就在目的地目录下创建该文件夹
 * 				获取该File对象下的所有文件或者文件夹File对象
 * 				遍历得到每一个File对象
 * 				回到C
 * 			b:是文件
 * 				就复制(字节流)
 */
public class CopyFolderDemo {
    public static void main(String[] args) throws IOException {
        //封装数据源File
        File srcFile = new File("G:\\demo\\mmm");
        File destFile = new File("G:\\demo\\wjj");

        //复制文件夹功能
        copyFolder(srcFile,destFile);

    }

    private static void copyFolder(File srcFile, File destFile) throws IOException{
        //判断File是文件还是文件夹
        if (srcFile.isDirectory()) {
            //文件夹
            File newFolder = new File(destFile,destFile.getName());
            newFolder.mkdir();

            // 获取File对象下的所有文件或文件夹
            File[] fileArray = srcFile.listFiles();
            for (File file : fileArray) {
                copyFolder(file,newFolder);
            }
        } else {
            //文件
            File newFile = new File(destFile,srcFile.getName());
            copyFile(srcFile,newFile);
        }
    }

    private static void copyFile(File srcFile, File newFile) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(
                srcFile));
        BufferedOutputStream bos = new BufferedOutputStream(
                new FileOutputStream(newFile));

        byte[] bys = new byte[1024];
        int len = 0;
        while ((len = bis.read(bys)) != -1) {
            bos.write(bys, 0, len);
        }

        bos.close();
        bis.close();
    }


}
