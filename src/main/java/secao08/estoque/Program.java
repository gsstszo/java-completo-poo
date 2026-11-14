/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package secao08.estoque;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = entrada.nextLine();
        System.out.print("Price: ");
        product.price = entrada.nextDouble();
        System.out.print("Quantity: ");
        product.quantity = entrada.nextInt();

        System.out.println();
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
