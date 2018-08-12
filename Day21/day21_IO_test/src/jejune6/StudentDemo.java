package jejune6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by Jejune on 2018/8/11.
 */
/*
 * 键盘录入5个学生信息(姓名,语文成绩,数学成绩,英语成绩),按照总分从高到低存入文本文件
 *
 * 分析：
 * 		A:创建学生类
 * 		B:创建集合对象
 * 			TreeSet<Student>
 * 		C:键盘录入学生信息存储到集合
 * 		D:遍历集合，把数据写到文本文件
 */
public class StudentDemo {
    public static void main(String[] args) throws IOException {
        //创建集合对象
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int num = o2.getSum() - o1.getSum();
                int num2 = num == 0 ? o1.getChinese() - o2.getChinese() : num;
                int num3 = num2 == 0 ? o1.getMath() - o2.getMath() : num2;
                int num4 = num3 == 0 ? o1.getEnglish() - o2.getEnglish() : num3;
                int num5 = num4 == 0 ? o1.getName().compareTo(o2.getName())
                        : num4;
                return num5;

            }
        });

        // 键盘录入学生信息存储到集合
        for (int x = 1; x <= 5; x++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请录入第" + x + "个的学习信息");
            System.out.println("姓名：");
            String name = sc.nextLine();
            System.out.println("语文成绩：");
            int chinese = sc.nextInt();
            System.out.println("数学成绩：");
            int math = sc.nextInt();
            System.out.println("英语成绩：");
            int english = sc.nextInt();

            // 创建学生对象
            Student s = new Student();
            s.setName(name);
            s.setChinese(chinese);
            s.setMath(math);
            s.setEnglish(english);

            // 把学生信息添加到集合
            ts.add(s);
        }

        BufferedWriter bw = new BufferedWriter(new FileWriter("student.txt"));
        bw.write("学生信息如下：");
        bw.newLine();
        bw.flush();
        bw.write("姓名，语文成绩，数学成绩，英语成绩");
        bw.newLine();
        bw.flush();
        for (Student s : ts) {
            StringBuilder sb = new StringBuilder();
            sb.append(s.getName()).append(",").append(s.getChinese()).append(",").append(s.getMath()).append(",").append(s.getEnglish());
            bw.write(sb.toString());
            bw.newLine();
            bw.flush();
        }
        //释放资源
        bw.close();
        System.out.println("学习信息存储完毕！");
    }
}
