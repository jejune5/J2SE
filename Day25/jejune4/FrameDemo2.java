package jejune4;


import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * Created by Jejune on 2018/4/3.
 */
public class FrameDemo2 {
    public static void main(String[] args) {
        //创建窗体对象
        Frame f = new Frame("窗体关闭案例");

        //设置窗体属性
        f.setBounds(400, 200, 300, 500);

        //让窗体关闭
        //事件源
        //事件：对窗体的处理
        //事件处理：关闭窗口(System.exit(0));
        //事件监听
//        f.addWindowListener(new WindowListener() {
//            @Override
//            public void windowOpened(WindowEvent e) {
//
//            }
//
//            @Override
//            public void windowClosing(WindowEvent e) {
//                System.exit(0);
//
//            }
//
//            @Override
//            public void windowClosed(WindowEvent e) {
//
//            }
//
//            @Override
//            public void windowIconified(WindowEvent e) {
//
//            }
//
//            @Override
//            public void windowDeiconified(WindowEvent e) {
//
//            }
//
//            @Override
//            public void windowActivated(WindowEvent e) {
//
//            }
//
//            @Override
//            public void windowDeactivated(WindowEvent e) {
//
//            }
//        });

        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        //设置窗体可见
        f.setVisible(true);
    }
}
