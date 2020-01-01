package kr.co.schoolsharing.inflearn;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * 변수명을 사용하는 프로젝트이ㅡ application.propertieㄴ와 맞게 맞춰야 할것같다.
 */

@ConfigurationProperties("holoman")
public class HolomanProperties {

    private String name;
    private int age;


    @Override
    public String toString() {
        return "HolomanProperties{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
