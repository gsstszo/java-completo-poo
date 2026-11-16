package secao09.banco;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the account number: ");
        int accountNumber = sc.nextInt();

        System.out.println("Enter the account holder: ");
        String accountHolder = sc.nextLine();

        System.out.println("Is there na initial deposit (y/n)? ");
        char optionInitialDeposit = Character.toLowerCase(sc.next().charAt(0));
        
        while () {
            
            
        }
                

    }

}
