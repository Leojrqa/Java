package application;

import java.util.Scanner;
import entities.dois;

public class exercicio2 
{
    static public void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        
        dois duo = new dois();

        System.out.print("Name: ");
        duo.name = sc.nextLine();
        System.out.print("Gross salary: ");
        duo.salary = sc.nextDouble();
        System.out.print("Tax: ");
        duo.tax = sc.nextDouble();

        System.out.println();
        System.out.print("Employee: " + duo);

        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        double percent = sc.nextDouble();
        duo.total(percent);

        System.out.println();
        System.out.print("Updated data: " + duo);

        sc.close();
    }   
}
