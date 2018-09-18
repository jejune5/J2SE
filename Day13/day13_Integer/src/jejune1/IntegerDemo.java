package jejune1;

/*
 * 需求1：我要求大家把100这个数据的二进制，八进制，十六进制计算出来
 * 需求2：我要求大家判断一个数据是否是int范围内的。
 * 		首先你的知道int的范围是多大?
 *
 * 为了对基本数据类型进行更多的操作，更方便的操作，Java就针对每一种基本数据类型提供了对应的类类型。包装类类型。
 * byte 			Byte
 * short			Short
 * int				Integer
 * long				Long
 * float			Float
 * double			Double
 * char				Character
 * boolean			Boolean
 *
 * 用于基本数据类型与字符串之间的转换。
 */
public class IntegerDemo {
    public static void main(String[] args) {
        // 不麻烦的就来了
        // public static String toBinaryString(int i)
        System.out.println(Integer.toBinaryString(100));
        // public static String toOctalString(int i)
        System.out.println(Integer.toOctalString(100));
        // public static String toHexString(int i)
        System.out.println(Integer.toHexString(100));

        // public static final int MAX_VALUE
        System.out.println(Integer.MAX_VALUE);
        // public static final int MIN_VALUE
        System.out.println(Integer.MIN_VALUE);
    }
}
/*
I:\Java\jdk-10.0.2\bin\java.exe "-javaagent:E:\IntelliJ IDEA 2018.2\lib\idea_rt.jar=8634:E:\IntelliJ IDEA 2018.2\bin" -Dfile.encoding=UTF-8 -classpath I:\Java\J2SE\Day13\day13_Integer\out\production\day13_Integer jejune1.IntegerDemo
1100100
144
64
2147483647
-2147483648

Process finished with exit code 0

 */