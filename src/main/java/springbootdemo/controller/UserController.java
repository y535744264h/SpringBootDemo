package springbootdemo.controller;

import com.alibaba.druid.support.logging.Log;
import com.alibaba.druid.support.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/9/21 0021.
 */
@Controller
@RequestMapping("/user")
public class UserController {

   Log log = LogFactory.getLog(getClass());

    @RequestMapping("/testJsp")
    public String testJsp(Model model){
        model.addAttribute("name", "Dear");
       return "index";
    }
}
