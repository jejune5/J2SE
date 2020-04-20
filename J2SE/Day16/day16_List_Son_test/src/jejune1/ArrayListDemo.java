package jejune1;

import java.util.ArrayList;

/**
 * Created by Jejune on 2018/7/28.
 */
/*
 * 集合的嵌套遍历
 * 需求：
 * 		我们班有学生，每一个学生是不是一个对象。所以我们可以使用一个集合表示我们班级的学生。ArrayList<Student>
 * 		但是呢，我们旁边是不是还有班级，每个班级是不是也是一个ArrayList<Student>。
 * 		而我现在有多个ArrayList<Student>。也要用集合存储，怎么办呢?
 * 		就是这个样子的：ArrayList<ArrayList<Student>>
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        //创建大集合
        ArrayList<ArrayList<Student>> bigArrayList = new ArrayList<ArrayList<Student>>();

        // 创建第一个班级的学生集合
        ArrayList<Student> firstArrayList = new ArrayList<Student>();

        //创建一班集合
        Student s1 = new Student("唐僧", 16);
        Student s2 = new Student("孙悟空", 29);
        Student s3 = new Student("猪八戒", 28);
        Student s4 = new Student("沙僧", 27);
        Student s5 = new Student("白龙马", 26);

        // 学生进班
        firstArrayList.add(s1);
        firstArrayList.add(s2);
        firstArrayList.add(s3);
        firstArrayList.add(s4);
        firstArrayList.add(s5);

        // 把第一个班级存储到学生系统中
        bigArrayList.add(firstArrayList);

        //创建第二个班级的学生集合
// 创建第二个班级的学生集合
        ArrayList<Student> secondArrayList = new ArrayList<Student>();
        // 创建学生
        Student s11 = new Student("诸葛亮", 30);
        Student s22 = new Student("司马懿", 28);
        Student s33 = new Student("周瑜", 26);
        // 学生进班
        secondArrayList.add(s11);
        secondArrayList.add(s22);
        secondArrayList.add(s33);
        // 把第二个班级存储到学生系统中
        bigArrayList.add(secondArrayList);

        // 创建第三个班级的学生集合
        ArrayList<Student> thirdArrayList = new ArrayList<Student>();
        // 创建学生
        Student s111 = new Student("宋江", 40);
        Student s222 = new Student("吴用", 35);
        Student s333 = new Student("高俅", 30);
        Student s444 = new Student("李师师", 22);
        // 学生进班
        thirdArrayList.add(s111);
        thirdArrayList.add(s222);
        thirdArrayList.add(s333);
        thirdArrayList.add(s444);
        // 把第三个班级存储到学生系统中
        bigArrayList.add(thirdArrayList);

        //遍历集合
        for (ArrayList<Student> array : bigArrayList) {
            for (Student s : array) {
                System.out.println(s.getName() + "---" + s.getAge());
            }
        }
    }
}

/*
G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7532 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\IDEA_code\Day16\day16_List_Son_test\out\production\day16_List_Son_test;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain jejune1.ArrayListDemo
唐僧---16
孙悟空---29
猪八戒---28
沙僧---27
白龙马---26
诸葛亮---30
司马懿---28
周瑜---26
宋江---40
吴用---35
高俅---30
李师师---22

Process finished with exit code 0

 */