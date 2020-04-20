package jejune2;

/*
 * public static boolean isUpperCase(char ch):判断给定的字符是否是大写字符
 * public static boolean isLowerCase(char ch):判断给定的字符是否是小写字符
 * public static boolean isDigit(char ch):判断给定的字符是否是数字字符
 * public static char toUpperCase(char ch):把给定的字符转换为大写字符
 * public static char toLowerCase(char ch):把给定的字符转换为小写字符
 */
public class CharacterDemo {
    public static void main(String[] args) {
        // public static boolean isUpperCase(char ch):判断给定的字符是否是大写字符
        System.out.println("isUpperCase:" + Character.isUpperCase('A'));
        System.out.println("isUpperCase:" + Character.isUpperCase('a'));
        System.out.println("isUpperCase:" + Character.isUpperCase('0'));
        System.out.println("-----------------------------------------");
        // public static boolean isLowerCase(char ch):判断给定的字符是否是小写字符
        System.out.println("isLowerCase:" + Character.isLowerCase('A'));
        System.out.println("isLowerCase:" + Character.isLowerCase('a'));
        System.out.println("isLowerCase:" + Character.isLowerCase('0'));
        System.out.println("-----------------------------------------");
        // public static boolean isDigit(char ch):判断给定的字符是否是数字字符
        System.out.println("isDigit:" + Character.isDigit('A'));
        System.out.println("isDigit:" + Character.isDigit('a'));
        System.out.println("isDigit:" + Character.isDigit('0'));
        System.out.println("-----------------------------------------");
        // public static char toUpperCase(char ch):把给定的字符转换为大写字符
        System.out.println("toUpperCase:" + Character.toUpperCase('A'));
        System.out.println("toUpperCase:" + Character.toUpperCase('a'));
        System.out.println("-----------------------------------------");
        // public static char toLowerCase(char ch):把给定的字符转换为小写字符
        System.out.println("toLowerCase:" + Character.toLowerCase('A'));
        System.out.println("toLowerCase:" + Character.toLowerCase('a'));
    }
}

/*
I:\Java\jdk-10.0.2\bin\java.exe "-javaagent:E:\IntelliJ IDEA 2018.2\lib\idea_rt.jar=8591:E:\IntelliJ IDEA 2018.2\bin" -Dfile.encoding=UTF-8 -classpath I:\Java\J2SE\Day13\day13_Character\out\production\day13_Character jejune2.CharacterDemo
isUpperCase:true
isUpperCase:false
isUpperCase:false
-----------------------------------------
isLowerCase:false
isLowerCase:true
isLowerCase:false
-----------------------------------------
isDigit:false
isDigit:false
isDigit:true
-----------------------------------------
toUpperCase:A
toUpperCase:A
-----------------------------------------
toLowerCase:a
toLowerCase:a

Process finished with exit code 0

 */