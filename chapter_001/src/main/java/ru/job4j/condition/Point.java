package ru.job4j.condition;

/**
 * @author skrasavin
 * @since 21.03.2018
 */
public class Point {
    private int x;
    private int y;
    /**
     * конструктор класса.
     * @param - x, y
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * метод для нахождения расстояния между двумя точками.
     * @param - that.
     * @return.
     */
    public double distanceTo(Point that) {
        return Math.sqrt(
                Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2)
        );
    }

    /**
     * метод main, в котором создаётся две точки.
     * @param args
     */
    public static void main(String[] args) {
        Point a = new Point(0, 1);
        Point b = new Point(2, 5);

        System.out.println("x1 = " + a.x);
        System.out.println("y1 = " + a.y);
        System.out.println("x2 = " + b.x);
        System.out.println("y2 = " + b.y);

        double result = a.distanceTo(b);
        System.out.println("Расстояние между точками А и В : " + result);
    }
}