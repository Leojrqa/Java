import java.util.Scanner;

public class exercicios_um
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Digite um numero inteiro: ");
        n = sc.nextInt();

        if (n >= 0)
        {
            System.out.print("NAO NEGATIVO");
        }
        else
        {
            System.out.print("NEGATIVO");
        }

        sc.close();
    }
}