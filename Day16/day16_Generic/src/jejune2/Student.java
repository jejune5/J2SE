package jejune2;

/**
 * Created by Jejune on 2018/7/26.
 */
/**
 * 这是学生描述类
 *
 * @author Jejune
 * @version V1.0
 */
public class Student {
    private String name ;
    private int age ;

    public Student() {
        super();
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
