package springbootdemo.dao;

import org.apache.ibatis.annotations.Select;
import springbootdemo.entity.User;

import java.util.List;


public interface UserDao {
    //注解方式
    @Select("select * from t_user where id=#{id}")
    public User selUserById(Integer id);
    //xml方式
    public List<User> selUserAll();
}
