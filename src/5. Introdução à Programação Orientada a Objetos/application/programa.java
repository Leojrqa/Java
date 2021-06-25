package application;

import java.util.Scanner;
import entities.calculo;

public class programa {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        calculo calculo = new calculo();

        System.out.println("Enter rectangle width and height:");
        calculo.width = sc.nextDouble();
        calculo.height = sc.nextDouble();

        System.out.printf("AREA = %.2f%n", calculo.area());
        System.out.printf("PERIMETER = %.2f%n", calculo.perimeter());
        System.out.printf("DIAGONAL = %.2f%n", calculo.diagonal());

        sc.close();
    }
}
