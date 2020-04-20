package jejune4;

import java.io.PrintStream;

/**
 * Created by Jejune on 2018/8/12.
 */
/*
 * 标准输入输出流
 * System类中的两个成员变量：
 *		public static final InputStream in “标准”输入流。
 * 		public static final PrintStream out “标准”输出流。
 *
 * 		InputStream is = System.in;
 * 		PrintStream ps = System.out;
 */
public class SystemOutDemo {
    public static void main(String[] args) {
        // 有这里的讲解我们就知道了，这个输出语句其本质是IO流操作，把数据输出到控制台。
        System.out.println("HelloWorld");

        //获取标准输出对象
        PrintStream ps = System.out;
        ps.println("Helloworld");

        ps.println();
        // ps.print();//这个方法不存在

        // System.out.println();
        // System.out.print();

    }
}
