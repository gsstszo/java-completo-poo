/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package secao08.ex02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author gusta
 */
public class Program {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
            
        Employee employee = new Employee();
        
        System.out.print("Enter the Name: ");
        employee.name = entrada.nextLine();
        
        System.out.print("Enter the Gross Salary: ");
        employee.grossSalary = entrada.nextDouble();
        
        System.out.print("Enter the Tax: ");
        employee.tax = entrada.nextDouble();
        
        System.out.println(employee);
        
        System.out.print("Which percentage to increase salary? ");
        double percentage = entrada.nextDouble();
        
        employee.increaseSalary(percentage);
        
        System.out.println(employee);
                
        entrada.close();
        
    }
    
}
