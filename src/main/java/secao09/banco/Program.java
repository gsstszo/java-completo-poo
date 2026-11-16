package secao09.banco;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter account holder: ");
        String accountHolder = sc.nextLine();

        System.out.print("Is there a initial deposit (y/n) ?");
        char optionDeposit = Character.toLowerCase(sc.next().charAt(0));

        while (optionDeposit != 'y' && optionDeposit != 'n') {
            System.out.print("invalid character, please try again (y/n) ");
            optionDeposit = Character.toLowerCase(sc.next().charAt(0));

        }

        Account account;

        if (optionDeposit == 'y') {
            System.out.println("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(accountNumber, accountHolder, initialDeposit);
        } else {
            account = new Account(accountNumber, accountHolder);

        }
        
        System.out.println();
        System.out.println("Account data: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter deposit amount: ");
        double depositAmount = sc.nextDouble();
        account.depositFunds(depositAmount);

        System.out.println();
        System.out.println("Updated account data: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter withdraw value: ");
        double withdrawValue = sc.nextDouble();
        account.withdrawBalance(withdrawValue);

        System.out.println();
        System.out.println("Updated accout data: ");
        System.out.println(account);
        
        sc.close();

    }

}
