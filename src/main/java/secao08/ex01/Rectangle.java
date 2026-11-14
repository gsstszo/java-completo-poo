/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package secao08.ex01;

/**
 *
 * @author gusta
 */
public class Rectangle {

    public double width;
    public double height;

    public double Area() {
        return width * height;
    }

    public double Perimeter() {
        return 2 * (width + height);
    }

    public double Diagonal() {
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));

    }
    
    public String toString(){
            return "Area: "
                    + String.format("%.2f\n", Area())
                    + "Perimeter: "
                    + String.format("%.2f\n", Perimeter())
                    + "Diagonal: "
                    + String.format("%.2f", Diagonal());
    }
}
