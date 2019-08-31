package demo.switchdatasources7.dao;

import java.util.List;

import demo.switchdatasources7.datasource.TargetDataSource;
import demo.switchdatasources7.model.Ab;
import demo.switchdatasources7.model.Teacher;
import demo.switchdatasources7.model.user;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

/**
 * @author author
 */
@Mapper
public interface UserMapper {


    @Select("select * from user where id=#{id}")
    List<user> queryuser(String s);


    @TargetDataSource(name = "ds1")
    @Select("select * from Teacher where tid=1")
    List<Teacher> getTeacher(int i);

    @TargetDataSource(name = "2a")
    @Select("select * from aa where a=#{a}")
    List<Ab> getAb(int i);
}