package kr.co.schoolsharing.inflearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
public class InflearnApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(InflearnApplication.class);
        app.setWebApplicationType(WebApplicationType.NONE);
        app.run(args);
//        SpringApplication.run(InflearnApplication.class, args);
    }

}
