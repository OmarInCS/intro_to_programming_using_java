package day8;

import java.time.LocalTime;

public class Shape {
    private String color;
    private LocalTime timeCreated;

    public Shape(String color) {
        this.color = color;
        this.timeCreated = LocalTime.now();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public LocalTime getTimeCreated() {
        return timeCreated;
    }


}
