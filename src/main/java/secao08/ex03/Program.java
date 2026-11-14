/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package secao08.ex03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author gusta
 */
public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Enter the name: ");
        student.name = sc.nextLine();

        System.out.println("Enter the first grade: ");
        student.grade1 = sc.nextDouble();

        System.out.println("Enter the first grade: ");
        student.grade2 = sc.nextDouble();

        System.out.println("Enter the first grade: ");
        student.grade3 = sc.nextDouble();
        
        System.out.println(student);
        
    }
}
