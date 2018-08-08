package jejune1;

import java.io.*;

/**
 * Created by Jejune on 2018/7/15.
 */
public class IODemo extends GetTime {

    @Override
    public void code() {
        try {
            BufferedInputStream bis = new BufferedInputStream(
                    new FileInputStream("a.mp4"));
            BufferedOutputStream bos = new BufferedOutputStream(
                    new FileOutputStream("b.mp4"));
            byte[] bys = new byte[1024];
            int len = 0;
            while ((len = bis.read(bys)) != -1) {
                bos.write(bys, 0, len);
            }
            bos.close();
            bis.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
