package jejune3;

/*
 * int类型和String类型的相互转换
 *
 * int -- String
 * 		String.valueOf(number)
 *
 * String -- int
 * 		Integer.parseInt(s)
 */
public class IntegerDemo {
    public static void main(String[] args) {
        // int -- String
        int number = 100;
        // 方式1
        String s1 = "" + number;
        System.out.println("s1:" + s1);
        // 方式2
        String s2 = String.valueOf(number);
        System.out.println("s2:" + s2);
        // 方式3
        // int -- Integer -- String
        Integer i = new Integer(number);
        String s3 = i.toString();
        System.out.println("s3:" + s3);
        // 方式4
        // public static String toString(int i)
        String s4 = Integer.toString(number);
        System.out.println("s4:" + s4);
        System.out.println("-----------------");

        // String -- int
        String s = "100";
        // 方式1
        // String -- Integer -- int
        Integer ii = new Integer(s);
        // public int intValue()
        int x = ii.intValue();
        System.out.println("x:" + x);
        //方式2
        //public static int parseInt(String s)
        int y = Integer.parseInt(s);
        System.out.println("y:"+y);
    }
}
/*
I:\Java\jdk-10.0.2\bin\java.exe "-javaagent:E:\IntelliJ IDEA 2018.2\lib\idea_rt.jar=8680:E:\IntelliJ IDEA 2018.2\bin" -Dfile.encoding=UTF-8 -classpath I:\Java\J2SE\Day13\day13_Integer\out\production\day13_Integer jejune3.IntegerDemo
s1:100
s2:100
s3:100
s4:100
-----------------
x:100
y:100

Process finished with exit code 0

 */
