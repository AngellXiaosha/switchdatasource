package demo.switchdatasources7.service.impl;

import demo.switchdatasources7.dao.UserMapper;
import demo.switchdatasources7.datasource.TargetDataSource;
import demo.switchdatasources7.model.Ab;
import demo.switchdatasources7.model.Teacher;
import demo.switchdatasources7.model.user;
import demo.switchdatasources7.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lenovo
 * date 2019/7/18
 * 描述：
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private UserMapper userMapper;


    @Override
    //@TargetDataSource(name = "ds1")
    public void getUser() {
        System.out.println("11");
        List<demo.switchdatasources7.model.user> queryuser = userMapper.queryuser("1");
        System.out.println(queryuser);
    }


    @Override
    public void getTeacher() {
        List<Teacher> list = userMapper.getTeacher(1);
        System.out.println(list);


        List<Ab> ab = userMapper.getAb(1);
        System.out.println(ab);
    }

}
