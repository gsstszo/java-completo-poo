package secao08.membrosEstaticos1;

public class Calculator {

    public static final double PI = 3.14169;

    public static double circumference(double radius) {
        return 2.0 * PI * radius;
    }

    public static double volume(double radius) {
        return 4.0 * PI * radius * radius * radius / 3.0;
    }
}
