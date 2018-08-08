package jejune1;

/**
 * Created by Jejune on 2018/7/24.
 */
/*
 * 我有5个学生，请把这个5个学生的信息存储到数组中，并遍历数组，获取得到每一个学生信息。
 *		 学生：Student
 *		 成员变量：name,age
 *		 构造方法：无参,带参
 *		 成员方法：getXxx()/setXxx()
 *		 存储学生的数组?自己想想应该是什么样子的?
 * 分析：
 * 		A:创建学生类。
 * 		B:创建学生数组(对象数组)。
 * 		C:创建5个学生对象，并赋值。
 * 		D:把C步骤的元素，放到数组中。
 * 		E:遍历学生数组。
 */
public class ObjectArrayDemo {
    public static void main(String[] args) {
        //B
        Student[] students = new Student[5];
        // for (int x = 0; x < students.length; x++) {
        // System.out.println(students[x]);
        // }
        // System.out.println("---------------------");

        // 创建5个学生对象，并赋值。
        Student s1 = new Student("mmm", 27);
        Student s2 = new Student("www", 30);
        Student s3 = new Student("aaa", 30);
        Student s4 = new Student("sss", 60);
        Student s5 = new Student("ddd", 35);

        // 把C步骤的元素，放到数组中。
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        students[3] = s4;
        students[4] = s5;

        //遍历
        for (int x = 0; x < students.length; x++) {
            Student s = students[x];
            System.out.println(s.getName() + "---" + s.getAge());
        }
    }
}

/*
G:\Java\jdk1.8.0_162\bin\java -Didea.launcher.port=7532 "-Didea.launcher.bin.path=G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\bin" -Dfile.encoding=UTF-8 -classpath "G:\Java\jdk1.8.0_162\jre\lib\charsets.jar;G:\Java\jdk1.8.0_162\jre\lib\deploy.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\access-bridge-64.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\cldrdata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\dnsns.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jaccess.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\jfxrt.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\localedata.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\nashorn.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunec.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunjce_provider.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunmscapi.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\sunpkcs11.jar;G:\Java\jdk1.8.0_162\jre\lib\ext\zipfs.jar;G:\Java\jdk1.8.0_162\jre\lib\javaws.jar;G:\Java\jdk1.8.0_162\jre\lib\jce.jar;G:\Java\jdk1.8.0_162\jre\lib\jfr.jar;G:\Java\jdk1.8.0_162\jre\lib\jfxswt.jar;G:\Java\jdk1.8.0_162\jre\lib\jsse.jar;G:\Java\jdk1.8.0_162\jre\lib\management-agent.jar;G:\Java\jdk1.8.0_162\jre\lib\plugin.jar;G:\Java\jdk1.8.0_162\jre\lib\resources.jar;G:\Java\jdk1.8.0_162\jre\lib\rt.jar;G:\Java\IDEA_code\Day15\day15_ObjectArray\out\production\day15_ObjectArray;G:\Java\IntelliJ IDEA 16\IntelliJ IDEA 2016.1\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain jejune1.ObjectArrayDemo
mmm---27
www---30
aaa---30
sss---60
ddd---35

Process finished with exit code 0

 */