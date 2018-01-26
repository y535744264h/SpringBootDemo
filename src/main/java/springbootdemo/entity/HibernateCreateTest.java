package springbootdemo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Administrator on 2017/9/20 0020.
 */
@Entity
public class HibernateCreateTest {
    //Id
    @Id
    //自增
    @GeneratedValue
    private int id;
    private String demo;
}
