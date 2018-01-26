package springbootdemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import springbootdemo.entity.HibernateCreateTest;

/**
 * Created by Administrator on 2017/9/20 0020.
 */
public interface HibernateDao  extends JpaRepository<HibernateCreateTest,Integer>{
}
