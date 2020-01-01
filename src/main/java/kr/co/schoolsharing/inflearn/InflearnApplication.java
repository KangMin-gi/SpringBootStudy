package kr.co.schoolsharing.inflearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
//@ComponentScan
//@EnableAutoConfiguration
//@SpringBootConfiguration
public class InflearnApplication {

    public static void main(String[] args) {
        SpringApplication.run(InflearnApplication.class, args);

        /* //
        SpringApplication app = new SpringApplication(InflearnApplication.class);
        app.setWebApplicationType(WebApplicationType.NONE);
        app.run(args);
         */

    }

}





