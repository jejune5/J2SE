package jejune13;

/**
 * Created by Jejune on 2018/6/23.
 */

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 上传图片并加反馈
 */
public class UploadServer {
    public static void main(String[] args) throws IOException {
        //①创建服务器Socket对象
        ServerSocket ss = new ServerSocket(307);

        //②监听客户端连接
        Socket s = ss.accept();

        //③封装通道内流
        BufferedInputStream bis = new BufferedInputStream(s.getInputStream());

        //④封装图片文件
        BufferedOutputStream bos = new BufferedOutputStream(
                new FileOutputStream("mmm.jpg"));

        byte[] bys = new byte[1024];
        int len = 0;
        while ((len = bis.read(bys)) != -1) {   //注意字符是null  字节是-1
            bos.write(bys,0,len);
            bos.flush();
        }

        //⑤添加反馈
        OutputStream os = s.getOutputStream();
        os.write("图片上传成功！".getBytes());

        //⑥释放资源
        bos.close();
       // os.close();
        s.close();

    }
}
