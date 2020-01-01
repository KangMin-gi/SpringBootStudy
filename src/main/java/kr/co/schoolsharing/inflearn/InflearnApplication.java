package kr.co.schoolsharing.inflearn;

import org.apache.catalina.Context;
import org.apache.catalina.startup.Tomcat;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.EnableAsync;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

@SpringBootApplication
public class InflearnApplication {

    public static void main(String[] args) throws Exception{
//        SpringApplication.run(InflearnApplication.class, args);
        SpringApplication app = new SpringApplication(InflearnApplication.class);
        app.setBanner(new Banner() {
            @Override
            public void printBanner(Environment environment, Class<?> sourceClass, PrintStream out) {
                System.out.println("--------------------------------asd---");
                System.out.println("굳모닝");
                System.out.println("-----------------------------------");

            }
        });
//        app.setBannerMode(Banner.Mode.OFF); // 배너 끄기 옵션

        // 빌더도 사용 가능 실행에
//        new SpringApplicationBuilder()
//                .sources(InflearnApplication.class)
//                .run(args);
        app.run(args);
    }

}





