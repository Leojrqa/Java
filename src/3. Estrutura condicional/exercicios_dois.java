import java.util.Scanner;

public class exercicios_dois 
{
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);
        int n, r;

        System.out.print("Digite um numero: ");
        n = sc.nextInt();

        r = n%2;

        if (r == 0)
        {
            System.out.print("PAR");
        }
        else
        {
            System.out.print("IMPAR");
        }

        sc.close();
    }    
}
