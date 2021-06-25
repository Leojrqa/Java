import java.util.Scanner;

public class exercicio_sete 
{
    public static void main (String[] arg)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=0; i<n; i++)
        {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(y == 0)
            {
                System.out.println("divisão impossivel");
            }
            else
            {
                double total = (double) x / y;
                System.out.printf("%.1f%n", total);
            }
        }

        sc.close();
    }    
}
