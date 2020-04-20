package dao;

public interface UserDao {
    /**
     * 查询所有
     */
    void findAll();

    void login(String username,String password);

    /**
     * 执行添加
     * @param username
     * @param password
     */
    void insert(String username , String password);
}
