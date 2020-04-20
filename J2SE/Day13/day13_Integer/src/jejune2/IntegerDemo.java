package jejune2;

/*
 * Integer的构造方法：
 * public Integer(int value)
 * public Integer(String s)
 * 		注意：这个字符串必须是由数字字符组成
 */
public class IntegerDemo {
    public static void main(String[] args) {
        // 方式1
        int i = 100;
        Integer ii = new Integer(i);
        System.out.println("ii:" + ii);

        // 方式2
        String s = "100";
        // NumberFormatException
        // String s = "abc";
        Integer iii = new Integer(s);
        System.out.println("iii:" + iii);
    }
}
/*
I:\Java\jdk-10.0.2\bin\java.exe "-javaagent:E:\IntelliJ IDEA 2018.2\lib\idea_rt.jar=8650:E:\IntelliJ IDEA 2018.2\bin" -Dfile.encoding=UTF-8 -classpath I:\Java\J2SE\Day13\day13_Integer\out\production\day13_Integer jejune2.IntegerDemo
ii:100
iii:100

Process finished with exit code 0

 */