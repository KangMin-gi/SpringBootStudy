package kr.co.schoolsharing.inflearn;

import org.apache.catalina.Context;
import org.apache.catalina.startup.Tomcat;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@SpringBootApplication
public class InflearnApplication {

    public static void main(String[] args) throws Exception{
//        SpringApplication.run(InflearnApplication.class, args);
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(53340);

        Context context = tomcat.addContext("/", "/");
        HttpServlet httpServlet = new HttpServlet() {
            @Override
            protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                PrintWriter writer = resp.getWriter();
                writer.println("<html><head><title>");
                writer.println("HEY, TOMCAT");
                writer.println("</title></head>");
                writer.println("<body><h1>hello tomcat</h1><body>");
                writer.println("</html>");
            }
        };
        String servletName = "helloServlet";
        tomcat.addServlet("/", servletName, httpServlet);
        context.addServletMappingDecoded("/hello", servletName);
        tomcat.start();
//        tomcat.getServer().await();
    }

}





