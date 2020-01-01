package kr.co.schoolsharing.inflearn;

/**
 *
 */

public class HoloMan {
    String name;
    int howLong;

    public int getHowLong() {
        return howLong;
    }

    public void setHowLong(int howLong) {
        this.howLong = howLong;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "HoloMan{" +
                "name='" + name + '\'' +
                ", howLong=" + howLong +
                '}';
    }
}
