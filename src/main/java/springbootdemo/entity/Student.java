package springbootdemo.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/9/20 0020.
 */
//把studen开头的所有属性映射进来
@ConfigurationProperties(prefix = "student")
//Spring注入
@Component
public class Student {
    private String age;
    private String name;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
