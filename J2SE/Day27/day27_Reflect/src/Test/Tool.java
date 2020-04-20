package Test;

import java.lang.reflect.Field;

/**
 * Created by Jejune on 2018/7/14.
 */
public class Tool {
    public void setProperty(Object obj, String propertyName, Object value) throws NoSuchFieldException, IllegalAccessException {

        //根据对象获取字节码文件对象
        Class c = obj.getClass();
        //获取该对象的PropertyName成员变量
        Field field = c.getDeclaredField(propertyName);
        //取消访问检查
        field.setAccessible(true);
        //给对象的成员变量赋指定值
        field.set(obj, value);
    }

}
