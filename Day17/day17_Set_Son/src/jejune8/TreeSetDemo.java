package jejune8;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by Jejune on 2018/8/3.
 */
/*
 * 键盘录入5个学生信息(姓名,语文成绩,数学成绩,英语成绩),按照总分从高到低输出到控制台
 *
 * 分析：
 * 		A:定义学生类
 * 		B:创建一个TreeSet集合
 * 		C:总分从高到底如何实现呢?
 * 		D:键盘录入5个学生信息
 * 		E:遍历TreeSet集合
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        //创建一个TreeSet对象
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //总分从高到低
                int num = o1.getSum() - o2.getSum();
                //总分相同按语文
                int num2 = num == 0 ? o1.getChinese() - o2.getChinese() : num;
                //语文同按数学
                int num3 = num2 == 0 ? o1.getMath() - o2.getMath() : num2;
                //数学同按英语
                int num4 = num3 == 0 ? o1.getEnglish() - o2.getEnglish() : num3;
                //按姓名
                int num5 = num4 == 0 ? o1.getName().compareTo(o2.getName()) : num4;

                return 0;
            }
        });

        System.out.println("开始录入学生信息");
        for (int x = 0; x <= 5; x++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入第" + x + "个学生的姓名:");
            String name = sc.nextLine();
            System.out.println("请输入第" + x + "个学生的语文成绩:");
            String chineseString = sc.nextLine();
            System.out.println("请输入第" + x + "个学生的数学成绩:");
            String mathString = sc.nextLine();
            System.out.println("请输入第" + x + "个学生的英语成绩:");
            String englishString = sc.nextLine();

            //把数据封装到集合中
            Student s = new Student();
            s.setName(name);
            s.setChinese(Integer.parseInt(chineseString));
            s.setMath(Integer.parseInt(mathString));
            s.setEnglish(Integer.parseInt(englishString));

            // 把学生对象添加到集合
            ts.add(s);
        }
        System.out.println("学生信息录入完毕！");
        System.out.println("姓名\t语文成绩\t数学成绩\t英语成绩");
        // 遍历集合
        for (Student s : ts) {
            System.out.println(s.getName() + "\t" + s.getChinese() + "\t"
                    + s.getMath() + "\t" + s.getEnglish());
        }

    }

}

/*
G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7532 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\IDEA_code\Day17\day17_Set_Son\out\production\day17_Set_Son;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain jejune8.TreeSetDemo
开始录入学生信息
请输入第0个学生的姓名:
茅敏敏
请输入第0个学生的语文成绩:
90
请输入第0个学生的数学成绩:
86
请输入第0个学生的英语成绩:
98
请输入第1个学生的姓名:

 */