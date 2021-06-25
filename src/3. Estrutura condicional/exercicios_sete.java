import java.util.Scanner;

public class exercicios_sete 
{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        Double x, y;

        System.out.print("Digite valor de eixo x: ");
        x = sc.nextDouble();
        System.out.print("Didite o valor de eixo y: ");
        y = sc.nextDouble();

        if (x > 0 && y > 0)
            System.out.print("Q1");
        else if (x < 0 && y > 0)
            System.out.print("Q2");
        else if (x < 0 && y < 0)
            System.out.print("Q3");
        else if (x > 0 && y < 0)
            System.out.print("Q4");
        else if (x == 0 && y == 0)
            System.out.print("Origem");
        else
            System.out.print("Fora do eixo");

        sc.close();
    }    
}
