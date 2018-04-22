package ru.job4j.strategy;

/**
 * Created by User on 22.04.2018.
 */
public class Triangle implements Shape {
    @Override
    public String draw() {
        StringBuilder pic = new StringBuilder();
        pic.append("  +  " + "\n");
        pic.append(" + + " + "\n");
        pic.append("+   +" + "\n");
        pic.append("+++++" + "\n");
        return pic.toString();
    }
}
