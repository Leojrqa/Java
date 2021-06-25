package application;

import java.util.Scanner;
import entities.fix;

public class exercicio_fix 
{
    public static void main (String[] arg)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dolar = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        Double quant = sc.nextDouble();

        double result = fix.total(quant, dolar);
        System.out.printf("Amount to be paid in reais = %.2f%n", result);

        sc.close();
    }    
}
