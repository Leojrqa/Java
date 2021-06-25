package application;

import java.util.Scanner;
import entities.tres;

public class exercicio3 
{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);

        tres tree = new tres();

        tree.nome = sc.nextLine();
        tree.n1 = sc.nextDouble();
        tree.n2 = sc.nextDouble();
        tree.n3 = sc.nextDouble();

        System.out.printf("FINAL GRADE: %.2f%n", tree.total());
        if (tree.total() < 60.0) 
        {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", tree.resultado());
        }
        else 
        {
            System.out.println("PASS"); 
        }

        sc.close();
    }    
}
