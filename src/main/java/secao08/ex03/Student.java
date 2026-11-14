/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package secao08.ex03;

/**
 *
 * @author gusta
 */
public class Student {

    public String name;
    public double grade1;
    public double grade2;
    public double grade3;

    public double calculateFinalGrade() {
        return grade1 + grade2 + grade3;
    }

    public double missingPoints() {
        if (calculateFinalGrade() < 60) {
            return 60 - calculateFinalGrade();
        } else {
            return 0.0;
        }

    }

    public String toString() {
        String resultado = String.format("FINAL GRADE = %.2f\n", calculateFinalGrade());

        if (calculateFinalGrade() >= 60.0) {
            resultado += "PASS";
        } else {
            resultado += "FAILED\n"
                    + String.format("MISSING %.2f POINTS", missingPoints());
        }
        return resultado;
    }

}
