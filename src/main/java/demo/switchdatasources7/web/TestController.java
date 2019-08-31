package demo.switchdatasources7.web;

import demo.switchdatasources7.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lenovo
 * date 2019/7/18
 * 描述：
 */
@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping(value="/")
    public void test1(){

        testService.getUser();

        testService.getTeacher();

    }
}
