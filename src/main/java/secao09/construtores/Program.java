package secao09.construtores;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = entrada.nextLine();
        System.out.print("Price: ");
        double price = entrada.nextDouble();

        Product product = new Product(name, price);
        
        
        System.out.println("Product data: " + product);

        System.out.println();
        System.out.println("Enter the number of products to be added in stock: ");
        int quantity = entrada.nextInt();
        product.addProducts(quantity);

        System.out.println("Update data: " + product);

        System.out.println();
        System.out.println("Enter the number of products to be removed in stock: ");
        quantity = entrada.nextInt();
        product.removeProducts(quantity);

        System.out.println("Update data" + product);
        entrada.close();
    }

}
