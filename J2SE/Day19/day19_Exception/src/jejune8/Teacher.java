package jejune8;

/**
 * Created by Jejune on 2018/8/7.
 */
public class Teacher {
    public void check(int score) throws MyException{
        if (score>100||score<0) {
            System.out.println("分数必须在0-100之间！");
        }else {
            System.out.println("分数没有问题！");
        }
    }
}
