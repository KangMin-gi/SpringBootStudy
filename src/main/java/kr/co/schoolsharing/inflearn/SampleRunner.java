package kr.co.schoolsharing.inflearn;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleRunner implements ApplicationRunner {

    @Value("${aaa.name}")
    private String name;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(this.name);
    }
}
