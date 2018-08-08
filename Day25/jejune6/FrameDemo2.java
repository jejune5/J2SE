package jejune6;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by Jejune on 2018/4/13.
 */
// 设置数据转移窗体
public class FrameDemo2 {
    public static void main(String[] args) {

        // 定义窗体对象
        Frame f = new Frame("数据转移");
        // 设置窗体属性
        f.setBounds(400, 200, 400, 300);
        f.setLayout(new FlowLayout());

        // 创建文本框
        final TextField tf = new TextField(20);
        // 创建按钮
        Button b = new Button("数据转移");
        // 创建文本域
        TextArea ta = new TextArea(10, 20);

        // 将组件添加到窗体
        f.add(tf);
        f.add(b);
        f.add(ta);

        // 设置窗体关闭
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // 对按钮添加事件
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 获取文本框的值
                String tf_str = tf.getText().trim();
                // 清空数据
                tf.setText("");

                //设置文本域
                // 替换和覆盖
//  ta.setText(tf_str);
                //追加和换行
                ta.append(tf_str + "\r\n");

                // 获取光标
                tf.requestFocus();
            }
        });

        //设置窗体显示
        f.setVisible(true);

    }
}
