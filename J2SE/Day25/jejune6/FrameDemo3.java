package jejune6;

import java.awt.*;
import java.awt.event.*;

/**
 * Created by Jejune on 2018/4/14.
 */
public class FrameDemo3 {
    public static void main(String[] args) {
        // 创建窗体对象
        final Frame f = new Frame("更改背颜色景");
        // 设置窗体属性和布局
        f.setBounds(400, 300, 400, 200);
        f.setLayout(new FlowLayout());

        //创建四个按钮
        Button BlackBu = new Button("Black");
        Button RedBu = new Button("Red");
        Button YellowBu = new Button("Yellow");
        Button BlueBu = new Button("Blue");

        // 添加按钮
        f.add(BlackBu);
        f.add(RedBu);
        f.add(YellowBu);
        f.add(BlueBu);

        //设置窗体关闭
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // 添加按钮事件
//        BlackBu.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                f.setBackground(Color.BLACK);
//            }
//        });
//
//        RedBu.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                f.setBackground(Color.RED);
//            }
//        });
//
//        YellowBu.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                f.setBackground(Color.YELLOW);
//            }
//        });
//
//        BlueBu.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                f.setBackground(Color.BLUE);
//            }
//        });

        BlackBu.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                f.setBackground(Color.BLACK);
            }
        });

        BlackBu.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                f.setBackground(Color.white);
            }
        });

        RedBu.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                f.setBackground(Color.RED);
            }
        });

        RedBu.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                f.setBackground(Color.white);
            }
        });

        BlueBu.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                f.setBackground(Color.BLUE);
            }
        });

        BlueBu.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                f.setBackground(Color.white);
            }
        });

        YellowBu.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                f.setBackground(Color.YELLOW);
            }
        });

        YellowBu.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                f.setBackground(Color.white);
            }
        });

        f.setVisible(true);
    }
}
