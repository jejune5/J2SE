package jejune1;

/**
 * Created by Jejune on 2018/7/24.
 */
public class Student {
    private String name ;
    private int age ;

    //构造
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }


    // 成员方法
    // getXxx()/setXxx()
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
