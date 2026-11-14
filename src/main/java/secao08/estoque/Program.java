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
        
        System.out.println(product.name + ", " + product.price + ", " + product.quantity);
        
        entrada.close();
    }

}
