package pojo;

/**
 * Created by Jejune on 2018/8/14.
 */

/**
 * @author jejune
 * @version V1.1
 */
public class User {
    //用户名
    private String username;
    //密码
    private String password;

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
