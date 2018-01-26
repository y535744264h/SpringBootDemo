package springbootdemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springbootdemo.dao.HibernateDao;
import springbootdemo.dao.UserDao;
import springbootdemo.entity.HibernateCreateTest;
import springbootdemo.entity.Student;

import java.util.List;

@RestController
public class DemoController {

    @Value("${testString}")
    private String testString;

    @Autowired
    private Student student;

    @Autowired
    HibernateDao hibernateDao;

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    UserDao userDao;

    @RequestMapping("sayHi")
    public String sayHi(){
        return  testString+student.getName();
    }
    //等于RequestMapping methad=get 也有PostMapping
    @GetMapping("/showAll")
    public List<HibernateCreateTest> showList(){
        return hibernateDao.findAll();
    }

    /**
     * 增删改查.....
     */

    @GetMapping("/userByid")
    public String selUserById(Integer id){
            return userDao.selUserById(id).getAccount();
    }

    @GetMapping("/userAll")
    public String selUserAll(){
        logger.info("测试Log开始14"+"aaaa");
        return userDao.selUserAll().size()+"";
    }
}
