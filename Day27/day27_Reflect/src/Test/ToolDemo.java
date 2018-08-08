package Test;


/**
 * Created by Jejune on 2018/7/14.
 */
public class ToolDemo {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        Person p = new Person();
        Tool t = new Tool();
        t.setProperty(p, "name", "茅敏敏");
        t.setProperty(p, "age", 20);
        System.out.println(p);
    }
}

class Person {
    private String name;
    private int age;

    @Override
    public String toString() {
        return name + "---" + age;
    }
}
