import java.util.Scanner;

public class exercicios_tres 
{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        int A, B;

        System.out.print("Digite um numero: ");
        A = sc.nextInt();
        System.out.print("Digite outro numero: ");
        B = sc.nextInt();

        if ( A % B == 0 || B % A == 0)
        {
            System.out.print("SAO MULTIPLOS");
        }
        else
        {
            System.out.print("NAO SAO MULTIPLOS");
        }

        sc.close();
    }
}
