package kr.co.schoolsharing.inflearn;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ListenerConfig implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("FOO : " + args.containsOption("foo"));
        System.out.println("BAR : " + args.containsOption("bar"));
    }
}
