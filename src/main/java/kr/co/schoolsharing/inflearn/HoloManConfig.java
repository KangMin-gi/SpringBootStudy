package kr.co.schoolsharing.inflearn;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(HolomanProperties.class)
public class HoloManConfig {

    /**
     * HolomanProperties를 받아서 사용한다.
     * 이는 외부에서 주입되는데 위의 enableconfigurati~~ 과 함께 해당 클래스에서 받아온다.
     * properties의 클래스에서는 application.properties를 사용할 수 있게 주입받는다.
     *
     * @param holomanProperties
     * @return
     */
    @Bean
    public HoloMan holoman(HolomanProperties holomanProperties) {
        HoloMan holoMan = new HoloMan();
        holoMan.setHowLong(holomanProperties.getAge());
        holoMan.setName(holomanProperties.getName());
        return holoMan;
    }
}
