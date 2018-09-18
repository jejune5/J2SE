package jejune1;

/*
 * Character 类在对象中包装一个基本类型 char 的值
 * 此外，该类提供了几种方法，以确定字符的类别（小写字母，数字，等等），并将字符从大写转换成小写，反之亦然
 *
 * 构造方法：
 * 		Character(char value)
 */
public class CharacterDemo {
    public static void main(String[] args) {
        // 创建对象
        // Character ch = new Character((char) 97);
        Character ch = new Character('a');
        System.out.println("ch:" + ch);
    }
}
/*
I:\Java\jdk-10.0.2\bin\java.exe "-javaagent:E:\IntelliJ IDEA 2018.2\lib\idea_rt.jar=8578:E:\IntelliJ IDEA 2018.2\bin" -Dfile.encoding=UTF-8 -classpath I:\Java\J2SE\Day13\day13_Character\out\production\day13_Character jejune1.CharacterDemo
ch:a

Process finished with exit code 0

 */