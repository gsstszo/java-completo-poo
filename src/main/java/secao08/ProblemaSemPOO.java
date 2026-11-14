package secao08;

import java.util.Scanner;

public class ProblemaSemPOO {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double xA, xB, xC, yA, yB, yC;
        
        System.out.println("Enter the measures of triangle X: ");
        xA = entrada.nextDouble();
        xB = entrada.nextDouble();
        xC = entrada.nextDouble();
        
        System.out.println("Enter the measures of triangle Y: ");
        yA = entrada.nextDouble();
        yB = entrada.nextDouble();
        yC = entrada.nextDouble();
        
        double p = (xA + xB + xC) / 2.0;
        double areax = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
        p = (yA + yB + yC) / 2.0;
        double areay = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
        
        System.out.printf("Triangle X area: %.4f\n",areax);
        System.out.printf("Triangle Y area: %.4f\n",areay);
        
        if(areax > areay){
            System.out.println("Larger area: X");
        }else{
            System.out.println("Larger area: Y");
        }
           
        
        
        
        
    }
}
