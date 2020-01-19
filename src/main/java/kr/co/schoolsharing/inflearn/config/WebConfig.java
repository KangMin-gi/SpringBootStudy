package kr.co.schoolsharing.inflearn.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

 // ㅇ ㅣ어노테이션으로 MVC를 재정의 하게 된다.
@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/m/**")
        .addResourceLocations("classpath:/m/")
                .setCachePeriod(20);
    }
}
