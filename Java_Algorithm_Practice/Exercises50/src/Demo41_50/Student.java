package Demo41_50;

/**
 * Created by Jejune on 2018/8/16.
 */
public class Student {
    private int number;
    private String name;
    private int Chn;
    private int Math;
    private int En;

    public Student() {
    }

    public Student(int number, String name, int chn, int math, int en) {
        this.number = number;
        this.name = name;
        Chn = chn;
        Math = math;
        En = en;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChn() {
        return Chn;
    }

    public void setChn(int chn) {
        Chn = chn;
    }

    public int getMath() {
        return Math;
    }

    public void setMath(int math) {
        Math = math;
    }

    public int getEn() {
        return En;
    }

    public void setEn(int en) {
        En = en;
    }

    public float ave() {
        float sum = (float) this.Chn + (float) this.Math + (float) this.En;
        float average = sum / 3;
        return average;
    }
}
