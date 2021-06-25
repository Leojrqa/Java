import java.util.Scanner;

public class exercicios_seis 
{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        Double n;

        System.out.print("Digite um numero: ");
        n = sc.nextDouble();

        if (n >= 0 && n <= 25.00)
            System.out.print("Intervalo [0,25]");
        else if (n >= 25.00 && n <= 50.00)
            System.out.print("Intervalo [25,50]");
        else if (n >= 50.00 && n <= 75.00)
            System.out.print("Intervalo [50,75]");
        else if (n >= 75.00 && n <= 100)
            System.out.print("Intervalo [75,100]");
        else
            System.out.print("Fora do intervalo");

        sc.close();
    }   
}
