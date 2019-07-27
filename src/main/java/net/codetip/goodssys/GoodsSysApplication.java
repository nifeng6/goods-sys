package net.codetip.goodssys;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "net.codetip.goodssys.mapper")
public class GoodsSysApplication {

    public static void main(String[] args) {
        SpringApplication.run(GoodsSysApplication.class, args);
    }

}
