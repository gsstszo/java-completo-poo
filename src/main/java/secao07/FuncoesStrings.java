/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package secao07;

/**
 *
 * @author gusta
 */
public class FuncoesStrings {
    
    public static void main(String[] args) {
        
        String original = "abcde FGHIJ ABC abc DEFG   ";
        
        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();
        String s04 = original.substring(2);
        String s05 = original.substring(2, 9);
        String s06 = original.replace('a', 'x');
        String s07 = original.replace("abc", "yx");
        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");
        
        
        System.out.println("Original: -" + original + "-");
        System.out.println("toLowerCase: -" + s01 + "-");
        System.out.println("toUpperCase: -" + s02 + "-");
        System.out.println("trim: -" + s03 + "-");
        System.out.println("substring(2): -" + s04 + "-");
        System.out.println("substring(2, 9): -" + s05 + "-");
        System.out.println("replace('a', 'x'): -" + s06 + "-");
        System.out.println("replace('abc', 'yx''): -" + s07 + "-");
        System.out.println("indexOF 'bc':  " + i);
        System.out.println("lastIndexOF 'bc':  " + j);
        
        String s = "potato apple lemon orange";
        
        String[] vect = s.split(" ");
        
        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);
        System.out.println(vect[3]);   
    }
}
