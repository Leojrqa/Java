package program;

import java.util.Scanner;
import entities.Bank;

public class app
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Bank bank;

        System.out.print("Enter account number: ");
        int numcon = sc.nextInt();

        System.out.print("Enter account holder: ");
		sc.nextLine();
		String nome = sc.nextLine();

        System.out.print("Is there na initial deposit (y/n)? ");
        char sn = sc.next().charAt(0);

        if (sn == 'y')
        {
            System.out.print("Enter initial deposit value: ");
            double deposito = sc.nextDouble();
            bank = new Bank(numcon, nome, deposito);
        }
		else
		{
            System.out.print("Enter initial deposit value: ");
            double deposito = sc.nextDouble();
            bank = new Bank(numcon, nome, deposito);
		}

        System.out.println();

        System.out.println("Account data:");
        System.out.println(bank);

        sc.close();
    }
}