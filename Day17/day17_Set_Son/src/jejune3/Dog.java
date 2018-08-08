package jejune3;

/**
 * Created by Jejune on 2018/7/30.
 */
public class Dog {
    private String name;
    private int age;
    private String color;
    private char sex;

    public Dog() {
        super();
    }

    public Dog(String name, int age, String color, char sex) {
        super();
        this.name = name;
        this.age = age;
        this.color = color;
        this.sex = sex;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dog dog = (Dog) o;

        if (age != dog.age) return false;
        if (sex != dog.sex) return false;
        if (name != null ? !name.equals(dog.name) : dog.name != null) return false;
        return color != null ? color.equals(dog.color) : dog.color == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + (int) sex;
        return result;
    }
}
