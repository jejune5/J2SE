package jejune13;

/**
 * Created by Jejune on 2018/6/23.
 */

import java.io.*;
import java.net.Socket;

/**
 * 上传图片并加反馈
 */
public class UploadClient {
    public static void main(String[] args) throws IOException {
        //①创建客户端Socket对象
        Socket s = new Socket("192.168.1.114", 307);

        //②封装图片文件
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(
                "茅敏敏.jpg"));

        //③封装通道内的流
        BufferedOutputStream bos = new BufferedOutputStream(
                s.getOutputStream());

        byte[] bys = new byte[1024];
        int len = 0;
        while ((len = bis.read(bys)) != -1) {
            bos.write(bys, 0, len);
            bos.flush();
        }

        s.shutdownOutput();

        //④读取反馈
        InputStream is = s.getInputStream();
        byte[] bys2 = new byte[1024];
        int len2 = is.read(bys2);
        String client = new String(bys, 0, len2);
        System.out.println(client);

        //⑤释放资源
        bis.close();
        s.close();
    }


}

