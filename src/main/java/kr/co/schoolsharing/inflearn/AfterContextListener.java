package kr.co.schoolsharing.inflearn;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class AfterContextListener implements ApplicationListener<ApplicationStartedEvent> {

    @Override
    public void onApplicationEvent(ApplicationStartedEvent event) {
        System.out.println("----------------------------------------------");
        System.out.println("Application ENDSTART");
        System.out.println("----------------------------------------------");
    }
}
