package secao08;

import java.util.Scanner;

public class ProblemaPOO {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle X: ");
        x.a = entrada.nextDouble();
        x.b = entrada.nextDouble();
        x.c = entrada.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        y.a = entrada.nextDouble();
        y.b = entrada.nextDouble();
        y.c = entrada.nextDouble();

        double areax = x.area();
        double areay = y.area();

        System.out.printf("Triangle X area: %.4f\n", areax);
        System.out.printf("Triangle Y area: %.4f\n", areay);

        if (areax > areay) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }
    }
}
