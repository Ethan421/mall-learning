package com.macro.mall.tiny;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MallTinyApplication {

    public static void main(String[] args) {
        //Authorize --> login --> bearer <token>
        LoggerFactory.getLogger(MallTinyApplication.class).info("http://localhost:8080/swagger-ui.html");
        SpringApplication.run(MallTinyApplication.class, args);
    }

}
