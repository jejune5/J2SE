package jejune8;

/**
 * Created by Jejune on 2018/8/2.
 */
public class Student {
    //姓名
    private String name;
    //语文
    private int chinese;
    //数学
    private int math;
    //英语
    private int eglish;

    public Student(String name, int chinese, int math, int eglish) {
        super();
        this.name = name;
        this.chinese = chinese;
        this.math = math;
        this.eglish = eglish;
    }

    public Student() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEnglish() {
        return eglish;
    }

    public void setEnglish(int english) {
        this.eglish = eglish;
    }

    public int getSum() {
        return this.chinese + this.math + this.eglish;
    }


}

