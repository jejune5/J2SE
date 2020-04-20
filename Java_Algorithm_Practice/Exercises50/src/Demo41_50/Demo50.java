package Demo41_50;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Jejune on 2018/8/16.
 */
/*
【程序50】题目：有五个学生，每个学生有3门课的成绩，从键盘输入以上数据（包括学生号，姓名，三门课成绩），计算出平均成绩，
           把原有的数据和计算出的平均分数存放在磁盘文import java.io.File;
 */
public class Demo50 {
    public static void main(String[] args) throws IOException {
        ArrayList<Student> list = new ArrayList<Student>();
        FileWriter fw = new FileWriter("student.txt");

        //键盘录入信息到集合
        for (int x = 1; x <= 5; x++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请录入第" + x + "个学生信息：");


            System.out.println("姓名：");
            String name = sc.nextLine();

            System.out.println(" 学号：");
            int number = sc.nextInt();



            System.out.println("语文成绩：");
            int chn = sc.nextInt();
            System.out.println("数学成绩：");
            int math = sc.nextInt();
            System.out.println("英语成绩：");
            int english = sc.nextInt();

            //创建学生对象
            Student s = new Student();
            s.setNumber(number);
            s.setName(name);
            s.setChn(chn);
            s.setMath(math);
            s.setEn(english);
            s.ave();

            //把学生信息添加到集合
            list.add(s);
        }

        BufferedWriter bw = new BufferedWriter(new FileWriter("student.txt"));
        bw.write("学生信息如下：");
        bw.newLine();
        bw.flush();
        bw.write("学生学号，姓名，语文，数学，英语，三门平均：");
        bw.newLine();
        bw.flush();
        for (Student s : list) {
            bw.write(s.getNumber() + "," + s.getName() + "," + s.getChn() + "," +
                    s.getMath() + "," + s.getEn() + "," + s.ave());
            bw.newLine();
            bw.flush();
        }

        bw.close();
        System.out.println("学生信存储完毕！");
    }
}

/*
学生信息如下：
学生学号，姓名，语文，数学，英语，三门平均：
9527,茅敏敏,98,97,97,97.333336
9558,徐涛,12,16,14,14.0
9529,范于,56,54,52,54.0
9530,吴亦凡,64,67,61,64.0
9531,吴彦祖,89,98,100,95.666664

 */