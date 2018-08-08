package jejune7;

/*
 * 你输入的如果是非数字字符，就取消你键盘录入的效果。
 */

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by Jejune on 2018/4/15.
 */
public class FrameDemo {
    public static void main(String[] args) {
        //设置窗体属性
        Frame f = new Frame("不能输入非数字字符");
        f.setBounds(400, 200, 400, 300);
        f.setLayout(new FlowLayout());

        //创建Lable标签对象
        Label label = new Label("Please enter your QQ number,it must be numbered!");
        TextField tf = new TextField(40);

        //窗体添加组件
        f.add(label);
        f.add(tf);

        // 设置窗体关闭
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // 给文本添加事件
        tf.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                // 如果取得的是字符不是数字就取消事件
                // 思路：先获取字符，判断字符，取消事件
                // char getKeyChar()
                char ch = e.getKeyChar();
                if (!(ch >= '0' && ch <= '9')) {
                    e.consume();
                }
            }
        });

        //设置窗体可见
        f.setVisible(true);
    }
}
