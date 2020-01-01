package kr.co.schoolsharing.inflearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleRunner implements ApplicationRunner {

    private Logger log = LoggerFactory.getLogger(SampleRunner.class);

    @Qualifier("AAAProperties")
    @Autowired
    AAAProperties aaaProperties;

    @Override
    public void run(ApplicationArguments args) {
        log.debug("-----------------------------------------");
        log.debug("DEBUG");
        log.debug("-----------------------------------------");

        log.info("-----------------------------------------");
        log.info("INFO");
        log.info("-----------------------------------------");

        System.out.println("-----------------------------------------");
        System.out.println(aaaProperties.getSessionTimeout());
        System.out.println(aaaProperties.getAge());
        System.out.println(aaaProperties.getName());
        System.out.println(aaaProperties.getFullName());
        System.out.println("-----------------------------------------");
    }
}
