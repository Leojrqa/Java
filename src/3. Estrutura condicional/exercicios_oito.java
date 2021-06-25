import java.util.Scanner;

public class exercicios_oito 
{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        Double renda, total;

        System.out.print("Quanto é a sua renda?: ");
        renda = sc.nextDouble();

        if (renda >= 0 && renda <= 2000.00 )
        {
            System.out.print("Isento");
        }
        else if (renda > 2000.01 && renda <= 3000.00)
        {
            total = (renda - 2000.0) * 0.08 ;
            System.out.printf("R$ %.2f%n", total);
        }
        else if (renda > 3000.01 && renda <= 4500.00)
        {
            total = 18 / 100 * renda;
            System.out.printf("R$ %.2f%n", total);
        }
        else if (renda > 4500.00)
        {
            total = 28 / 100 * renda;
            System.out.printf("R$ %.2f%n", total);
        }
        else
        {
            System.out.print("Erro");
        }

        sc.close();
    }    
}
