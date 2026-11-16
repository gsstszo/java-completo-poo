package secao09.banco;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account number: ");
        int accountNumber = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter account holder: ");
        String accountHolder = sc.nextLine();

        System.out.println("Is there a initial deposit (y/n) ?");
        char optionDeposit = Character.toLowerCase(sc.next().charAt(0));

        while (optionDeposit != 'y' && optionDeposit != 'n') {
            System.out.println("invalid character, please try again (y/n) ");
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

        System.out.println("Account data: ");
        System.out.println(account);

        System.out.println("Enter deposit amount: ");
        double depositAmount = sc.nextDouble();
        account.depositFunds(depositAmount);

        System.out.println("Updated accout data: ");
        System.out.println(account);

        System.out.println("Enter withdraw value: ");
        double withdrawValue = sc.nextDouble();
        account.withdrawBalance(withdrawValue);

        System.out.println("Updated accout data: ");
        System.out.println(account);
        
        sc.close();

    }

}
