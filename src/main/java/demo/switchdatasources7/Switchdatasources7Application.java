package demo.switchdatasources7;

import demo.switchdatasources7.datasource.DynamicDataSourceRegister;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({DynamicDataSourceRegister.class})
@MapperScan("demo.switchdatasources7.dao")
public class Switchdatasources7Application {

    public static void main(String[] args) {
        SpringApplication.run(Switchdatasources7Application.class, args);
    }

}
